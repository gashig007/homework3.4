package com.example.homework34;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainlandAdapter extends RecyclerView.Adapter<MainlandAdapter.MainlandViewHolder> {
    private ArrayList<Mainland> mainlands;
    private Context context;
    private OnClick onClick;

    public MainlandAdapter(ArrayList<Mainland> mainlands, Context context, OnClick onClick) {
        this.mainlands = mainlands;
        this.context = context;
        this.onClick = onClick;
    }



    @NonNull
    @Override
    public MainlandViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainlandViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mainland, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainlandViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(mainlands.get(position), context);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick.onClick(mainlands.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mainlands.size();
    }

    class MainlandViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewMainland;
        private TextView textViewMainland;

        public MainlandViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewMainland = itemView.findViewById(R.id.image_mainland);
            textViewMainland = itemView.findViewById(R.id.tv_mainland);
        }

        public void bind(Mainland mainland, Context context) {
            Glide.with(context).load(mainland.getImageMainland()).into(imageViewMainland);
            textViewMainland.setText(mainland.getTextViewMainland());
        }
    }
}
