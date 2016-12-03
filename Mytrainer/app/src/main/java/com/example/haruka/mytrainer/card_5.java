package com.example.haruka.mytrainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
public class card_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_5);

    }
    @Override
    public void onStart(){
        super.onStart();
        ImageView img = (ImageView) findViewById(R.id.specialstar);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.animstar);
        //Tweenアニメーションの適用
        animation.setFillAfter(true);   //終了後を保持
        animation.setFillEnabled(true);
        img.startAnimation(animation);

    }
}
