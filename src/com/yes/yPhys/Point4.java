package com.yes.yPhys;

public class Point4 {
    private double xOrigin,yOrigin,xSize,ySize;
    public Point4(double xOrigin, double yOrigin, double xSize, double ySize)
    {
        this.xOrigin = xOrigin;
        this.yOrigin = yOrigin;
        this.xSize = xSize;
        this.ySize = ySize;
    }
    public void setXOrigin(double xOrigin)
    {
        this.xOrigin = xOrigin;
    }
    public void setYOrigin(double yOrigin)
    {
        this.yOrigin = yOrigin;
    }
    public void setXSize(double xSize)
    {
        this.xSize = xSize;
    }
    public void setYSize(double ySize)
    {
        this.ySize = ySize;
    }
    public void setOriginPoint(Point origin)
    {
        xOrigin = origin.getX();
        yOrigin = origin.getY();
    }
    public void setSize(Point size)
    {
        xSize = size.getX();
        ySize = size.getY();
    }
    public Point getOrigin()
    {
        return new Point(xOrigin,yOrigin);
    }
    public Point getSize()
    {
        return new Point(xSize,ySize);
    }
}
