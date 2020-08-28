package com.company.abstractFactoryDesignPattern.bossShip;

import com.company.abstractFactoryDesignPattern.EnemyShip;
import com.company.abstractFactoryDesignPattern.EnemyShipFactory;

public class UFOBossEnemyShip extends EnemyShip {
    EnemyShipFactory shipFactory;

    public UFOBossEnemyShip(EnemyShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    @Override
    public void makeShip() {
        System.out.println("Make enemy boos ship " + getName());

        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }
}
