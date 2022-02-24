package com.example.homework34;

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

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {
    private ArrayList<Country> countries;
    private Context context;

    public CountryAdapter(ArrayList<Country> countries, Context context) {
        this.countries = countries;
        this.context = context;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(countries.get(position), context);
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }


    class CountryViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewCountry;
        private TextView textViewCountry;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewCountry = itemView.findViewById(R.id.image_country);
            textViewCountry = itemView.findViewById(R.id.tv_country);
        }

        public void bind(Country country, Context context) {
            Glide.with(context).load(country.getImageCountry()).into(imageViewCountry);
            textViewCountry.setText(country.getTextViewCountry());
        }
    }
}
