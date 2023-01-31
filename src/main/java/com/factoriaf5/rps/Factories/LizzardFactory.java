package com.factoriaf5.rps.Factories;

import com.factoriaf5.rps.models.Figure;
import com.factoriaf5.rps.models.Lizzard;

public class LizzardFactory implements InterfaceFactory{

    @Override
    public Figure createFigure() { 
        return new Lizzard(); 
    }
    
}
