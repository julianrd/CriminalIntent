package com.bignerdranch.android.criminalintent;

import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Roberto on 4/28/2015.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        //Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String getFormatedDate(){
        return DateFormat.getDateInstance(DateFormat.FULL).format(mDate);
    }

    @Override
    public String toString(){
        return mTitle;
    }
}
