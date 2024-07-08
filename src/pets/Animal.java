package pets;

import java.text.MessageFormat;

public class Animal {

    private String name;
    private boolean isHungry;

    public Animal() {

        this.name = "animal";
        this.isHungry = true;
    }

    protected Animal(String name, boolean isHungry) {

        this.name = name;
        this.isHungry = isHungry;
    }

    protected void eat() {

        System.out.println("Animal is nom-noming its food");
    }

    public void feed() {

        if(isHungry) {
            System.out.println("Animal is hungry...Feeding time!");
            eat();
        }
        else {
            System.out.println("Animal is not hungry!");
        }
    }

    public void walk() {

        System.out.println(MessageFormat.format("Animal {0} is walking", name));
    }

    public static void makeSound() {

        System.out.println("Animal makes a sound: AAAAAAAAA");
    }

    @Override
    public String toString() {

        return "Base animal [name: " + name + ", isHungry: " + isHungry + "]";
    }
}
