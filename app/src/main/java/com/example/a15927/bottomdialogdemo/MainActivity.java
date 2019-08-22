package com.example.a15927.bottomdialogdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_click_showbottomdialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_click_showbottomdialog = findViewById(R.id.btn_click_showbottomdialog);
        btn_click_showbottomdialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Dialogchoosephoto(MainActivity.this){
                    @Override
                    public void btnPickByTake(){
                        //拍照
                        //点击拍照时做的事
                        Toast.makeText(MainActivity.this,"点击了拍照",Toast.LENGTH_SHORT).show();
                    }
                    @Override
                    public void btnPickBySelect() {
                        //相册
                        //点击相册时做的事
                        Toast.makeText(MainActivity.this,"点击了相册",Toast.LENGTH_SHORT).show();
                    }

                }.show();
            }
        });
    }
}
