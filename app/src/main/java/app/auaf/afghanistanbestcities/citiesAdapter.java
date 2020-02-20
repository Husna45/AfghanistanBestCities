package app.auaf.afghanistanbestcities;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import app.auaf.afghanistanbestcities.Provinces_Activity.Badakhshan_Activity;
import app.auaf.afghanistanbestcities.Provinces_Activity.Badghis_Activity;
import app.auaf.afghanistanbestcities.Provinces_Activity.Baghlan_Activity;
import app.auaf.afghanistanbestcities.Provinces_Activity.Balk_Activity;
import app.auaf.afghanistanbestcities.Provinces_Activity.Bamyan_Activity;

public class citiesAdapter extends RecyclerView.Adapter<citiesAdapter.citiesItemViewHolder> {

      String names[];
      int photos[];
    CardView cardView;
    Context context;

    public citiesAdapter(String[] names, int[] photo, Context context){
        this.names= names;
        this.photos=photo;
        this.cardView= cardView;
        this.context= context;

    }

    @NonNull
    @Override
    public citiesItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cities_item,parent,false);

        return new citiesItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull citiesItemViewHolder holder, final int position) {

        holder.tvnameee.setText(names[position]);
        holder.ivphoto.setImageResource(photos[position]);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (position) {

                    case 0:

                        Intent intent = new Intent(context, Badakhshan_Activity.class);
                        context.startActivity(intent);
                        break;

                    case 1:
                        Intent intent1 = new Intent(context, Badghis_Activity.class);
                        context.startActivity(intent1);
                    case 2:
                        Intent intent2 = new Intent(context, Baghlan_Activity.class);

                        context.startActivity(intent2);
                    case 3:
                        Intent intent4 = new Intent(context, Balk_Activity.class);
                        context.startActivity(intent4);

                    case 4:
                        Intent intent5 = new Intent(context, Bamyan_Activity.class);
                        context.startActivity(intent5);


                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return names.length;

    }

    public class citiesItemViewHolder extends RecyclerView.ViewHolder{

        ImageView ivphoto;
        TextView  tvnameee;
        CardView cardView;

        public citiesItemViewHolder(View itemView){
             super(itemView);

             ivphoto=itemView.findViewById(R.id.ivphoto);
             tvnameee=itemView.findViewById(R.id.tvnameee);
            cardView=itemView.findViewById(R.id.cvcities);

        }
    }
}
