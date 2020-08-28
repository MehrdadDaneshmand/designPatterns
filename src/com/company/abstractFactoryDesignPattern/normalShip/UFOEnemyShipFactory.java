package com.company.abstractFactoryDesignPattern.normalShip;

import com.company.abstractFactoryDesignPattern.EnemyShipFactory;
import com.company.abstractFactoryDesignPattern.tools.ESEngine;
import com.company.abstractFactoryDesignPattern.tools.ESWeapon;

public class UFOEnemyShipFactory implements EnemyShipFactory {
    @Override
    public ESWeapon addESGun() {
        return new ESUFOGun();
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOEngine();
    }
}
