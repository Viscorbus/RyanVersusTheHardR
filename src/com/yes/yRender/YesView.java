package com.yes.yRender;

import com.yes.YesMain;
import com.yes.yCore.YesCore;
import com.yes.ySprites.ySprite;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.TimerTask;

public class YesView extends Application {
    @Override
    public void start(Stage yStage) {
        yStage.setTitle("Ryan vs the Hard R");
        yStage.setResizable(false);
        yStage.setAlwaysOnTop(false);
        yStage.setFullScreen(true);
        final Canvas yesCanvas = new Canvas(1920,1080);
        final GraphicsContext gc = yesCanvas.getGraphicsContext2D();
        System.out.println(YesMain.renderReg.getRenderList().size());
        for (ySprite i : YesMain.renderReg.getRenderList())
        {
            i.generateImage();
        }
        YesCore.yesTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                gc.clearRect(0,0,100,100);
                gc.setFill(Color.CORNSILK);
                gc.fillRect(0,0,1920,1080);
                for (ySprite i: YesMain.renderReg.getRenderList())
                {
                    try {
                        i.render(gc);
                    } catch (NullPointerException e)
                    {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        },10,20);
        Group yesGroup = new Group(yesCanvas);
        Scene yesScene = new Scene(yesGroup);
        yStage.setScene(yesScene);
        yStage.setOnCloseRequest(windowEvent -> System.exit(0));
        yStage.show();
        yesScene.setOnKeyPressed(keyEvent -> YesMain.yesInt.keyPressed(keyEvent));
    }
}
