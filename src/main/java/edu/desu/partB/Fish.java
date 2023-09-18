package edu.desu.partB;

public class Fish extends Animal{
    public Fish(String name) {
        super(name);
    }

    @Override
    public String MakeSound() {
        return "Gulp!";
    }

}
