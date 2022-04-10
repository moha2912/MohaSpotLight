package com.example.mohaspotlight;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

public class MohaViewTarget implements com.indimed.babyyodas.utils.spotligh.MohaTarget {

    private View view;


    public MohaViewTarget(View view) {
        this.view = view;
    }

    @Override
    public Point getPoint() {

        int[] location = new int[2];
        view.getLocationInWindow(location);
        return new Point(location[0] + (view.getWidth() / 2), location[1] + (view.getHeight() / 2));
    }

    @Override
    public Rect getRect() {
        int[] location = new int[2];
        view.getLocationInWindow(location);
        return new Rect(
                location[0],
                location[1],
                location[0] + view.getWidth(),
                location[1] + view.getHeight()
        );
    }

    @Override
    public View getView() {
        return view;
    }

    @Override
    public int getViewLeft() {
        return getRect().left;
    }

    @Override
    public int getViewRight() {
        return getRect().right;
    }

    @Override
    public int getViewBottom() {
        return getRect().bottom;
    }

    @Override
    public int getViewTop() {
        return getRect().top;
    }

    @Override
    public int getViewWidth() {
        return view.getWidth();
    }

    @Override
    public int getViewHeight() {
        return view.getHeight();
    }
}
