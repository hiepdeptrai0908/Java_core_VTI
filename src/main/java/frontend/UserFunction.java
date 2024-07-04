package frontend;

import controller.UserController;
import entity.User;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Scanner;

@AllArgsConstructor
public class UserFunction {
    private UserController controller;
    public void showMenu() {
    Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Mời bạn chọn Menu");
            System.out.println("0. Kết thúc.");
            System.out.println("1. Hiển thị danh sách User.");
            int optionNumber = Integer.parseInt(scanner.nextLine());
            if (optionNumber == 0) {
                return;
            } else if (optionNumber == 1) {
                findAll();
            }
        }

    }

    public void findAll() {
        List<User> users = controller.findAll();
        System.out.println("+----------+--------------------+------------------------------+--------------------+----------+------------+------------+--------------------+");
        System.out.printf("| %-8s | %-18s | %-28s | %-18s | %-8s | %-10s | %-10s | %-18s |%n", "ID", "FULL NAME", "EMAIL", "PASSWORD", "NĂM EXP", "PRO SKILL", "PROJECT ID", "ROLE");
        System.out.println("+----------+--------------------+------------------------------+--------------------+----------+------------+------------+--------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-8s | %-18s | %-28s | %-18s | %-8s | %-10s | %-10s | %-18s |%n", "ID", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL");
            System.out.println("+----------+--------------------+------------------------------+--------------------+----------+------------+------------+--------------------+");
        }else {
            for (User user : users) {
                System.out.printf("| %-8s | %-18s | %-28s | %-18s | %-8s | %-10s | %-10s | %-18s |%n", user.getId(), user.getFullName(), user.getEmail(), user.getPassword(), user.getExpInYear(), user.getProSkill(), user.getProjectId(), user.getRole());
                System.out.println("+----------+--------------------+------------------------------+--------------------+----------+------------+------------+--------------------+");
            }
        }
    }
}
