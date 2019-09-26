package com.yes.yRender;

import com.yes.ySprites.yFloor;
import com.yes.ySprites.ySprite;

import java.util.*;

public class Register {
    private static final List<ySprite> renderList = new ArrayList<>();
    private static final List<yFloor> inanimateList = new ArrayList<>();
    public Register()
    {

    }
    public void addToRegister(ySprite... ySprites)
    {
        for (ySprite i : ySprites)
        {
            renderList.add(i);
        }
    }
    public void removeFromRegister(ySprite... ySprites)
    {
        for (ySprite i : ySprites)
        {
            renderList.remove(i);
        }
    }
    public static List<ySprite> getRenderList()
    {
        return renderList;
    }
    public void addToInanimateList(yFloor... yFloors)
    {
        for (yFloor i : yFloors)
        {
            inanimateList.add(i);
        }
    }
    public void removeFromInanimateList(yFloor... yFloors)
    {
        for (yFloor i : yFloors)
        {
            inanimateList.remove(i);
        }
    }
}