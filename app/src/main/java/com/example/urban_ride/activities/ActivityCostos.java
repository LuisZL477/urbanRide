package com.example.urban_ride.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.urban_ride.R;

public class ActivityCostos extends Activity {

    private ImageView iv_uber_logo, iv_uber_pet, iv_uber_card, iv_uber_money, iv_uber_dynamic;
    private ImageView iv_cabify_logo, iv_cabify_pet, iv_cabify_card, iv_cabify_money, iv_cabify_dynamic;
    private ImageView iv_easytaxi_logo, iv_easytaxi_pet, iv_easytaxi_card, iv_easytaxi_money, iv_easytaxi_dynamic;
    private ImageView iv_bolt_logo, iv_bolt_pet, iv_bolt_card, iv_bolt_money, iv_bolt_dynamic;
    private ImageView iv_didi_logo, iv_didi_pet, iv_didi_card, iv_didi_money, iv_didi_dynamic;
    private ImageView iv_beat_logo, iv_beat_pet, iv_beat_card, iv_beat_money, iv_beat_dynamic;
    private TextView tv_uber_amount, tv_cabify_amount, tv_easytaxi_amount, tv_bolt_amount, tv_didi_amount, tv_beat_amount;

    private LinearLayout container_uber, container_didi, conatainer_bolt, container_cabify, container_easytaxi, container_beat;




    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_costos);
    }


}
