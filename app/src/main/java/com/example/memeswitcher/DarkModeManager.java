package com.example.memeswitcher;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatDelegate;

public class DarkModeManager {

    final static int Day = AppCompatDelegate.MODE_NIGHT_NO;
    final static int Night = AppCompatDelegate.MODE_NIGHT_YES;

    SharedPreferences sharedPreferences;

    public DarkModeManager(Context context) {
        sharedPreferences = context.getSharedPreferences("Dark Mode", Context.MODE_PRIVATE);
        setMode(getMode());
    }


    public void setMode(int mode) {
        AppCompatDelegate.setDefaultNightMode(mode);
        sharedPreferences.edit().putInt("mode", mode).apply();
    }


    public int getMode() {
        return sharedPreferences.getInt("mode", Day);
    }

    public void toggle() {



        setMode(getMode() == Day ? Night : Day); //Wenn Tagmodus aktiv ist, dann Nachtmodus.
    }
}
