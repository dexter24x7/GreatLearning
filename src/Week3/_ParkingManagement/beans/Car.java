package Week3._ParkingManagement.beans;

import java.time.LocalTime;

public class Car extends Vehicle{
    float costPerHour=30;
    public Car(String vehicleNo, LocalTime entryTime){
      super(vehicleNo,entryTime);
    }
    public float getCostPerHour() {
        return costPerHour;
    }
}
