package com.company.abstractFactoryDesignPattern.normalShip;

import com.company.abstractFactoryDesignPattern.tools.ESEngine;

public class ESUFOEngine implements ESEngine {
    @Override
    public String engineSpeed() {
        return "1000 mph";
    }
}
