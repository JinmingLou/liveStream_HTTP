package com.example.zhangyang.ijktest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    public Button cctv1;
    public Button cctv2;
    public Button cctv4;
    public Button cctv7;
    public Button cctv10;
    public EditText enterChannel;
    public Button jumpChannel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cctv1 = (Button) findViewById(R.id.ijk_lib__button1);
        cctv2 = (Button) findViewById(R.id.ijk_lib__button2);
        cctv4 = (Button) findViewById(R.id.ijk_lib__button4);
        cctv7 = (Button) findViewById(R.id.ijk_lib__button7);
        cctv10 = (Button) findViewById(R.id.ijk_lib__button10);
        enterChannel = (EditText) findViewById(R.id.ijk_lib__enterChannel);
        jumpChannel = (Button) findViewById(R.id.ijk_lib__jumpChannel);

        cctv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TVChannel.tv = "http://ivi.bupt.edu.cn/hls/cctv1.m3u8";
                Intent intent = new Intent();
                intent.setClass(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        cctv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TVChannel.tv = "http://ivi.bupt.edu.cn/hls/cctv2.m3u8";
                Intent intent = new Intent();
                intent.setClass(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        cctv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TVChannel.tv = "http://ivi.bupt.edu.cn/hls/cctv4.m3u8";
                Intent intent = new Intent();
                intent.setClass(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        cctv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TVChannel.tv = "http://ivi.bupt.edu.cn/hls/cctv7.m3u8";
                Intent intent = new Intent();
                intent.setClass(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        cctv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TVChannel.tv = "http://ivi.bupt.edu.cn/hls/cctv10.m3u8";
                Intent intent = new Intent();
                intent.setClass(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        cctv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TVChannel.tv = "http://ivi.bupt.edu.cn/hls/cctv10.m3u8";
                Intent intent = new Intent();
                intent.setClass(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        jumpChannel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TVChannel.tv = enterChannel.getText().toString();
                Intent intent = new Intent();
                intent.setClass(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}