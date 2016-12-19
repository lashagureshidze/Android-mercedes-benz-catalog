package com.example.lasha.homework3.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;

import com.example.lasha.homework3.R;
import com.example.lasha.homework3.model.Vehicle;

/**
 * Created by lasha on 3/30/2015.
 */
public class ImagesFragment extends Fragment{
    private MainActivity activity;
    private ImageView imageView;
    private long vehicleId = -1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        activity = (MainActivity) getActivity();
        View view = inflater.inflate(R.layout.fragment_image, container, false);

        imageView = (ImageView) view.findViewById(R.id.image);

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        Vehicle vehicle = activity.getSelectedVehicle();
        if (vehicle.getId() != vehicleId) {
            imageView.setImageResource(vehicle.getPhotoIdHD());
            vehicleId = vehicle.getId();
        }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);


        if (isVisibleToUser ) {
            Vehicle vehicle = activity.getSelectedVehicle();
            if (vehicle.getId() != vehicleId){
                imageView.setImageResource(vehicle.getPhotoIdHD());
                vehicleId = vehicle.getId();
            }
        } else {
            vehicleId = -1;
        }
    }
}
