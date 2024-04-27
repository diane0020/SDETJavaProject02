package org.example;

interface AnimalBehaviour {
    void eat();
    void sleep();
    void makeSound();
}
public abstract class Animal implements AnimalBehaviour{
    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Animal is sleeping");

    }

    @Override
    public void makeSound() {
        System.out.println("Animal is making a sound");

    }
   abstract void displayInformation ();
}

class Mammal extends Animal {
    private String breed;
    private String color;
    private double weight;

    Mammal(String breed, String color, double weight) {
        this.breed = breed;
        this.color = color;
        this.weight = weight;
    }

    @Override
    void displayInformation() {
        System.out.println(breed + " " + color + " " + weight);
    }
}

class Bird extends Animal {
    private String breed;
    private String color;
    private double weight;

    Bird(String breed, String color, double weight) {
        this.breed = breed;
        this.color = color;
        this.weight = weight;
    }

    @Override
    void displayInformation() {
            System.out.println(breed + " " + color + " " + weight);
    }
}

class Lion extends Mammal {
    private int numberOfLegs;
    private String habitat;

    Lion(String breed, String color, double weight) {

        super(breed, color, weight);
    }

    Lion(String breed, String color, double weight, int numberOfLegs, String habitat) {
        super(breed, color, weight);
        this.numberOfLegs = numberOfLegs;
        this.habitat = habitat;
    }

    @Override
    public void eat() {
        System.out.println("Lion loves hunting and eating meat");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps at night");
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    void setHabitat (String habitat) {
        this.habitat = habitat;
    }
    String getHabitat() {
        return habitat;
    }

    void movement(int numberOfLegs) {
        System.out.println("I have " + numberOfLegs + " legs");
    }
}

class Elephant extends Mammal {
    Elephant(String breed, String color, double weight) {
        super(breed, color, weight);
    }

    @Override
    public void eat() {
        System.out.println("I eat plants");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant sleep at night");
    }

    @Override
    public void makeSound() {
        System.out.println("I sound like a trumpet");
    }
}

class Parrot extends Bird {

    Parrot(String breed, String color, double weight) {
        super(breed, color, weight);
    }

    @Override
    public void eat() {
        System.out.println("I eat nuts");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep 12 hours daily");
    }

    @Override
    public void makeSound() {
        System.out.println("I screech and squawk");
    }

}

class ZooEcosystem {
    public static void main(String[] args) {
        Lion [] lions = {new Lion("North Mountain Pride", "Dark Brown", 190),
        new Lion("Pridelands Pride", "Light Mustard", 128)};

        for (Lion lion : lions) {
            lion.eat();
            lion.makeSound();
            lion.sleep();
            lion.movement(4);
            System.out.println();
        }

    }
}
