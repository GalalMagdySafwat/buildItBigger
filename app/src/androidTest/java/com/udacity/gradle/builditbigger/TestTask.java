package com.udacity.gradle.builditbigger;

import android.test.ActivityTestCase;
import android.text.TextUtils;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class TestTask extends ActivityTestCase {


    private String Result = null;

    public void test() throws Throwable {

        final CountDownLatch signal = new CountDownLatch(1);



        final EndpointsAsyncTask task = new EndpointsAsyncTask();
        task.setListener(new EndpointsAsyncTask.EndpointsTaskListener() {
            @Override
            public void onComplete(String result) {
                Result = result;
                signal.countDown();
            }
        });

        runTestOnUiThread(new Runnable() {
            @Override
            public void run() {
                task.execute();
            }
        });

        signal.await(30, TimeUnit.SECONDS);

        assertNotNull(Result);
        assertFalse(TextUtils.isEmpty(Result));
    }
}