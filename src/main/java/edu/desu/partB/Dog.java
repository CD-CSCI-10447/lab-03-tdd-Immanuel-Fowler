package edu.desu.partB;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String MakeSound() {
        return "Bark!";
    }

}
