package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class ToyStore {
    private final List<Toy> toys;

    public ToyStore(List<Toy> toys) {
        this.toys = toys;
    }

    public Toy getToyForPrice() {
        Randomize random = new Randomize();
        Toy toy = random.chooseOnWeight(toys);
        return toy;
    }

    public void saveToy() {
        Toy toy = getToyForPrice();
        String text = toy.toString();
        try(FileWriter writer = new FileWriter("C:/Users/DNS/IdeaProjects/HomeWorkToyStore/src/main/java/Toys.txt", true))
        {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);

    }

}