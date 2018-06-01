package com.example.administrator.threaddemo;

import android.util.Log;

public class MyThread extends Thread{
    public synchronized void xuat(){
        for(int i=1;i<=10;i++){
            Log.d("kiemtra",Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void run() {
        super.run();
        xuat();
    }
}
