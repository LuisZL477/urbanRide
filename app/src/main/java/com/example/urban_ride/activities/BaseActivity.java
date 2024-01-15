package com.example.urban_ride.activities;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

import javax.annotation.Nullable;


public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //firebase
        FirebaseAuth mAuth = FirebaseAuth.getInstance();

        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        initView();
        prepareComponents();
        initListeners();
        onActivityReady();
    }

    protected abstract Activity getActivity();
    protected abstract int getLayoutId();
    protected abstract void initView();
    protected abstract void prepareComponents();
    protected abstract void initListeners();
    protected abstract void onActivityReady();
}