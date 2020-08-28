package com.company.abstractFactoryDesignPattern;

import com.company.abstractFactoryDesignPattern.tools.ESEngine;
import com.company.abstractFactoryDesignPattern.tools.ESWeapon;

public abstract class EnemyShip {

    private String name;
    public ESWeapon weapon;
    public ESEngine engine;
    private double amtDamage;

    public abstract void makeShip();

    public void followHeroShip(){
        System.out.println(getName() + " is following the hero.");
    }

    public void displayEnemyShip(){
        System.out.println(getName() + " is on the Screen");
    }

    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and does " + getAmtDamage());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", weapon=" + weapon.gunDamage() +
                ", engine=" + engine.engineSpeed() +
                ", amtDamage=" + amtDamage ;
    }
}
