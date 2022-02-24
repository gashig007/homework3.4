package com.example.homework34;

public class Country {
    private int imageCountry;
    private String textViewCountry;

    public Country(int imageCountry, String textViewCountry) {
        this.imageCountry = imageCountry;
        this.textViewCountry = textViewCountry;
    }

    public int getImageCountry() {
        return imageCountry;
    }

    public void setImageCountry(int imageCountry) {
        this.imageCountry = imageCountry;
    }

    public String getTextViewCountry() {
        return textViewCountry;
    }

    public void setTextViewCountry(String textViewCountry) {
        this.textViewCountry = textViewCountry;
    }
}
