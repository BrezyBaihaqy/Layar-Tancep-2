package com.dicoding.cinemaxx.film;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.cinemaxx.R;

public class DetailFilmActivity extends AppCompatActivity {
    public static final String EXTRA_FILM = "extra_film";

    TextView filmTitle, filmOverview, filmGenre, filmArtist;
    ImageView imgFilm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_film);

        filmTitle = findViewById(R.id.tv_film_title);
        filmOverview = findViewById(R.id.tv_sinopsis);
        imgFilm = findViewById(R.id.tv_film_poster);
        filmGenre = findViewById(R.id.tv_film_genre);
        filmArtist = findViewById(R.id.tv_film_detail_cast);

        Film film = getIntent().getParcelableExtra(EXTRA_FILM);

        filmTitle.setText(film.getName());
        filmOverview.setText(film.getDescription());
        filmGenre.setText(film.getGenre());
        filmArtist.setText(film.getArtist());

        Glide.with(this)
                .load(film.getPhoto())
                .apply(new RequestOptions())
                .into(imgFilm);

    }
}