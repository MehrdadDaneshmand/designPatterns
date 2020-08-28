package com.company.abstractFactoryDesignPattern;

public abstract class EnemyShipBuilding {

    public abstract EnemyShip makeEnemyShip(String typeOfShip);

    public EnemyShip orderTheShip(String typeOfShip){
        EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);
        theEnemyShip.makeShip();
        theEnemyShip.displayEnemyShip();
        theEnemyShip.followHeroShip();
        theEnemyShip.enemyShipShoots();
        return theEnemyShip;

    }
}
