package com.factoriaf5.rps.Factories;

import com.factoriaf5.rps.models.Figure;
import com.factoriaf5.rps.models.Spock;

public class SpockFactory implements InterfaceFactory{

    @Override
    public Figure createFigure() {
        return new Spock();
    }
    
}
