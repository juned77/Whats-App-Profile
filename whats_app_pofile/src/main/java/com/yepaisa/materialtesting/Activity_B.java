package com.yepaisa.materialtesting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

/**
 * Created by juned on 7/28/2016.
 */
public class Activity_B extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();

        Log.e("onBackPressed" , "onBackPressed Called");
    }
}