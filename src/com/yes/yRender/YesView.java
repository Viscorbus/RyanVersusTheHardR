package com.yes.yRender;

import com.yes.YesMain;
import com.yes.yCore.YesCore;
import com.yes.ySprites.ySprite;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.TimerTask;

public class YesView extends Application {
    @Override
    public void start(Stage yStage) throws FileNotFoundException {
        yStage.setTitle("Ryan vs the Hard R");
        yStage.setResizable(false);
        yStage.setAlwaysOnTop(false);
        final Canvas yesCanvas = new Canvas(1000,1000);
        final GraphicsContext gc = yesCanvas.getGraphicsContext2D();
        Image image = new Image(new FileInputStream("D:\\Code\\RyanVersusTheHardR-Git\\gameData\\image0.jpg"));
        //YesMain.ryan.setSpriteImage(new Image(YesMain.ryan.loc));
        System.out.println(YesMain.renderReg.getRenderList().size());
        //gc.drawImage("D:\\Code\\RyanVersusTheHardR-Git\\gameData\\image0.jpg",1000,1000);
        for (ySprite i : YesMain.renderReg.getRenderList())
        {
            i.generateImage();
        }
        YesCore.yesTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
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
