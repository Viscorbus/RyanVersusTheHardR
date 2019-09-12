package com.yes.yCore;

import com.yes.yRender.YesView;

import java.util.Timer;

public class YesCore {
    public static Timer yesTimer;
    public static void yes()
    {
        yesClock();
        javafx.application.Application.launch(YesView.class);
    }
    private static void yesClock()
    {
        yesTimer = new Timer();
    }
}
