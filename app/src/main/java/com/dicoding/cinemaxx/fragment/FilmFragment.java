package com.dicoding.cinemaxx.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dicoding.cinemaxx.Adapter.ListFilmAdapter;
import com.dicoding.cinemaxx.R;
import com.dicoding.cinemaxx.film.Film;
import com.dicoding.cinemaxx.film.FilmData;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FilmFragment extends Fragment {
    private RecyclerView rvFilm;
    private ArrayList<Film> list = new ArrayList<>();

    public FilmFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_film,container, false);
        rvFilm = view.findViewById(R.id.rv_film);
        rvFilm.setHasFixedSize(true);

        list.addAll(FilmData.getListData());
        showRecyclerFilm();

        return view;
    }

    private void showRecyclerFilm() {
        rvFilm.setLayoutManager(new LinearLayoutManager(this.getContext()));
        ListFilmAdapter listFilmAdapter = new ListFilmAdapter(this.getContext());
        listFilmAdapter.setListFilm(list);
        rvFilm.setAdapter(listFilmAdapter);
    }

}
