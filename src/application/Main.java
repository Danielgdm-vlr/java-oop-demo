package application;

import pets.Animal;
import pets.Cat;
import pets.Dog;

@SuppressWarnings("java:S1220")
public class Main {

    public static void main(String[] args) {

        workWithAnimals();
    }

    public static void workWithAnimals() {

        System.out.println("\n -> Dog object logic from Dog reference");
        Dog dog = new Dog(10, "Rex", true);
        doAnimalActions(dog);
        dog.run();

        System.out.println("\n---\n");
        System.out.println(" -> Dog object logic from animal reference");
        Animal dogAnimal = dog;
        doAnimalActions(dogAnimal);

        System.out.println("\n---\n");
        System.out.println(" -> Cat object logic from cat reference");
        Cat cat = new Cat("black", "Luna", true);
        doAnimalActions(cat);
        cat.play();

        Animal catAnimal = cat;
        System.out.println("\n---\n");
        System.out.println(" -> Cat object logic from animal reference");
        doAnimalActions(catAnimal);


        System.out.println("\n---\n");
        System.out.println(" -> Animal object logic from animal reference");
        Animal animal = new Animal();
        doAnimalActions(animal);

        System.out.println("\n---\n");
        System.out.println(" -> GC logic");
        Dog gcDog = new Dog(15, "Pufi", true);
        System.out.println(gcDog);
        gcDog = new Dog();
        System.out.println(gcDog);
    }

    private static void doAnimalActions(Animal animal) {

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.makeSound();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.makeSound();
        }
        else {
            animal.makeSound();
        }
        animal.feed();
        animal.walk();
    }
}