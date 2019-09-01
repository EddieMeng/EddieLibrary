package cn.meng.application.concurrent;

import android.os.AsyncTask;

public class AsynTaskExample {

    public AsynTaskExample() {
        AsyncTask<String, Integer, Integer> asyncTask = new AsyncTask<String, Integer, Integer>() {
            @Override
            protected Integer doInBackground(String... strings) {
                return null;
            }


            @Override
            protected void onPreExecute() {
                super.onPreExecute();
            }

            @Override
            protected void onPostExecute(Integer integer) {
                super.onPostExecute(integer);
            }

            @Override
            protected void onProgressUpdate(Integer... values) {
                super.onProgressUpdate(values);
            }

        };
        asyncTask.execute();
    }
}
