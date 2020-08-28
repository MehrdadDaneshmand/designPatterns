package com.company.abstractFactoryDesignPattern;

import com.company.abstractFactoryDesignPattern.normalShip.UFOEnemyShipBuilding;

public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipBuilding makeUFOs = new UFOEnemyShipBuilding();
        EnemyShip theGrunt = makeUFOs.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = makeUFOs.orderTheShip("UFO BOSS");
        System.out.println(theBoss + "\n");

    }
}
