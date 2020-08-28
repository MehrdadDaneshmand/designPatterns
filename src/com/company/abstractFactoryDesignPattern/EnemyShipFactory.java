package com.company.abstractFactoryDesignPattern;

import com.company.abstractFactoryDesignPattern.tools.ESEngine;
import com.company.abstractFactoryDesignPattern.tools.ESWeapon;

public interface EnemyShipFactory {

    ESWeapon addESGun();
    ESEngine addESEngine();

}
