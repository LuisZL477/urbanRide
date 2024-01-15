package com.example.urban_ride.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

import com.example.urban_ride.utils.Fonts;

public class TextViewBoldTexgyReadVentor  extends AppCompatTextView {

    public TextViewBoldTexgyReadVentor(Context context){
        super(context);
        applyCustomFont(context);
    }

    public TextViewBoldTexgyReadVentor(Context context, AttributeSet attrs){
        super(context, attrs);

        applyCustomFont(context);
    }

    public TextViewBoldTexgyReadVentor(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);
        applyCustomFont(context);
    }

    private void applyCustomFont(Context context){
        Typeface customFont = Fonts.getBoldTypeface(context);
        setTypeface(customFont);
    }

}
