package edu.desu.partB;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CageTest {

    private Cage<Cat> catCage;
    private Cage<Dog> dogCage;
    private Cage<Fish> fishCage;
    private Cage<Bird> birdCage;
    private Cage<Animal> animalCage;

    @BeforeEach
    public void setUp() {
        catCage = new Cage<>();
        dogCage = new Cage<>();
        fishCage = new Cage<>();
        birdCage = new Cage<>();
    }

    @Test
    public void TestAddCat() {
        Cat whiskers = new Cat("Whiskers");
        catCage.addAnimal(whiskers);

        assertEquals(1, catCage.getAnimals().size());
        assertTrue(catCage.getAnimals().contains(whiskers));
    }

    @Test
    public void TestMakeCatSounds() {
        Cat whiskers = new Cat("Whiskers");
        Cat fluffy = new Cat("Fluffy");

        catCage.addAnimal(whiskers);
        catCage.addAnimal(fluffy);

        String expectedSound = "Meow!Meow!";
        assertEquals(expectedSound, catCage.MakeAllSounds());
    }

    @Test
    public void testAddDog() {
        Dog rex = new Dog("Rex");
        dogCage.addAnimal(rex);

        assertEquals(1, dogCage.getAnimals().size());
        assertTrue(dogCage.getAnimals().contains(rex));
    }

    @Test
    public void testMakeDogSounds() {
        Dog rex = new Dog("Rex");
        Dog buddy = new Dog("Buddy");

        dogCage.addAnimal(rex);
        dogCage.addAnimal(buddy);

        String expectedSound = "Woof!Woof!";
        assertEquals(expectedSound, dogCage.MakeAllSounds());
    }

    @Test
    public void testAddFish() {
        Fish flipper = new Fish("flipper");
        fishCage.addAnimal(flipper);

        assertEquals(1, fishCage.getAnimals().size());
        assertTrue(fishCage.getAnimals().contains(flipper));
    }

    @Test
    public void testMakeFishSounds() {
        Fish flipper = new Fish("flipper");
        Fish nemo = new Fish("nemo");

        fishCage.addAnimal(flipper);
        fishCage.addAnimal(nemo);

        String expectedSound = "Gulp!Gulp!";
        assertEquals(expectedSound, fishCage.MakeAllSounds());
    }

    @Test
    public void testAddBird() {
        Bird rio = new Bird("rio");
        birdCage.addAnimal(rio);

        assertEquals(1, birdCage.getAnimals().size());
        assertTrue(birdCage.getAnimals().contains(rio));
    }

    @Test
    public void testMakeBirdSounds() {
        Bird rio = new Bird("rio");
        Bird blue = new Bird("blue");

        birdCage.addAnimal(rio);
        birdCage.addAnimal(blue);

        String expectedSound = "CaCaw!CaCaw!";
        assertEquals(expectedSound, birdCage.MakeAllSounds());
    }

    @Test
    public void TestCheckNames() {
        Cat whiskers = new Cat("Whiskers");
        Cat fluffy = new Cat("Fluffy");

        catCage.addAnimal(whiskers);
        catCage.addAnimal(fluffy);

        String expected = "WhiskersFluffy";
        assertEquals(expected, catCage.GetAllNames());
    }

    
}
