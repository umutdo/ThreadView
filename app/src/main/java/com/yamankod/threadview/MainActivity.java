package com.yamankod.threadview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 =(TextView)findViewById(R.id.tv1);

        Thread  thread1= new Thread(){

            public void run(){
                    for (int i =0; i<=10; i++){

                        try {

                            sleep(100);
                            tv1.setText("Thread View Kullanma : "+i);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }


            }

        };
        thread1.start();



    }
}
