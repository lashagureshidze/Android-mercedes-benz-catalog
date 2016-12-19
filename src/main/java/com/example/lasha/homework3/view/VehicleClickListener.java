package com.example.lasha.homework3.view;

import com.example.lasha.homework3.model.Vehicle;

/**
 * Created by lasha on 3/31/2015.
 */
public interface VehicleClickListener {

    /**
     * raise event when Vehicle clicked on VehiclesListView
     * @param vehicle
     */
    void onVehicleClick(Vehicle vehicle);

    Vehicle getSelectedVehicle();
}
