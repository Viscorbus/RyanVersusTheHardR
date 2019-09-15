package com.yes.ySprites;

import com.yes.yPhys.Point;
import javafx.geometry.Pos;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public interface ySprite {

     void setSpriteImage(Image spriteImage);
     Image getSpriteImage();
     void setCoords(Point coords);
     Point getCoords();
     void setSize(Point size);
     Point getSize();
     void render(GraphicsContext gc) throws Exception;
     void generateImage();
     void setIsDead(boolean deathState);
     boolean getDeadState();
}