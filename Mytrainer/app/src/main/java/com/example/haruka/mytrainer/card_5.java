package com.example.haruka.mytrainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
public class card_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_5);
//        ImageView img = (ImageView) findViewById(R.id.specialstar);
//        Animation animation= AnimationUtils.loadAnimation(this,R.anim.animstar);
//        //Tweenアニメーションの適用
//        animation.setFillAfter(true);   //終了後を保持
//        animation.setFillEnabled(true);
//        img.startAnimation(animation);

    }
    @Override
    public void onStart(){
        super.onStart();
            ImageView img = (ImageView) findViewById(R.id.specialstar);
            ScaleAnimation scale = new ScaleAnimation(10, 0.5f, 10, 0.5f); // imgを1倍から0.5倍に縮小
            scale.setDuration(2000); // 3000msかけてアニメーションする
            scale.setFillAfter(true);   //終了後を保持
            img.startAnimation(scale); // アニメーション適用

//        ImageView img = (ImageView) findViewById(R.id.specialstar);
//        Animation animation= AnimationUtils.loadAnimation(this,R.anim.animstar);
//        //Tweenアニメーションの適用
//        animation.setFillAfter(true);   //終了後を保持
//        animation.setFillEnabled(true);
//        img.startAnimation(animation);

    }
}
