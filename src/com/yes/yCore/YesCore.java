package com.yes.yCore;

import com.yes.yPhys.Point;
import com.yes.yPhys.Point4;
import com.yes.yRender.YesView;

import java.util.Timer;
import java.util.TimerTask;

public class YesCore {
    public static Timer yesEngineTimer,yesViewTimer;
    private static Point4 renderBounds;
    public static Point windowSize;
    public static void yes()
    {
        yesClock();
        javafx.application.Application.launch(YesView.class);
    }
    private static void yesClock()
    {
        yesEngineTimer = new Timer();
        yesEngineTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

            }
        },10,8);
        yesViewTimer = new Timer();
    }
    public Point getRenderSize()
    {
        return renderBounds.getSize();
    }
    public Point getRenderOrigin()
    {
        return renderBounds.getOrigin();
    }
    public void setRenderSize(Point size)
    {
        renderBounds.setSize(size);
    }
    public void setRenderOrigin(Point origin)
    {
        renderBounds.setOriginPoint(origin);
    }
}