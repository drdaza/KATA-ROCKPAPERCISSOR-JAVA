package com.factoriaf5.rps.models.Player;

import com.factoriaf5.rps.models.Figure;

public class Player {
    private Figure selection;
    private String NickName;
    private ObjectCreator objectCreator;

    public Player(String nickName){
        NickName = nickName;
        objectCreator = new ObjectCreator();
    }
    public String getNickName() {
        return NickName;
    }
    public Figure getSelection() {
        return selection;
    }

    public void setSelection(Figure selection) {
        this.selection = selection;
    }

    public void choose(String selection){
       setSelection(objectCreator.create(selection));
    }

    
    
}
