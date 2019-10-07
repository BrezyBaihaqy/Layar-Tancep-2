package com.dicoding.cinemaxx.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.cinemaxx.R;
import com.dicoding.cinemaxx.tvshow.TvShow;
import com.dicoding.cinemaxx.tvshow.TvShowDetailActivity;

import java.util.ArrayList;

public class ListTvShowAdapter extends RecyclerView.Adapter<ListTvShowAdapter.ListTvViewHolder> {
    private ArrayList<TvShow> listTVShow;
    private Context context;


    public ArrayList<TvShow> getListTVShow() {
        return listTVShow;
    }

    public void setListTVShow(ArrayList<TvShow> listTVShow) {
        this.listTVShow = listTVShow;
    }

    public ListTvShowAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public ListTvViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_tv_show, viewGroup, false);
        return new ListTvViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListTvViewHolder holder, int position) {
        TvShow tvShow = listTVShow.get(position);

        Glide.with(holder.itemView.getContext())
                .load(tvShow.getTvshowphoto())
                .apply(new RequestOptions())
                .into(holder.imgTVShow);

        holder.tvShowName.setText(tvShow.getTvshowname());
        holder.tvShowDescription.setText(tvShow.getTvshowdescription());

        holder.imgTVShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(), listTVShow.get(holder.getAdapterPosition()).getTvshowname(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listTVShow.size();
    }

    class ListTvViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView tvShowName, tvShowDescription;
        private ImageView imgTVShow;

        ListTvViewHolder(View itemView) {
            super(itemView);

            imgTVShow = itemView.findViewById(R.id.img_tv_show);
            tvShowName = itemView.findViewById(R.id.tv_show_name);
            tvShowDescription = itemView.findViewById(R.id.tv_show_description);


            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            TvShow tvShow = getListTVShow().get(position);

            tvShow.setTvshowname(tvShow.getTvshowname());
            tvShow.setTvshowdescription(tvShow.getTvshowdescription());

            Intent intentTV = new Intent(itemView.getContext(), TvShowDetailActivity.class);
            intentTV.putExtra(TvShowDetailActivity.EXTRA_TV_SHOW, tvShow);
            context.startActivity(intentTV);
        }
    }
}
