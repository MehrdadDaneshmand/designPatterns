package com.company.abstractFactoryDesignPattern.bossShip;

import com.company.abstractFactoryDesignPattern.tools.ESEngine;

public class ESUFOBoosEngine implements ESEngine {
    @Override
    public String engineSpeed() {
        return "2000 mph";
    }
}
