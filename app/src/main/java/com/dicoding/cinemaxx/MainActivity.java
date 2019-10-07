package com.dicoding.cinemaxx;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.dicoding.cinemaxx.fragment.FilmFragment;
import com.dicoding.cinemaxx.fragment.TvShowFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager; FragmentTransaction fragmentTransaction;
    FilmFragment filmFragment; TvShowFragment tvShowFragment;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

        fragmentManager = getSupportFragmentManager();
        filmFragment = new FilmFragment();
        tvShowFragment = new TvShowFragment();

        setFilmFragment();

        if (savedInstanceState == null) {
            bottomNavigationView.setSelectedItemId(R.id.nav_film);
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.nav_film:
                    setFilmFragment();
                    return true;
                case R.id.nav_tv_show:
                    setTvShowFragment();
                    return true;
            }
            return false;
        }
    };


    private void setFilmFragment() {
        setTitle("Film");

        fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = fragmentManager.findFragmentByTag(FilmFragment.class.getSimpleName());

        if (!(fragment instanceof FilmFragment)){
            fragmentTransaction.replace(
                    R.id.container_layout, filmFragment,
                    FilmFragment.class.getSimpleName()
            );
            fragmentTransaction.commit();
        }
    }

    private void setTvShowFragment() {
        setTitle("TV Show");

        fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = fragmentManager.findFragmentByTag(TvShowFragment.class.getSimpleName());

        if (!(fragment instanceof FilmFragment)){
            fragmentTransaction.replace(
                    R.id.container_layout, tvShowFragment,
                    TvShowFragment.class.getSimpleName()
            );
            fragmentTransaction.commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_change_settings){
            Intent mIntent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(mIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}
