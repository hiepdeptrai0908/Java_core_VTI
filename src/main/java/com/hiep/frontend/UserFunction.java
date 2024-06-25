package com.hiep.frontend;

import com.hiep.entity.User;
import com.hiep.repository.UserRepository;
import com.hiep.util.ScannerUtil;
import lombok.AllArgsConstructor;

import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserRepository repository;

    public void showMenu() throws SQLException {
        while (true) {
            System.out.println("👉Mời bạn chọn chức năng:");
            System.out.println("1. Hiển thị danh sách USER");
            System.out.println("2. Thêm USER");
            System.out.println("3. Thoát chương trình");
            int menu = ScannerUtil.inputInt();
            if (menu == 1) {
                findAll();
            } else if (menu == 2) {
                create();
            }else if (menu == 3) {
                System.out.println("👉Đã kết thúc chương trình");
                return;
            } else {
                System.err.println("👉Vui lòng chọn đúng chương trình");
            }
        }
    }

    private void findAll() throws SQLException {
        List<User> users = repository.findAll();
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULLNAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-23s | %-23s |%n", "NULL", "NULL", "NULL");
            System.out.println("+------+-------------------------+-------------------------+");

        }else {
            for (User user : users) {
                System.out.printf("| %-4s | %-23s | %-23s |%n", user.getId(), user.getFullName(), user.getEmail());
                System.out.println("+------+-------------------------+-------------------------+");
            }
        }
    }

    private void create() throws SQLException {
        System.out.println("Mời bạn nhập thông tin user");
        System.out.println("Nhập full name:");
        String fullName = ScannerUtil.inputFullName();
        System.out.println("Nhập email:");
        String email = ScannerUtil.inputEmail();
        UserRepository repository = new UserRepository();
        repository.create(fullName, email);
    }
}
