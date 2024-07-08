package pets;

public class Cat extends Animal {

    private String color;

    public Cat(String color, String name, boolean isHungry) {

        super(name, isHungry);
        this.color = color;
    }

    @Override
    protected void eat() {

        System.out.println("Cat is eating its cat food");
    }

    public static void makeSound() {

        System.out.println("Cat makes a sound: MEOWW");
    }

    public void play() {

        System.out.println("Cat is playing with a mouse");
    }
}
