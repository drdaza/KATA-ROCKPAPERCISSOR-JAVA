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
    
    public void choose(String selection){
        if(selection == "Rock") setSelection(new Rock());
            
        if(selection == "Paper") setSelection(new Paper());
            
        if(selection == "Scissors") setSelection(new Scissors());
            
        if(selection == "Lizzard") setSelection(new Lizzard());

        if(selection == "Spock") setSelection(new Spock());
    }

    
    
}
