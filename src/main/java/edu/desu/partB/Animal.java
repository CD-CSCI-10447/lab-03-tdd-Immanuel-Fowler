package edu.desu.partB;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public String GetName(){
        return name;
    }

    public String GetSpecies(){
        if (this instanceof Cat){
            return "cat";
        }else if (this instanceof Dog){
            return "dog";
        }else if (this instanceof Bird){
            return "bird";
        }
        return "";
    }

    public abstract String MakeSound();
}
