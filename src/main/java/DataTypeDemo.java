import java.time.LocalDate;

public class DataTypeDemo {
    public static void main(String[] args) {
        // Kiểu số nguyên
        // byte(1), short(2), int(4), long(8)
        int age = 10;
        System.out.println("tuổi của tôi là: " + age);

        // Kiểu số thực
        // float(4) lên tới 7 chữ số thập phân, double(8)
        double pi = 3.141759;
        System.out.println("pi = " + pi);

        // Kiểu logic
        // boolean(1)
        boolean isLoading = true;
        System.out.println("isLoading = " + isLoading);

        // Kiểu kí tự
        // char(2)
        char c = 'C';
        System.out.println("c = " + c);

        // Kiểu xâu kí tự
        // String
        String s = "String java core";
        System.out.println("s = " + s);

        // Kiểu thời gian
        // LocalDate, Local Time, LocalDateTime
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        LocalDate date = LocalDate.of(1998, 5, 31);
        System.out.println("date = " + date);

        // Kiểu enum
        // Giới hạn trạng thái
        UiState state = UiState.DARK;
        System.out.println("state = " + state);

        // Kiểu array (mảng)
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("numbers.length = " + numbers.length);
        // Chỉ số bắt đầu từ số 0
        System.out.println("numbers[0] = " + numbers[0]);
        // Cách khác
        String[] fruits;
        fruits = new String[]{"Apple", "Banana", "Orange", "Grape"};
        System.out.println("fruits.length = " + fruits.length);
        char[] character = new char[5];
        System.out.println("character.length = " + character.length);
        // Cập nhật giá trị
        character[0] = 'H';
        character[1] = 'I';
        character[2] = 'E';
        character[3] = 'P';
        System.out.println("character[0] = " + character[0]);


    }
}
