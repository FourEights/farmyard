package com.balls;

public class Sheep extends Animal {
    protected String lastSheared;

    public Sheep(String name, int age, String breed, String lastSheared) {
        super(name, age, breed);
        this.lastSheared = lastSheared;
    }

    public String getLastSheared() {
        return lastSheared;
    }

    public void setLastSheared(String lastSheared) {
        this.lastSheared = lastSheared;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", lastSheared='" + lastSheared + '\'' +
                '}';
    }
}