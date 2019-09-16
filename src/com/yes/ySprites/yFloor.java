package com.yes.ySprites;

import com.yes.yPhys.Point;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class yFloor {
    private double floorNumber = 0;
    private Image floorImage;
    private Point currentTileLoc = new Point(0,0);
    void generateNewFloor()
    {

    }
    void getNextFloor(String currFloor)
    {

    }
    public void setFloorImage(Image floorImage)
    {
        this.floorImage = floorImage;
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
    public void render(GraphicsContext gc)
    {
        gc.drawImage(floorImage,0,0,64,64,currentTileLoc.getX(),currentTileLoc.getY(),64,64);
    }

}
