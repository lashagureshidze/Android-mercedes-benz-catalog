package com.example.lasha.homework3.model;

/**
 *
 * Created by lasha on 3/25/2015.
 */
public class Vehicle {
    private long id;
    private int photoId;
    private int photoIdHD;
    private String name;
    private String model;
    private String price;
    private String description;
    private int fuelCity;
    private int fuelHwy;
    private String acceleration;
    private int power;
    private int speed;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public int getPhotoId() {
        return photoId;
    }
    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public int getPhotoIdHD() {
        return photoIdHD;
    }
    public void setPhotoIdHD(int photoIdHD) {
        this.photoIdHD = photoIdHD;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getFuelCity() {
        return fuelCity;
    }
    public void setFuelCity(int fuelCity) {
        this.fuelCity = fuelCity;
    }

    public int getFuelHwy() {
        return fuelHwy;
    }
    public void setFuelHwy(int fuelHwy) {
        this.fuelHwy = fuelHwy;
    }

    public String getAcceleration() {
        return acceleration;
    }
    public void setAcceleration(String acceleration) {
        this.acceleration = acceleration;
    }

    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
