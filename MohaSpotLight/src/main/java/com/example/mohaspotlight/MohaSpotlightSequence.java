package com.example.mohaspotlight;

/**
 * Created by Moha.
 */

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Class responsible for performing a sequence of
 * spotlight animations one after the other.
 */
public class MohaSpotlightSequence {

    private Activity activity;
    private MohaSpotlightConfig config;
    private Queue<com.indimed.babyyodas.utils.spotligh.MohaSpotlightView.Builder> queue;

    private static MohaSpotlightSequence instance;
    private final String TAG = "Tour Sequence";

    /**
     * Creates an instance of SpotlightSequence
     * with an empty queue and a {@link MohaSpotlightConfig} configuration
     *
     * @param activity where this sequence will be executed
     * @param config   {@link MohaSpotlightConfig}
     */
    private MohaSpotlightSequence(Activity activity, MohaSpotlightConfig config) {
        Log.d(TAG, "NEW TOUR_SEQUENCE INSTANCE");
        this.activity = activity;
        setConfig(config);
        queue = new LinkedList<>();
    }

    /**
     * Retriebes the current instance of SpotlightSequence
     *
     * @param activity where this sequence will be executed
     * @param config   {@link MohaSpotlightConfig}
     * @return If no instance was found. {@link MohaSpotlightSequence ()} will be called.
     */
    public static MohaSpotlightSequence getInstance(Activity activity, MohaSpotlightConfig config) {
        if (instance == null) {
            instance = new MohaSpotlightSequence(activity, config);
        }
        return instance;
    }

    /**
     * Adds a new SpotlightView.Builder object to {@link this.queue}
     *
     * @param target   View where the spotlight will focus
     * @param title    Spotlight title
     * @param subtitle Spotlight subtitle
     *                 * @param usageId id used to store the SpotlightView in {@link java.util.prefs.Preferences}
     * @return SpotlightSequence instance
     */
    public MohaSpotlightSequence addSpotlight(View target, String title, String subtitle, String usageId,Integer gravity) {
        Log.d(TAG, "Adding " + usageId);
        com.indimed.babyyodas.utils.spotligh.MohaSpotlightView.Builder builder = new com.indimed.babyyodas.utils.spotligh.MohaSpotlightView.Builder(activity)
                .setConfiguration(config)
                .headingTvText(title)
                .usageId(usageId)
                .headingTvGravity(gravity)
                .subHeadingTvText(subtitle)
                .target(target)
                .setListener(new MohaSpotlightListener() {
                    @Override
                    public void onUserClicked(String s) {
                        playNext();
                    }
                })
                .enableDismissAfterShown(true);
        queue.add(builder);
        return instance;
    }

    /**
     * Adds a new SpotlightView.Builder object to {@link this.queue}
     *
     * @param target        View where the spotlight will focus
     * @param titleResId    Spotlight title
     * @param subTitleResId Spotlight subtitle
     * @param usageId       id used to store the SpotlightView in {@link MohaPreferencesManager}
     * @return SpotlightSequence instance
     */
    public MohaSpotlightSequence addSpotlight(@NonNull View target, int titleResId, int subTitleResId, String usageId) {
        String title = activity.getString(titleResId);
        String subtitle = activity.getString(subTitleResId);
        com.indimed.babyyodas.utils.spotligh.MohaSpotlightView.Builder builder = new com.indimed.babyyodas.utils.spotligh.MohaSpotlightView.Builder(activity)
                .setConfiguration(config)
                .headingTvText(title)
                .usageId(usageId)
                .subHeadingTvText(subtitle)
                .target(target)
                .setListener(new MohaSpotlightListener() {
                    @Override
                    public void onUserClicked(String s) {
                        playNext();
                    }
                })
                .enableDismissAfterShown(true);
        queue.add(builder);
        return instance;
    }

    /**
     * Starts the sequence.
     */
    public void startSequence() {
        if (queue.isEmpty()) {
            Log.d(TAG, "EMPTY SEQUENCE");
        } else {
            queue.poll().show();
        }
    }

    /**
     * Free variables. Executed when the tour has finished
     */
    private void resetTour() {
        instance = null;
        queue.clear();
        this.activity = null;
        config = null;
    }

    /**
     * Executes the next Spotlight animation in the queue.
     * If no more animations are found, resetTour()is called.
     */
    private void playNext() {
        com.indimed.babyyodas.utils.spotligh.MohaSpotlightView.Builder next = queue.poll();
        if (next != null) {
//            Log.d(TAG,"PLAYING NEXT SPOTLIGHT");
            next.show().setReady(true);

        } else {
            Log.d(TAG, "END OF QUEUE");
            resetTour();
        }
    }

    /**
     * Clear all Spotlights usageId from shared preferences.
     *
     * @param context
     */
    public static void resetSpotlights(@NonNull Context context) {
        new MohaPreferencesManager(context).resetAll();
    }

    /**
     * Sets the specified {@link MohaSpotlightConfig} configuration
     * as the configuration to use.
     * If no configuration is specified, the default configuration is used.
     *
     * @param config {@link MohaSpotlightConfig}
     */
    private void setConfig(@Nullable MohaSpotlightConfig config) {
        if (config == null) {
            config = new MohaSpotlightConfig();
            config.setLineAndArcColor(Color.parseColor("#eb273f"));
            config.setDismissOnTouch(true);
            config.setMaskColor(Color.argb(240, 0, 0, 0));
            config.setHeadingTvColor(Color.parseColor("#eb273f"));
            config.setHeadingTvSize(32);
            config.setSubHeadingTvGravity(Gravity.LEFT);
            config.setSubHeadingTvColor(Color.parseColor("#ffffff"));
            config.setPerformClick(false);
            config.setRevealAnimationEnabled(true);
            config.setLineAnimationDuration(400);
        }
        this.config = config;
    }
}

