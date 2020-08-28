package com.company.abstractFactoryDesignPattern.normalShip;

import com.company.abstractFactoryDesignPattern.tools.ESWeapon;

public class ESUFOGun implements ESWeapon {
    @Override
    public String gunDamage() {
        return "20 Damage";
    }
}
