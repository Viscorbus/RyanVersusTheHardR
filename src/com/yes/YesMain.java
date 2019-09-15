package com.yes;

import com.yes.yCore.YesCore;
import com.yes.yPhys.Point;
import com.yes.yRender.Register;
import com.yes.ySprites.Player;

public class YesMain {
    public static Player ryan,charlie;
    public static Register renderReg;
    private void yesBootStrap()
    {
        ryan = new Player("file:D:\\Code\\RyanVersusTheHardR-Git\\gameData\\image0.jpg",new Point(500,500),new Point(0,0));
        charlie = new Player("file:D:\\Code\\RyanVersusTheHardR-Git\\gameData\\WIN_20190906_19_34_01_Pro.jpg",new Point (500,500),new Point(500,500));
        renderReg = new Register();
        renderReg.addToRegister(ryan);
        renderReg.addToRegister(charlie);
        YesCore.yes();
    }
    public static void main(String[]args) {
        YesMain yesMain = new YesMain();
        yesMain.yesBootStrap();
    }
}