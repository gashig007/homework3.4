package com.example.homework34;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Mainland {
    private int imageMainland;
    private String textViewMainland;

    public Mainland(int imageMainland, String textViewMainland) {
        this.imageMainland = imageMainland;
        this.textViewMainland = textViewMainland;
    }



    public int getImageMainland() {
        return imageMainland;
    }

    public void setImageMainland(int imageMainland) {
        this.imageMainland = imageMainland;
    }

    public String getTextViewMainland() {
        return textViewMainland;
    }

    public void setTextViewMainland(String textViewMainland) {
        this.textViewMainland = textViewMainland;
    }
}