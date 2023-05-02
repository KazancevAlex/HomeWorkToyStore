package org.example;

import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        Toy toy1 = new Toy(0, "Машина", 40);
        Toy toy2 = new Toy(1, "Пистолет", 60);
        Toy toy3 = new Toy(2, "Динозавр", 10);
        Toy toy4 = new Toy(3, "Кукла", 90);
        Toy toy5 = new Toy(4, "Настоьная игра", 55);

        List<Toy> toys = new ArrayList<>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);
        toys.add(toy5);

        ToyStore toyStore = new ToyStore(toys);
        toyStore.saveToy();
        toyStore.saveToy();
        toyStore.saveToy();
        toyStore.saveToy();
        toyStore.saveToy();
    }
}