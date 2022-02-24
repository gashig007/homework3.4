package com.example.homework34;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements OnClick {
    private RecyclerView recyclerView1;
    private MainlandAdapter countryAdapter;
    private ArrayList<Mainland> countries;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        initRecyclerView(view);
    }

    private void initRecyclerView(View view) {
        recyclerView1 = view.findViewById(R.id.recycler1);
        countryAdapter = new MainlandAdapter(countries, requireContext(), this);
        recyclerView1.setAdapter(countryAdapter);
    }

    private void loadData() {
        countries = new ArrayList<>();
        Bundle bundle = getArguments();
        switch (bundle.getString("text")) {
            case "North America":
                countries.add(new Mainland(R.drawable.ec_south_america, "Es"));
                countries.add(new Mainland(R.drawable.ic_ar_south_america, "Argentina"));
                countries.add(new Mainland(R.drawable.ic_bo_south_america, "Bolivia"));
                countries.add(new Mainland(R.drawable.ic_br_south_america, "Brazil"));
                countries.add(new Mainland(R.drawable.ic_gy_south_america, "Guyana"));
                break;
            case "South America":
                countries.add(new Mainland(R.drawable.ic_ag_north_america, "Ag"));
                countries.add(new Mainland(R.drawable.ic_canada_north_america, "Canada"));
                countries.add(new Mainland(R.drawable.ic_fi_north_america, "Fi"));
                countries.add(new Mainland(R.drawable.ic_is_north_america, "Brazil"));
                countries.add(new Mainland(R.drawable.ic_us_north_america, "Guyana"));
                break;
            case "Africa":
                countries.add(new Mainland(R.drawable.ic_ao_africa, "Ao"));
                countries.add(new Mainland(R.drawable.ic_bf_africa, "Canada"));
                countries.add(new Mainland(R.drawable.ic_bj_africa, "Bj"));
                countries.add(new Mainland(R.drawable.ic_bw_africa, "Brazil"));
                countries.add(new Mainland(R.drawable.ic_dz_africa, "Guyana"));
                break;
            case "Antarctica":
                countries.add(new Mainland(R.drawable.ic_fourth_mainland, "no country"));
                break;
            case "Eurasia":
                countries.add(new Mainland(R.drawable.ic_china, "China"));
                countries.add(new Mainland(R.drawable.ic_russia, "Canada"));
                countries.add(new Mainland(R.drawable.ic_japan, "Japan"));
                countries.add(new Mainland(R.drawable.ic_kg, "Brazil"));
                countries.add(new Mainland(R.drawable.ic_kr, "Guyana"));
                break;
            case "Australia":
                countries.add(new Mainland(R.drawable.ic_au_australia, "Australia"));
                break;
        }

    }

    @Override
    public void onClick(Mainland mainland) {

    }
}