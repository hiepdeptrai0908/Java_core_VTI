package entity;

public class Dog {
    public String name;
    protected int age;

    public Dog(String name, int age) {
        System.out.println("khởi tạo 2 tham số");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "entity.Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
