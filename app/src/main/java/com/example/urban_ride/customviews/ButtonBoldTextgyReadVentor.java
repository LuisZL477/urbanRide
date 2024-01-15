package com.example.urban_ride.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

import com.example.urban_ride.utils.Fonts;

public class ButtonBoldTextgyReadVentor extends AppCompatButton {

    public ButtonBoldTextgyReadVentor(Context context){
        super(context);
        applyCustomFont(context);
    }

    public ButtonBoldTextgyReadVentor(Context context, AttributeSet attrs){
        super(context, attrs);

        applyCustomFont(context);
    }

    private  ButtonBoldTextgyReadVentor(Context context, AttributeSet attrs, int defStyle){
       super(context, attrs);

       applyCustomFont(context);

    }

    private void applyCustomFont(Context context){
        Typeface customFont = Fonts.getBoldTypeface(context);
        setTypeface(customFont);
    }
}
