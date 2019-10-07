package com.dicoding.cinemaxx.tvshow;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.cinemaxx.R;

public class TvShowDetailActivity extends AppCompatActivity {
    public static final String EXTRA_TV_SHOW = "extra_tvShow";

    TextView tvTitle, tvOverview, tvGenre, tvArtist;
    ImageView imgTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_show_detail);

        tvTitle = findViewById(R.id.tv_show_title);
        tvOverview = findViewById(R.id.detail_sinopsis);
        tvGenre = findViewById(R.id.tv_show_genre);
        tvArtist = findViewById(R.id.tv_show_detail_cast);
        imgTV = findViewById(R.id.tv_show_poster);

        TvShow tvShow = getIntent().getParcelableExtra(EXTRA_TV_SHOW);

        tvTitle.setText(tvShow.getTvshowname());
        tvGenre.setText(tvShow.getTvshowgenre());
        tvArtist.setText(tvShow.getTvshowartist());
        tvOverview.setText(tvShow.getTvshowdescription());

        Glide.with(this)
                .load(tvShow.getTvshowphoto())
                .apply(new RequestOptions())
                .into(imgTV);

    }
}
