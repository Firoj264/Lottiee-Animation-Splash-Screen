package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {
    ImageView love;
    TextView textView;
    LottieAnimationView lottieAnimationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        love=findViewById(R.id.logo);
        textView=findViewById(R.id.text);
        lottieAnimationView=findViewById(R.id.lottie);
        love.animate().translationY(-1600).setDuration(2500).setStartDelay(4000);
        textView.animate().translationX(1400).setDuration(2500).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1400).setDuration(2500).setStartDelay(4000);

        Thread thread=new Thread(){
            public void run(){
                try{
                    sleep(4000);
                }
                catch (Exception e){
                    e.printStackTrace();

                }
                finally {
                    Intent intent=new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);
                    finish();

                }

            }

        };thread.start();
    }
}