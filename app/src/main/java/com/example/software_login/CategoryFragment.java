package com.example.software_login;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class CategoryFragment extends Fragment {

    RecyclerView recyclerView;
    MovieAdapter adapter;
    ArrayList<MovieModel> movies;

    public CategoryFragment() {

    }


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e("welocome to ","our fragm");
        //TODO : first bug
        MovieModel model = new MovieModel();
        MovieModel model1 = new MovieModel();
        movies.add(new MovieModel("End Game", 2019));
        movies.add(new MovieModel("Infinity war", 2018));
        movies.add(new MovieModel("DeadPool", 2016));
        recyclerView = container.findViewById(R.id.recycler_view);
        adapter = new MovieAdapter(movies);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return inflater.inflate(R.layout.fragment_category, container, false);
    }

}
