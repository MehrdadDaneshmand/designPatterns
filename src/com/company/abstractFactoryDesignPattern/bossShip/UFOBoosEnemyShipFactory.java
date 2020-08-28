package com.company.abstractFactoryDesignPattern.bossShip;

import com.company.abstractFactoryDesignPattern.EnemyShipFactory;
import com.company.abstractFactoryDesignPattern.tools.ESEngine;
import com.company.abstractFactoryDesignPattern.tools.ESWeapon;

public class UFOBoosEnemyShipFactory implements EnemyShipFactory {
    @Override
    public ESWeapon addESGun() {
        return new ESUFOBossGun();
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOBoosEngine();
    }
}
