package com.example.mohaspotlight;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

public interface MohaTarget {

    Point getPoint();

    Rect getRect();

    View getView();

    int getViewLeft();

    int getViewRight();

    int getViewTop();

    int getViewBottom();

    int getViewWidth();

    int getViewHeight();
}
