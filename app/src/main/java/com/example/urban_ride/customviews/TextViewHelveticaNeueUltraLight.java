package com.example.urban_ride.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

import java.util.HashMap;

public class TextViewHelveticaNeueUltraLight extends AppCompatTextView {

    private HashMap<String, Typeface> fontCache = new HashMap<>();

    public TextViewHelveticaNeueUltraLight(Context context) {
        super(context);
        applyCustomFont(context);
    }

    public TextViewHelveticaNeueUltraLight(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context);
    }

    public TextViewHelveticaNeueUltraLight(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = getTypeface("helvetica-ultralight.otf", context);
        setTypeface(customFont);
    }

    public Typeface getTypeface(String fontname, Context context) {
        Typeface typeface = fontCache.get(fontname);
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), fontname);
            } catch (Exception e) {
                return null;
            }
            fontCache.put(fontname, typeface);
        }
        return typeface;

    }
}