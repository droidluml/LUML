package com.project.rns.luml;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by sw407 on 28/07/2016.
 */
public class Splash extends Activity{
    private static int SPLASH_TIME_OUT = 1500;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
              Intent i = new Intent(Splash.this, MainActivity.class);
              startActivity(i);
              finish();
          }

          }, SPLASH_TIME_OUT);
      }
}
