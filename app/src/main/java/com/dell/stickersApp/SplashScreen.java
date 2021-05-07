package com.dell.stickersApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {
    private static int Splash_Time_Out=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        if (getSupportActionBar() != null)
            getSupportActionBar().hide();

        LottieAnimationView animationView
                = findViewById(R.id.lottieAnim);
        animationView
                .addAnimatorUpdateListener(
                        (animation) -> {
                            // Do something.
                        });
        animationView
                .playAnimation();



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                            Intent intent=new Intent(SplashScreen.this, EntryActivity.class);
                            startActivity(intent);
                            finish();
                        }

            },Splash_Time_Out);
}

}