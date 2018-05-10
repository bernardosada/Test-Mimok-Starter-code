package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMimokTranslation;


    public Word(String defaultTranslation, String mimokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMimokTranslation = mimokTranslation;
    }


    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMimokTranslation() {
        return mMimokTranslation;
    }


}
