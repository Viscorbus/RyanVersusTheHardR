package com.yes;

import com.yes.yCore.YesCore;

public class YesMain {
    private void yesBootStrap()
    {
        YesCore.yes();
    }
    public static void main(String[]args) {
        YesMain yesMain = new YesMain();
        yesMain.yesBootStrap();
    }
}