package com.company.strategyPattern;

public class Animal {

    private String name;
    private int weight;
    private String sound;
    public Fly flyingType;

    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlyingAbility(Fly newFlyType){
        flyingType = newFlyType;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
