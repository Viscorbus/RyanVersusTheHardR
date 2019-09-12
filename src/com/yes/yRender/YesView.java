package com.yes.yRender;

import com.yes.yCore.YesCore;
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
        final Canvas yesCanvas = new Canvas(100,100);
        final GraphicsContext gc = yesCanvas.getGraphicsContext2D();
        YesCore.yesTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
              gc.clearRect(0,0,100,100);
              gc.setFill(Color.CORNSILK);
              gc.fillRect(0,0,100,100);
            }
        },10,20);
        Group yesGroup = new Group(yesCanvas);
        Scene yesScene = new Scene(yesGroup);
        yStage.setScene(yesScene);
        yStage.setOnCloseRequest(windowEvent -> System.exit(0));
        yStage.show();
    }
}
