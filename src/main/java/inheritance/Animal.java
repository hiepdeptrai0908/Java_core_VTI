package inheritance;

public class Animal {
    protected String name;
    protected int age;

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
