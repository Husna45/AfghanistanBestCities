package app.auaf.afghanistanbestcities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Screen_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen_);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent intent=new Intent(Splash_Screen_Activity.this, Login_Activity.class);
                startActivity(intent);
                finish();

            }
        },7000);
    }
}
