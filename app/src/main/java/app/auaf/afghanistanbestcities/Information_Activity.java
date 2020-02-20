package app.auaf.afghanistanbestcities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Information_Activity extends AppCompatActivity {

    TextView etnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);

        etnext=findViewById(R.id.etnext);



        etnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Information_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
