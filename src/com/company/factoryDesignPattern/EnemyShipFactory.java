package com.company.factoryDesignPattern;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String shipType) {
        EnemyShip enemyShip = null;
        switch (shipType) {
            case "U":
                return new UFOEnemyShip();
            case "R":
                return new RocketEnemyShip();
            case "B":
                return new BigUFOEnemyShip();
            default:
                return null;
        }
    }

}
