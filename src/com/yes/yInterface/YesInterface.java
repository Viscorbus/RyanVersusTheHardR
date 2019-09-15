package com.yes.yInterface;


import com.yes.YesMain;
import com.yes.yPhys.Point;
import javafx.scene.input.KeyEvent;

public class YesInterface {

    public YesInterface() { }
    public void keyPressed(KeyEvent e)
    {
        switch(e.getCode())
        {
            case W:
                YesMain.ryan.setCoords(new Point(YesMain.ryan.getCoords().getX(),YesMain.ryan.getCoords().getY()-10));
                break;
            case A:
                YesMain.ryan.setCoords(new Point(YesMain.ryan.getCoords().getX()-10,YesMain.ryan.getCoords().getY()));
                break;
            case S:
                YesMain.ryan.setCoords(new Point(YesMain.ryan.getCoords().getX(),YesMain.ryan.getCoords().getY()+10));
                break;
            case D:
                YesMain.ryan.setCoords(new Point(YesMain.ryan.getCoords().getX()+10,YesMain.ryan.getCoords().getY()));
                break;
            case SPACE:

                break;
            case R:

                break;
            case Q:

                break;
            case DIGIT1:

                break;
            case DIGIT2:

                break;
            case DIGIT3:

                break;
            case DIGIT4:

                break;
            case T:

                break;
        }
    }
}
