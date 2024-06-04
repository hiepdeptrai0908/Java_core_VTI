import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        // min <= k <= max
        // min + random.nextInt(max - min + 1)
        int min = 100;
        int max = 999;
        int k = min + random.nextInt(max - min + 1);
        System.out.println("k = " + k);

        // Lấy ngẫu nhiên phần tử trong mảng
        String[] fruits = {"apple", "orange", "banana", "apple", "orange", "banana"};
        System.out.println(fruits[random.nextInt(fruits.length)]);
    }
}
