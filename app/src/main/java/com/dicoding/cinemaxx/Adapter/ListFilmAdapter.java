package com.dicoding.cinemaxx.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.cinemaxx.R;
import com.dicoding.cinemaxx.film.DetailFilmActivity;
import com.dicoding.cinemaxx.film.Film;

import java.util.ArrayList;

public class ListFilmAdapter extends RecyclerView.Adapter<ListFilmAdapter.ListViewHolder> {
    private ArrayList<Film> listFilm;
    private Context context;

    public ArrayList<Film> getListFilm(){
        return listFilm;
    }

    public void setListFilm(ArrayList<Film> listFilm) {
        this.listFilm = listFilm;
    }

    public ListFilmAdapter(Context context) {
        this.context = context;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_film, viewGroup, false);
        return new ListViewHolder(view);


    }

    @Override
    public void onBindViewHolder(final ListViewHolder holder, int position) {
        final Film film = listFilm.get(position);

        Glide.with(holder.itemView.getContext())
                .load(film.getPhoto())
                .apply(new RequestOptions())
                .into(holder.imgFilm);

        holder.filmName.setText(film.getName());
        holder.filmDescription.setText(film.getDescription());
    }

    @Override
    public int getItemCount() {
        return listFilm.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView filmName, filmDescription;
        private ImageView imgFilm;

        ListViewHolder(@NonNull final View itemView) {
            super(itemView);

            imgFilm = itemView.findViewById(R.id.img_film);
            filmName = itemView.findViewById(R.id.film_name);
            filmDescription = itemView.findViewById(R.id.film_description);


            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            Film film = getListFilm().get(position);

            //tanpa ini tidak bisa berpindah
            film.setName(film.getName());
            film.setDescription(film.getDescription());

            Intent intentFilm = new Intent(itemView.getContext(), DetailFilmActivity.class);
            intentFilm.putExtra(DetailFilmActivity.EXTRA_FILM, film);
            context.startActivity(intentFilm);
        }
    }
}
