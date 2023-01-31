package com.factoriaf5.rps.Factories;

import com.factoriaf5.rps.models.Figure;
import com.factoriaf5.rps.models.Rock;

public class RockFactory implements InterfaceFactory{

    @Override
    public Figure createFigure() {
        return new Rock();
    }
    
}
