package com.driver;

public class Boat implements WaterVehicle{
   private String name;
   private int type;

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return type;
    }
}
