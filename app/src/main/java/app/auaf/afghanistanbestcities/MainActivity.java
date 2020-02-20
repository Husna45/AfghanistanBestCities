package app.auaf.afghanistanbestcities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvcities;

    LinearLayoutManager layoutManager;
    String names[]={"Badakhshan","Badghis","Baghlan","Balkh","Bamyan","Daykundi","Farah","Faryab","Ghazni","Ghor","Helmand","Herat","Jawzjan","Kandahar","Kabul","Kapisa","Khost","Kunar","Kunduz", "Laghman","Logar","Nangarhar","Nimruz","Nooristan","Paktia","Paktika","Panjsher","Parwan", "Samangan","Sar-e-Pol","Takhar","Urozgan","Wardak","Zabul"};
    int photos[]={R.drawable.jalalabad, R.drawable.badghis, R.drawable.baghlan, R.drawable.balkh,R.drawable.bamyan, R.drawable.daykundi,R.drawable.farah,R.drawable.faryab,R.drawable.ghazni,R.drawable.ghor,R.drawable.helmand,R.drawable.herat,R.drawable.jawzjan,R.drawable.kandahar,R.drawable.kabul,R.drawable.kapisa,R.drawable.khost,R.drawable.kunar,R.drawable.kunduz,R.drawable.laghman,R.drawable.logar,R.drawable.nangarhar,R.drawable.nimruz,R.drawable.nuristan,R.drawable.paktia,R.drawable.paktika,R.drawable.panjsher,R.drawable.parwan,R.drawable.samangan,R.drawable.sarepol,R.drawable.takhar,R.drawable.urozgan,R.drawable.wardak,R.drawable.zabul};

   citiesAdapter citiesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvcities=findViewById(R.id.rvcities);


        layoutManager= new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
        rvcities.setLayoutManager(layoutManager);

        rvcities.setLayoutManager(layoutManager);


        citiesAdapter=new citiesAdapter(names, photos,MainActivity.this);
        rvcities.setAdapter(citiesAdapter);






    }
}
