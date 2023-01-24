package com.factoriaf5.rps.models;

public class Player {
    private Figure selection;

    public Player(){
        
    }

    public Figure getSelection() {
        return selection;
    }

    public void setSelection(Figure selection) {
        this.selection = selection;
    }

    public Figure choose(String selection){
        if(selection == "Rock") return new Rock();
        if(selection == "Paper") return new Paper();
        if(selection == "Scissors") return new Scissors();
        return null;
    }
    
}
