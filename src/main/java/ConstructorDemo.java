import entity.Dog;

public class ConstructorDemo {
    public static void main(String[] args) {
        // Constructor: Hàm khởi tạo
        // 1. tên Constructor trùng với tên class
        // 2. Constructor không có kiểu trả về
        // 3. Dùng khi muốn truyền tham số vào, mặc định k có tham số

        Dog dog = new Dog("Long", 2);
        System.out.println(dog);

    }
}
