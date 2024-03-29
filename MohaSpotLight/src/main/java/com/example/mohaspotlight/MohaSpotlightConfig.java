package com.example.mohaspotlight;

import android.graphics.Color;
import android.graphics.Typeface;

/**
 * Created by moha.
 */

public class MohaSpotlightConfig {
    private int maskColor;
    private long introAnimationDuration;
    private boolean isRevealAnimationEnabled = true;
    private long fadingTextDuration;
    private int padding;
    private boolean dismissOnTouch;
    private boolean dismissOnBackpress;
    private boolean isPerformClick;
    private int headingTvSize;
    private int headingTvSizeDimenUnit;
    private int headingTvColor;
    private CharSequence headingTvText;
    private int subHeadingTvSize;
    private int subHeadingTvgravity;
    private int subHeadingTvSizeDimenUnit;
    private int subHeadingTvColor;
    private CharSequence subHeadingTvText;
    private long lineAnimationDuration;
    private int lineStroke;
    private int lineAndArcColor;
    private boolean showTargetArc;
    private Typeface typeface;

    public MohaSpotlightConfig() {
        this.maskColor = 0x70000000;
        this.introAnimationDuration = 400;
        this.isRevealAnimationEnabled = true;
        this.fadingTextDuration = 400;
        this.padding = 20;
        this.dismissOnTouch = true;
        this.dismissOnBackpress = true;
        this.isPerformClick = true;
        this.headingTvSize = 24;
        this.headingTvSizeDimenUnit = -1;
        this.headingTvColor = Color.parseColor("#eb273f");
        this.headingTvText = "Hello";
        this.subHeadingTvSize = 24;
        this.subHeadingTvSizeDimenUnit = -1;
        this.subHeadingTvColor = Color.parseColor("#ffffff");
        this.subHeadingTvText = "Hello";
        this.lineAnimationDuration = 300;
        this.lineStroke = MohaUtils.dpToPx(4);
        this.lineAndArcColor = Color.parseColor("#eb273f");
        this.showTargetArc = true;
    }

    public int getMaskColor() {
        return maskColor;
    }

    public void setMaskColor(int maskColor) {
        this.maskColor = maskColor;
    }

    public long getIntroAnimationDuration() {
        return introAnimationDuration;
    }

    public void setIntroAnimationDuration(long introAnimationDuration) {
        this.introAnimationDuration = introAnimationDuration;
    }

    public boolean isRevealAnimationEnabled() {
        return isRevealAnimationEnabled;
    }

    public void setRevealAnimationEnabled(boolean revealAnimationEnabled) {
        isRevealAnimationEnabled = revealAnimationEnabled;
    }

    public long getFadingTextDuration() {
        return fadingTextDuration;
    }

    public void setFadingTextDuration(long fadingTextDuration) {
        this.fadingTextDuration = fadingTextDuration;
    }

    public int getPadding() {
        return padding;
    }

    public void setPadding(int padding) {
        this.padding = padding;
    }

    public boolean isDismissOnTouch() {
        return dismissOnTouch;
    }

    public void setDismissOnTouch(boolean dismissOnTouch) {
        this.dismissOnTouch = dismissOnTouch;
    }

    public boolean isPerformClick() {
        return isPerformClick;
    }

    public void setPerformClick(boolean performClick) {
        isPerformClick = performClick;
    }

    public int getHeadingTvSize() {
        return headingTvSize;
    }

    public void setHeadingTvSize(int headingTvSize) {
        this.headingTvSize = headingTvSize;
    }

    public void setHeadingTvSize(int dimenUnit, int size) {
        this.headingTvSizeDimenUnit = dimenUnit;
        this.headingTvSize = size;
    }

    public int getHeadingTvColor() {
        return headingTvColor;
    }

    public void setHeadingTvColor(int headingTvColor) {
        this.headingTvColor = headingTvColor;
    }

    public CharSequence getHeadingTvText() {
        return headingTvText;
    }

    public void setHeadingTvText(CharSequence headingTvText) {
        this.headingTvText = headingTvText;
    }

    public int getSubHeadingTvSize() {
        return subHeadingTvSize;
    }

    public void setSubHeadingTvSize(int subHeadingTvSize) {
        this.subHeadingTvSize = subHeadingTvSize;
    }

    public void setSubHeadingTvGravity(int gravity) {
        this.subHeadingTvgravity = gravity;
    }

    public void setSubHeadingTvSize(int dimenUnit, int size) {
        this.subHeadingTvSizeDimenUnit = dimenUnit;
        this.subHeadingTvSize = size;
    }

    public int getSubHeadingTvColor() {
        return subHeadingTvColor;
    }

    public void setSubHeadingTvColor(int subHeadingTvColor) {
        this.subHeadingTvColor = subHeadingTvColor;
    }

    public CharSequence getSubHeadingTvText() {
        return subHeadingTvText;
    }

    public void setSubHeadingTvText(CharSequence subHeadingTvText) {
        this.subHeadingTvText = subHeadingTvText;
    }

    public long getLineAnimationDuration() {
        return lineAnimationDuration;
    }

    public void setLineAnimationDuration(long lineAnimationDuration) {
        this.lineAnimationDuration = lineAnimationDuration;
    }

    public int getLineStroke() {
        return lineStroke;
    }

    public void setLineStroke(int lineStroke) {
        this.lineStroke = lineStroke;
    }

    public int getLineAndArcColor() {
        return lineAndArcColor;
    }

    public void setLineAndArcColor(int lineAndArcColor) {
        this.lineAndArcColor = lineAndArcColor;
    }

    public boolean showTargetArc() {
        return showTargetArc;
    }

    public void setShowTargetArc(boolean showTargetArc) {
        this.showTargetArc = showTargetArc;
    }

    public Typeface getTypeface() {
        return typeface;
    }

    public void setTypeface(Typeface mTypeface) {
        this.typeface = mTypeface;
    }

    public boolean isDismissOnBackpress() {
        return dismissOnBackpress;
    }

    public void setDismissOnBackpress(boolean dismissOnBackpress) {
        this.dismissOnBackpress = dismissOnBackpress;
    }

    public int getHeadingTvSizeDimenUnit() {
        return headingTvSizeDimenUnit;
    }

    public int getSubHeadingTvSizeDimenUnit() {
        return subHeadingTvSizeDimenUnit;
    }
}