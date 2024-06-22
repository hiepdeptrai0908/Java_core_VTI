package exercise05.question01;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo danh sách để lưu thông tin cán bộ
        List<CanBo> danhSachCanBo = new LinkedList<>();
        HandleCanBo handleCanBo = new HandleCanBo();

        handleCanBo.ThemCanBo();

        handleCanBo.hienThiDanhSachCanBo();







    }
}
