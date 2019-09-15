package com.yes.ySprites;

import com.yes.yPhys.Point;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.MotionBlur;
import javafx.scene.image.Image;

public class Player implements ySprite{
    private Image spriteImage;
    private Point coords,size;
    private String imgurl;
    public String loc = "file:D:\\Code\\RyanVersusTheHardR-Git\\gameData\\image0.jpg";
    private boolean deathState = false;
    public Player(String imgurl, Point size, Point coords)
    {
        this.imgurl = imgurl;
        this.size = size;
        this.coords = coords;
    }
    @Override
    public void setSpriteImage(Image spriteImage) {

        this.spriteImage = spriteImage;
    }

    @Override
    public Image getSpriteImage() {
        return spriteImage;
    }

    @Override
    public void setCoords(Point coords) {
        this.coords = coords;
    }

    @Override
    public Point getCoords() {
        return coords;
    }

    @Override
    public void setSize(Point size) {
        this.size = size;
    }

    @Override
    public Point getSize() {
        return size;
    }

    @Override
    public void render(GraphicsContext gc) throws Exception {
        if (!deathState)
        {
            //gc.setGlobalAlpha(0.1);
            //gc.setGlobalBlendMode(new BlendMode());
            //gc.setEffect(new BoxBlur(1000,1000,1));
            gc.drawImage(spriteImage,0,0,1000,1000,coords.getX(),coords.getY(),size.getX(),size.getY());
        } else {

        }
    }

    @Override
    public void generateImage() {
        spriteImage = new Image(imgurl);
    }

    @Override
    public void setIsDead(boolean deathState) {
        this.deathState = deathState;
    }

    @Override
    public boolean getDeadState() {
        return deathState;
    }
}
