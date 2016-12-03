package com.example.haruka.mytrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;
import android.widget.MediaController;
import android.net.Uri;

public class Play_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_3);


        VideoView videoView = (VideoView) findViewById(R.id.videoView3);
        Uri videopath = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.relax);
        videoView.setVideoURI(videopath);


        Button sendButton2 = (Button) findViewById(R.id.playvideo);
        sendButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button sendButton2 = (Button) findViewById(R.id.playvideo);
                sendButton2.setVisibility(View.INVISIBLE);
                VideoView videoView = (VideoView) findViewById(R.id.videoView3);
                videoView.start();
            }
        });

        Button sendButton = (Button) findViewById(R.id.tofin);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),osusume_2.class);
                intent.putExtra("RESULT", 1);
                setResult(3, intent);
                startActivity(intent);

            }
        });
    }
}
