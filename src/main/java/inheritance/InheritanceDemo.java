package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Tính kế thừa
        // Mục đích: Tái sử dụng code
        // Từ khoá: extend
        Duck duck = new Duck("Ngọc" , 2);
        duck.eat();

        // @Override: ghi đè
        duck.eat();
        // từ khoá  super: tham chiếu đến class cha


    }
}
