package Encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Tính đóng gói
        // Private các thuộc tính
        // Cung cấp getter / setter
        Cat cat = new Cat("Long", 2);
        System.out.println("cat.getName() = " + cat.getName());
    }
}
