import entity.Dog;

public class AccessModifierDemo {
    public static void main(String[] args) {
        // PHẠM VI TRUY CẬP
        // public: Mọi nơi
        Dog dog = new Dog("Long", 2);
        System.out.println("dog.name = " + dog.name);
//        System.out.println("dog.age = " + dog.age);
        // protected: Cùng trong package hoặc class con
        // default: Cùng package
        // private: Cùng class
    }
}
