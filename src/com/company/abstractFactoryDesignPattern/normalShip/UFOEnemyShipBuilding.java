package com.company.abstractFactoryDesignPattern.normalShip;

import com.company.abstractFactoryDesignPattern.EnemyShip;
import com.company.abstractFactoryDesignPattern.EnemyShipBuilding;
import com.company.abstractFactoryDesignPattern.EnemyShipFactory;
import com.company.abstractFactoryDesignPattern.bossShip.UFOBoosEnemyShipFactory;
import com.company.abstractFactoryDesignPattern.bossShip.UFOBossEnemyShip;

public class UFOEnemyShipBuilding  extends EnemyShipBuilding {
    @Override
    public EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;

        if (typeOfShip.equals("UFO")){
            EnemyShipFactory shipPartFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartFactory);
            theEnemyShip.setName("UFI Grunt Ship");
        } else {
            if (typeOfShip.equals("UFO BOSS")){
                EnemyShipFactory shipPartsFactory = new UFOBoosEnemyShipFactory();
                theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
                theEnemyShip.setName("UFO Boos Ship");
            }
        }
        return theEnemyShip;
    }
}
