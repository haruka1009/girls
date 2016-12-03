package com.example.haruka.mytrainer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class osusume_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osusume_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button sendButton = (Button) findViewById(R.id.to_Play);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),Play_3.class);
                int requestCode=2;
                startActivityForResult(intent,requestCode);
            }
        });
        Intent intent=getIntent();
        int res = intent.getIntExtra("RESULT", 0);
        if(res==1){
            Intent intent2 = new Intent(getApplication(),otsukare_4.class);
            startActivity(intent2);
        }

    }
//    protected void onActivityResult(int requestCode, int resultCode, Intent intent){
//        super.onActivityResult(requestCode, resultCode, intent);
//        // 受け取るためのコード
//        int res = intent.getIntExtra("RESULT", 0);
//        if(res==1){
//            Intent intent2 = new Intent(getApplication(),otsukare_4.class);
//            startActivity(intent2);
//        }
//    }

}
