package com.factoriaf5.rps.models;

public class Player {
    private Figure selection;
    private String NickName;

    public Player(String nickName){
        NickName = nickName;
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

    public Figure choose(String selection){
        if(selection == "Rock") {
            setSelection(new Rock());
            return new Rock();
        }
        if(selection == "Paper"){ 
            setSelection(new Paper());
            return new Paper();
        }
        if(selection == "Scissors"){ 
            setSelection(new Scissors());
            return new Scissors();
        }
        return null;
    }

    
    
}
