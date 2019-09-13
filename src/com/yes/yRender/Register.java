package com.yes.yRender;

import com.yes.ySprites.ySprite;

import java.util.*;

public class Register {
    private static final List<ySprite> renderList = new ArrayList<ySprite>();
    public Register()
    {

    }
    public void addToRegister(ySprite toAdd)
    {
        renderList.add(toAdd);
    }
    public void addToRegister(Collection<ySprite> ySprites)
    {
        renderList.addAll(ySprites);
    }
    public void removeFromRegister(ySprite toRemove)
    {
        renderList.remove(toRemove);
    }
    public static List<ySprite> getRenderList()
    {
        return renderList;
    }
}
