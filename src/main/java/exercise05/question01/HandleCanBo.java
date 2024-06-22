package exercise05.question01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HandleCanBo extends CanBo {
    Scanner scanner = new Scanner(System.in);
    List<CanBo> canBos = new ArrayList<>();

    protected List<CanBo> ThemCanBo() {
        // Tên
        HandleName handleName = new HandleName();
        System.out.println("Hãy Nhập Tên:");
        String hoTen = handleName.CapitalizeName(scanner.nextLine());

        // Tuổi
        System.out.println("Hãy Nhập Tuổi:");
        int tuoi = Integer.parseInt(scanner.nextLine());

        // Giới tính
        System.out.println("Chọn Giới Tính:");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. Khác");
        GioiTinh gioiTinh = GioiTinh.KHAC;
        int keyGioiTinh = Integer.parseInt(scanner.nextLine());
        if (keyGioiTinh == 1) {
            gioiTinh = GioiTinh.NAM;
        } else if (keyGioiTinh == 2) {
            gioiTinh = GioiTinh.NU;
        }else if (keyGioiTinh == 3) {
            gioiTinh = GioiTinh.KHAC;
        }

        // Địa chỉ
        System.out.println("Nhập Địa Chỉ:");
        String diaChi = scanner.nextLine();

        // set thông tin cán bộ
        CanBo canBo = new CanBo();
        canBo.setHoTen(hoTen);
        canBo.setTuoi(tuoi);
        canBo.setGioiTinh(gioiTinh);
        canBo.setDiaChi(diaChi);

        // Thêm thông tin cán bộ vào danh sách
        canBos.add(canBo);
        this.ConfirmThemCanBo();
        return canBos;

    }

    protected void ConfirmThemCanBo() {
        System.out.println("Tiếp tục thêm cán bộ mới:");
        System.out.println("1. Tiếp tục");
        System.out.println("2. Huỷ");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            this.ThemCanBo();
        }
    }

    protected List<CanBo> timKiemCanBo() {
        List<CanBo> timKiemCanBo = new ArrayList<>();

        System.out.println("Nhập họ & tên cán bộ cần tìm kiếm:");
        String hoTen = scanner.nextLine();

        for (CanBo canBo : canBos) {
            System.out.println(canBo);
        }

        return timKiemCanBo;
    }

    protected void hienThiDanhSachCanBo() {
        System.out.println("DANH SACH CAN BO:");
        System.out.println("+------+--------------------+--------------+--------------+--------------------+");
        System.out.printf("|%6s|%-20s|%-14s|%-14s|%-20s|%n","STT","Họ và tên", "Tuổi", "Giới tính", "Địa chỉ");
        System.out.println("|------|--------------------|--------------|--------------|--------------------|");
        for (int i = 0; i < canBos.size(); i++) {
            System.out.printf("|%6d|%-20s|%-14s|%-14s|%-20s|%n",i+1,canBos.get(i).hoTen, canBos.get(i).tuoi, canBos.get(i).gioiTinh, canBos.get(i).diaChi);
        }
        System.out.println("+------+--------------------+--------------+--------------+--------------------+");
    }

}
