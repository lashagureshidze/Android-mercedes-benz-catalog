package com.example.lasha.homework3.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.example.lasha.homework3.view.ImagesFragment;
import com.example.lasha.homework3.view.ReviewFragment;
import com.example.lasha.homework3.view.VehiclesFragment;

/**
 * Created by lasha on 4/1/2015.
 */
public class FragmentsAdapter extends FragmentPagerAdapter {
    private Fragment vehiclesFragment, imagesFragment, reviewFragment;

    public FragmentsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Log.d("", "viewPAger. getItem. pos: " + i);

        switch (i) {
            case 0 :
                if (vehiclesFragment == null) {
                    vehiclesFragment = new VehiclesFragment();
                }
                return vehiclesFragment;
            case 1 :
                if (imagesFragment == null) {
                    imagesFragment = new ImagesFragment();
                }
                return imagesFragment;
            case 2:
                if (reviewFragment == null) {
                    reviewFragment = new ReviewFragment();
                }
                return reviewFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
