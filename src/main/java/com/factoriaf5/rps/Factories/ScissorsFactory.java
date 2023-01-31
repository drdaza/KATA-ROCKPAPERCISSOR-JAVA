package com.factoriaf5.rps.Factories;

import com.factoriaf5.rps.models.Figure;

import com.factoriaf5.rps.models.Scissors;

public class ScissorsFactory implements InterfaceFactory{

    @Override
    public Figure createFigure() {
        return new Scissors();
    }

}
