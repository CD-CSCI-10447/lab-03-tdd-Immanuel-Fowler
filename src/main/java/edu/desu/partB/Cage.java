package edu.desu.partB;

import java.util.ArrayList;
import java.util.List;

public class Cage<T extends Animal> {
    private List <T> animals;

    public Cage() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public List<T> getAnimals() {
        return animals;
    }

    // Example: You can create methods to interact with animals in the cage.
    public String MakeAllSounds() {
        String response = "";
        for (T animal : animals) {
            response  += (animal.MakeSound());
        }
        return response;
    }

    public String GetAllNames() {
        String response = "";
        for (T animal : animals) {
            response  += (animal.GetName());
        }
        return response;
    }

    public String GetAllSpecies() {
        String response = "";
        for (T animal : animals) {
            response  += (animal.GetSpecies());
        }
        return response;
    }

    public void Remove(String name){
        for (int i = 0; i<animals.size(); i++){
            if (animals.get(i).GetName() == name){
                animals.remove(i);
            }
        }
    }

    public void findAnimalByName(String name){
        for (int i = 0; i<animals.size(); i++){
            if (animals.get(i).GetName() == name){
                System.out.println("We have found " + name + "they are a " + animals.get(i).GetSpecies() + ". They said " + animals.get(i).MakeSound());
            }
        }
    }
}
