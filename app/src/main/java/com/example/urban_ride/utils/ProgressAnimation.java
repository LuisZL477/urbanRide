package com.example.urban_ride.utils;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;

public class ProgressAnimation extends Animation {

    private ProgressBar progressBar;

    private float to;

    public ProgressAnimation(ProgressBar progressBar, float to){
        this.progressBar = progressBar;
        this.to = to;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t){
        super.applyTransformation(interpolatedTime, t);
        float value = (to) * interpolatedTime;
        progressBar.setProgress((int) value);
    }
}
