package edu.desu.partB;

public abstract class Animal {
    private String name;
    private String species;

    public Animal(String name){
        this.name = name;
    }

    public String GetName(){
        return name;
    }

    public String GetSpecies(){
        return species;
    }

    public abstract String MakeSound();
}
