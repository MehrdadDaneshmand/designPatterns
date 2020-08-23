package com.company.strategyPattern;

public interface Fly {
    String fly();
}

class ItFly implements Fly{

    @Override
    public String fly() {
        return "Fly high";
    }
}

class CantFly implements Fly{

    @Override
    public String fly() {
        return "I can't fly";
    }
}
