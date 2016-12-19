package com.example.lasha.homework3.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lasha.homework3.R;
import com.example.lasha.homework3.model.Vehicle;

/**
 * Created by lasha on 3/30/2015.
 */
public class ReviewFragment extends Fragment{
    private MainActivity activity;
    private ImageView image;
    private TextView name, overview, fuel, acceleration, power, speed;
    private long vehicleId;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        activity = (MainActivity) getActivity();

        View view = inflater.inflate(R.layout.fragment_review, container, false);

        image = (ImageView) view.findViewById(R.id.review_image);
        overview = (TextView) view.findViewById(R.id.review_overview);
        name = (TextView) view.findViewById(R.id.review_name);
        fuel = (TextView) view.findViewById(R.id.review_fuel);
        acceleration = (TextView) view.findViewById(R.id.review_acceleration);
        power = (TextView) view.findViewById(R.id.review_power);
        speed = (TextView) view.findViewById(R.id.review_speed);


        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        Vehicle vehicle = activity.getSelectedVehicle();
        if (vehicleId != vehicle.getId()) {

            image.setImageResource(vehicle.getPhotoId());
            name.setText(vehicle.getModel());
            overview.setText(vehicle.getDescription());
            fuel.setText(vehicle.getFuelCity() + "city/" + vehicle.getFuelHwy() + "hwy");
            acceleration.setText(vehicle.getAcceleration());
            power.setText(vehicle.getPower() +"hp");
            speed.setText(vehicle.getSpeed() + "mph");

            vehicleId = vehicle.getId();
        }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (isVisibleToUser) {
            Vehicle vehicle = activity.getSelectedVehicle();

            if (vehicleId != vehicle.getId()) {
                image.setImageResource(vehicle.getPhotoId());
                name.setText(vehicle.getModel());
                overview.setText(vehicle.getDescription());
                fuel.setText(vehicle.getFuelCity() + "city/" + vehicle.getFuelHwy() + "hwy");
                acceleration.setText(vehicle.getAcceleration());
                power.setText(vehicle.getPower() + "hp");
                speed.setText(vehicle.getSpeed() + "mph");

                vehicleId = vehicle.getId();
            }
        } else {
            vehicleId = -1;
        }
    }
}
