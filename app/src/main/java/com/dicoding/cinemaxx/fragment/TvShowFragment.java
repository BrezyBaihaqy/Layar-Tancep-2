package com.dicoding.cinemaxx.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dicoding.cinemaxx.Adapter.ListTvShowAdapter;
import com.dicoding.cinemaxx.R;
import com.dicoding.cinemaxx.tvshow.TvShow;
import com.dicoding.cinemaxx.tvshow.TvShowData;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TvShowFragment extends Fragment {
    private RecyclerView rvTVShow;
    private ArrayList<TvShow> list = new ArrayList<>();

    public TvShowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tv_show, container, false);
        rvTVShow = view.findViewById(R.id.rv_tv_show);
        rvTVShow.setHasFixedSize(true);

        list.addAll(TvShowData.getListData());
        showRecyclerTvShow();

        return view;
    }

    private void showRecyclerTvShow() {
        rvTVShow.setLayoutManager(new LinearLayoutManager(this.getContext()));
        ListTvShowAdapter listTvShowAdapter  = new ListTvShowAdapter(this.getContext());
        listTvShowAdapter.setListTVShow(list);
        rvTVShow.setAdapter(listTvShowAdapter);
    }
}
