package com.example.software_login;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    ArrayList<MovieModel> list;

    MovieAdapter(ArrayList<MovieModel> list) {
        this.list = list;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        //TODO 2: you have got a second bug here :'D
        MovieModel ml = list.get(position);
        viewHolder.movieName.setText(ml.getMovieName());
        viewHolder.poster.setImageResource(ml.getPoster());
        viewHolder.releaseDate.setText(ml.getReleaseDate());
    }

    @Override
    public int getItemCount() {
        if (list == null) {
            return 0;
        }

        return list.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView movieName;
        TextView releaseDate;
        ImageView poster;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            movieName = itemView.findViewById(R.id.movieName);
            releaseDate = itemView.findViewById(R.id.releaseDate);
            poster = itemView.findViewById(R.id.poster);

        }
    }
}
