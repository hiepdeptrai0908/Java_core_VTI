package util;

import java.util.Scanner;

public class ScannerUtil {
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * @author: Quang Hiệp
     * @description: Kết quả trả ra là 1 chuỗi String:
     * Loại bỏ khoảng trắng 2 bên,
     * Thay nhiều khoảng trống bằng 1 khoảng trống duy nhất.
     * @date: 2024/07/09
     */
    public static String inputString() {
        return SCANNER.nextLine().trim().replaceAll("\\s{2,}", " ");
    }

    /**
    *@author: Quang Hiệp
    *@description: Dữ liệu truyền vào phải là số nguyên
    *@date: 2024/07/09
    */
    public static int inputInt() {
        while (true) {
            try {
                String input = inputString();
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập số nguyên.");
                System.out.println("Nhập lại:");
            }
        }
    }

    /**
    *@author: Quang Hiệp
    *@description: Email phải chứa ký tự "@"
    *@date: 2024/07/09
    */
    public static String inputEmail() {
        while (true) {
            String input = inputString();
            if (input.contains("@")) {
                return input;
            } else {
                System.err.println("Email phải chứa ký tự '@'.");
                System.out.println("Nhập lại Email:");
            }
        }
    }

    /**
    *@author: Quang Hiệp
    *@description: Mật khẩu từ 6 đến 12 ký tự
    *@date: 2024/07/09
    */
    public static String inputPassword() {
        while (true) {
            String input = inputString();
            int inputLength = input.length();
            if (inputLength < 6 || inputLength > 12) {
                System.err.println("Hãy nhập mật khẩu từ 6 tới 12 ký tự.");
                System.out.println("Nhập lại mật khẩu:");
            } else {
                return input;
            }
        }
    }

    /**
    *@author: Quang Hiệp
    *@description: Full name chỉ chứa chữ, không chứa bất kỳ kí tự đặc biệt nào
    *@date: 2024/07/09
    */
    public static String inputFullName() {
        while (true) {
            String input = inputString();
            if(isAlphabetic(input)) {
                return input;
            } else {
                System.err.println("Họ và tên chỉ chứa chữ, không chứa bất kỳ kí tự đặc biệt nào.");
                System.out.println("Nhập lại họ và tên:");
            }
        }
    }

    /**
    *@author: Quang Hiệp
    *@description: Kiểm tra chuỗi chỉ chứa chữ, không chứa bất kỳ kí tự đặc biệt nào
    *@date: 2024/07/09
    */
    private static boolean isAlphabetic(String string) {
        for (int i = 1; i < string.length(); i++) {
            char c = string.charAt(i);
            if(Character.isWhitespace(c)) {
                continue;
            }
            if (!Character.isAlphabetic(c)) {
                return false;
            }
        }
        return true;
    }
}
