package com.example.kartik.interactivestory.model;

public class Choice {
    public Choice(String text, int nextPage) {
        mText = text;
        mNextPage = nextPage;
    }

    private String mText;
    private int mNextPage;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
