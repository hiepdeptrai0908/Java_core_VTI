import java.util.Scanner;

public class Exercise04 {
    void question01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào xâu ký tự");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        int count = 0;
        for (String word : words) {
            if(!(word.isEmpty())) {
                count++;
            }
        }
        System.out.println("số từ là: " + count);
    }

    void question02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào xâu ký tự s1:");
        String s1 = scanner.nextLine();

        System.out.println("Nhập vào xâu ký tự s2:");
        String s2 = scanner.nextLine();

        System.out.println("nối s1 và s2 là: " + s1.concat(s2));
    }

    void question03() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập tên:");
        String s = scanner.nextLine();

        CustomerString capitalizeString = new CustomerString();
        String newString = capitalizeString.capitalize(s);
        System.out.println(newString);
    }

}
