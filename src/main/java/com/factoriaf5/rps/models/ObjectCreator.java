package com.factoriaf5.rps.models;

import com.factoriaf5.rps.Factories.InterfaceFactory;

public class ObjectCreator {
    private InterfaceFactory factory;

    public Figure create(String selection){
        if (selection == "Rock") return factory.createFigure();
        return null; 
    }
}
