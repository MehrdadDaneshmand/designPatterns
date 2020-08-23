package com.company.factoryDesignPattern;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {

        Scanner loopApp = null;
        do{
            EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
            EnemyShip enemyShip = null;
            System.out.print("Enter Ship type (R,U,B) : ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                String type = scanner.nextLine();
                enemyShip = enemyShipFactory.makeEnemyShip(type);
            }
            if (enemyShip != null)
                doStuffEnemy(enemyShip);
            else
                System.out.println("Press U , R or B next time!");
            System.out.print(" Reset App ? Y/N ");
            loopApp = new Scanner(System.in);
        } while (loopApp.nextLine().equals("Y"));

    }

    public static void doStuffEnemy(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
