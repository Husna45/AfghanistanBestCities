package app.auaf.afghanistanbestcities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login_Activity extends AppCompatActivity {

   Button btnlogin;
   Button btnREG;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);


        btnlogin=findViewById(R.id.btnlogin);
        btnREG=findViewById(R.id.btnREG);



        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Login_Activity.this,Information_Activity.class);
                startActivity(intent);
            }
        });

        btnREG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Login_Activity.this,SignUp_Activity.class);
                startActivity(intent);
            }
        });

    }
}
