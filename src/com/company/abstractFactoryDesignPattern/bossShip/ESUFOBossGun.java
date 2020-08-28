package com.company.abstractFactoryDesignPattern.bossShip;

import com.company.abstractFactoryDesignPattern.tools.ESWeapon;

public class ESUFOBossGun implements ESWeapon {

    @Override
    public String gunDamage() {
        return "40 Damage";
    }
}
