package com.balls;

public class Main {

    public static void main(String[] args) {

        Cow myNewCow = new Cow("Dolly",5,"Fluffy","Yesterday");

        System.out.println(myNewCow.getName());
        System.out.println(myNewCow.getAge());
        System.out.println(myNewCow.getBreed());
        System.out.println(myNewCow.getLastFed());

    }
}
