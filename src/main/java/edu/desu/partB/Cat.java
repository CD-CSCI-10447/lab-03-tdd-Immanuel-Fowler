package edu.desu.partB;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String MakeSound() {
        return "Meow!";
    }

}
