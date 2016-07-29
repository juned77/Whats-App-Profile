package com.yepaisa.materialtesting;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by juned on 7/28/2016.
 */
public class Activity_A extends AppCompatActivity
{
    ImageView imageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        imageView = (ImageView)findViewById(R.id.imageView);
    }

    public void onClick(View view)
    {
        Intent intent = new Intent(this, Activity_B.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            ActivityOptionsCompat options = ActivityOptionsCompat.
                    makeSceneTransitionAnimation(this, imageView, getString(R.string.activity_image_trans));
            startActivity(intent, options.toBundle());
        }
        else
        {
            startActivity(intent);
        }
    }
}