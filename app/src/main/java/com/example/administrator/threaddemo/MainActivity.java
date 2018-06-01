package com.example.administrator.threaddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyThread myThread=new MyThread();
        myThread.setName("tt1");
        MyThread myThread1=new MyThread();
        myThread1.setName("tt2");
        MyThread myThread2=new MyThread();
        myThread2.setName("tt3");
        myThread.start();
//        try {
//            myThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        myThread1.start();
//        try {
//            myThread1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        myThread2.start();
    }
}
