package pets;

public class Dog extends Animal {

    private Integer age;

    public Dog() {
        super("test", false);
        this.age = 3;
    }

    public Dog(int age, String name, boolean isHungry) {

        super(name, isHungry);
        this.age = age;
    }

    @Override
    protected void eat() {

        System.out.println("Dog is chewing on bones");
    }

    public static void makeSound() {

        System.out.println("Animal makes a sound: WOOF");
    }

    @Override
    public String toString() {
        return "Dog [age: " + age + ", " + super.toString() + "]";
    }

    public void run() {

        System.out.println("Dog is running after a ball");
    }
}
