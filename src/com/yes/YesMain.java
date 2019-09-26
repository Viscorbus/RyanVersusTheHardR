package com.yes;

import com.yes.yCore.YesCore;
import com.yes.yCore.yEngine;
import com.yes.yInterface.YesInterface;
import com.yes.yPhys.Point;
import com.yes.yPhys.Point4;
import com.yes.yRender.Register;
import com.yes.ySprites.Player;

public class YesMain {
    public static Player ryan,charlie;
    public static Register renderReg;
    public static YesInterface yesInt;
    public yEngine engine;
    public Point4 roomData;
    private void yesBootStrap()
    {
        YesCore.windowSize = new Point(1920,1080);
        ryan = new Player("file:D:\\Code\\RyanVersusTheHardR-Git\\gameData\\images\\spriteSheets\\ryanIdle2.png",new Point(64,147),new Point(0,0));
        //charlie = new Player("file:D:\\Code\\RyanVersusTheHardR-Git\\gameData\\images\\WIN_20190906_19_34_01_Pro.jpg",new Point (500,500),new Point(500,500));
        renderReg = new Register();
        renderReg.addToRegister(ryan);
        //renderReg.addToRegister(charlie);
        yesInt = new YesInterface();
        engine = new yEngine();
        YesCore.yes();
    }
    public static void main(String[]args) {
        YesMain yesMain = new YesMain();
        yesMain.yesBootStrap();
    }
}