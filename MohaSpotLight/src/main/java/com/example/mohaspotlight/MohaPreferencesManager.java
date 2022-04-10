package com.example.mohaspotlight;

import android.content.Context;
import android.content.SharedPreferences;

public class MohaPreferencesManager {

    private static final String PREFERENCES_NAME = "spotlight_view_preferences";

    private SharedPreferences sharedPreferences;

    public MohaPreferencesManager(Context context) {
        sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
    }

    public boolean isDisplayed(String id) {
        return sharedPreferences.getBoolean(id, false);
    }

    public void setDisplayed(String id) {
        sharedPreferences.edit().putBoolean(id, true).apply();
    }

    public void reset(String id) {
        sharedPreferences.edit().remove(id).apply();
    }

    public void resetAll() {
        sharedPreferences.edit().clear().apply();
    }
}
