package com.company.abstractFactoryDesignPattern.normalShip;

import com.company.abstractFactoryDesignPattern.EnemyShip;
import com.company.abstractFactoryDesignPattern.EnemyShipFactory;

public class UFOEnemyShip extends EnemyShip {

    EnemyShipFactory shipFactory;
    public UFOEnemyShip(EnemyShipFactory shipFactory){
        this.shipFactory = shipFactory;
    }


    @Override
    public void makeShip() {
        System.out.println("Make enemy ship " + getName());

        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }
}
