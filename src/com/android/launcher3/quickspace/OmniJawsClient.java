package com.android.launcher3.quickspace;

import android.content.Context;
import android.graphics.drawable.Drawable;

/** Stub: weather client is not available on this ROM. */
public final class OmniJawsClient {
    public static final int EXTRA_ERROR_DISABLED = 2;

    public interface OmniJawsObserver {
        void weatherUpdated();
        void weatherError(int errorReason);
        void updateSettings();
    }

    public static class WeatherInfo {
        public String city;
        public String temp;
        public String tempUnits;
        public String condition;
        public int conditionCode;
    }

    public static OmniJawsClient get() { return null; }
    public void queryWeather(Context c) {}
    public WeatherInfo getWeatherInfo() { return null; }
    public Drawable getWeatherConditionImage(Context c, int code) { return null; }
    public void addObserver(Context c, OmniJawsObserver o) {}
    public void removeObserver(Context c, OmniJawsObserver o) {}
    public boolean isOmniJawsEnabled(Context c) { return false; }
}
