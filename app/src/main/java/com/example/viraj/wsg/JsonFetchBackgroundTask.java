package com.example.viraj.wsg;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by Inspiron on 10-04-2016.
 */
class JsonFetchBackgroundTask extends AsyncTask<String,Void,String>
{
    String json_Url,json_string;

    public AsyncResponse delegate=null;
    @Override
    protected void onPreExecute() {
        json_Url="http://192.168.201.1/logindb/json_get_data.php";
    }

    @Override
    protected String doInBackground(String... params) {
        String query=params[0];
        try {
            URL url=new URL(json_Url);
            HttpURLConnection httpURLConnection =(HttpURLConnection) url.openConnection();


            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream=httpURLConnection.getOutputStream();
            BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
            String data = URLEncoder.encode("query", "UTF-8") + "=" + URLEncoder.encode(query, "UTF-8");
            bufferedWriter.write(data);
            bufferedWriter.flush();
            bufferedWriter.close();

            InputStream inputStream=httpURLConnection.getInputStream();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder stringBuilder=new StringBuilder();
            while( (json_string=bufferedReader.readLine())!=null)
            {

                stringBuilder.append(json_string+"\n");
            }
            bufferedReader.close();
            inputStream.close();
            httpURLConnection.disconnect();
            return stringBuilder.toString().trim();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String result) {
        delegate.processFinish(result);

    }
}
