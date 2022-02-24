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

public class FirstFragment extends Fragment implements OnClick {
    private RecyclerView recyclerView;
    private ArrayList<Mainland> mainlands;
    private MainlandAdapter mainlandAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        initRecyclerView(view);
    }

    private void initRecyclerView(View view) {
        recyclerView = view.findViewById(R.id.recycler);
        mainlandAdapter = new MainlandAdapter(mainlands,requireContext(), this);
        recyclerView.setAdapter(mainlandAdapter);
    }

    private void loadData() {
        mainlands = new ArrayList<>();
        mainlands.add(new Mainland(R.drawable.ic_first_mainland, "North America"));
        mainlands.add(new Mainland(R.drawable.ic_second_mainland, "South America"));
        mainlands.add(new Mainland(R.drawable.ic_third_mainland, "Africa"));
        mainlands.add(new Mainland(R.drawable.ic_fourth_mainland, "Antarctica"));
        mainlands.add(new Mainland(R.drawable.ic_fifth_mainland, "Eurasia"));
        mainlands.add(new Mainland(R.drawable.ic_sixth_mainland, "Australia"));
    }

    @Override
    public void onClick(Mainland mainland) {
        Bundle bundle = new Bundle();
        bundle.putString("text", mainland.getTextViewMainland());
        Fragment fragment = new SecondFragment();
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_main, fragment).addToBackStack(null).commit();
    }
}