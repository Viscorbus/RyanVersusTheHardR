package com.yes.ySprites;

import javafx.scene.image.Image;

public class yFloor {
    private double floorNumber = 0;
    Image floorImage;
    void generateNewFloor()
    {

    }
    void getNextFloor(String currFloor)
    {

    }
    Image getFloorBackground()
    {
        return floorImage;
    }
    void setFloorNumber(double currFloorNumber)
    {
        floorNumber = floorNumber++;
    }
    double getFloorNumber()
    {
        return floorNumber;
    }
}
