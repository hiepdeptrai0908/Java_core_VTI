package frontend;

import controller.UserController;
import entity.UserEntity;
import lombok.AllArgsConstructor;
import util.ScannerUtil;

import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserController userController;

    public void showMenu() {
        while (true){
            System.out.println("Mời bạn chọn chương trình:");
            System.out.println("1. Đăng Nhập");
            System.out.println("2. Tìm kiếm Employee và Manager");
            System.out.println("3. Đóng chương trình");
            int input = ScannerUtil.inputInt();

            if (input == 1) {
                loginAdmin();
            } else if (input == 2) {
                findEmployeeAndManagerByProjectId();
            } else if (input == 3) {
                return;
            }
        }
    }

    private void loginAdmin() {
        while (true) {
            System.out.println("Vui lòng nhập email:");
            String email = ScannerUtil.inputEmail();

            System.out.println("Vui lòng nhập mật khẩu:");
            String password = ScannerUtil.inputPassword();

            UserEntity user = userController.findAdminByEmailAndPassword(email, password);
            if (user == null) {
                System.err.println("Email hoặc mật khẩu không đúng");
                System.out.println("Nhập lại:");
            }else {
                showMenuAdmin();
                return;
            }
        }
    }

    private void showMenuAdmin() {
        while (true){
            System.out.println("Mời admin chọn chương trình:");
            System.out.println("1. Tìm kiếm Employee và Manager");
            System.out.println("2. Thêm user mới");
            System.out.println("3. Đăng xuất");
            int input = ScannerUtil.inputInt();

            if (input == 1) {
                findEmployeeAndManagerByProjectId();
            } else if (input == 2) {
                createUser();
            } else if (input == 3) {
                System.out.println("Bạn đã đăng xuất.");
                return;
            }
        }
    }

    private void findEmployeeAndManagerByProjectId() {
        System.out.println("Hãy nhập poject id:");
        int projectId = ScannerUtil.inputInt();

        List<UserEntity> users = userController.findEmployeeAndManagerByProjectId(projectId);
        System.out.println("+----------+--------------------+------------------------------+--------------------+----------+------------+------------+--------------------+");
        System.out.printf("| %-8s | %-18s | %-28s | %-18s | %-8s | %-10s | %-10s | %-18s |%n", "ID", "FULL NAME", "EMAIL", "PASSWORD", "NĂM EXP", "PRO SKILL", "PROJECT ID", "ROLE");
        System.out.println("+----------+--------------------+------------------------------+--------------------+----------+------------+------------+--------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-8s | %-18s | %-28s | %-18s | %-8s | %-10s | %-10s | %-18s |%n", "ID", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL", "NULL");
            System.out.println("+----------+--------------------+------------------------------+--------------------+----------+------------+------------+--------------------+");
        }else {
            for (UserEntity user : users) {
                System.out.printf("| %-8s | %-18s | %-28s | %-18s | %-8s | %-10s | %-10s | %-18s |%n", user.getId(), user.getFullName(), user.getEmail(), user.getPassword(), user.getExpInYear(), user.getProSkill(), user.getProjectId(), user.getRole());
                System.out.println("+----------+--------------------+------------------------------+--------------------+----------+------------+------------+--------------------+");
            }
        }

    }

    private void createUser () {
        System.out.println("Bạn hãy nhập những thông tin sau đây để thêm user mới");
        System.out.println("Họ và tên:");
        String fullName = ScannerUtil.inputFullName();

        System.out.println("Email:");
        String email = ScannerUtil.inputEmail();

        int result = userController.createUser(fullName, email);
        System.out.printf("Đã tạo thành công %d user.%n", result);
    }
}
