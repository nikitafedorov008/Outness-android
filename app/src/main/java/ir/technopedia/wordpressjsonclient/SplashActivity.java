package ir.technopedia.wordpressjsonclient;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import ir.technopedia.wordpressjsonclient.util.Util;

public class SplashActivity extends AppCompatActivity {

    ImageView imageView1;
    Intent intent;
    Animation animFadeIn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView1 = (ImageView) findViewById(R.id.image1);

        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.animation_fade_in);
        // set animation listener
        imageView1.startAnimation(animFadeIn);

        onAnimationStart(animFadeIn);
        onAnimationEnd(animFadeIn);
    }

    @Override
    protected void onStart() {
        super.onStart();

        /*intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();*/
    }

    @Override
    public void onBackPressed() {
        this.finish();
        super.onBackPressed();
    }

    public void onAnimationStart(Animation animation) {
        //under Implementation
    }

    public void onAnimationEnd(Animation animation) {
        // Start Main Screen
        Intent i = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(i);
        this.finish();
    }

    public void onAnimationRepeat(Animation animation) {
        //under Implementation
    }
}
