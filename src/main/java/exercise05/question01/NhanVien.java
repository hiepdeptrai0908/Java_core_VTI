package exercise05.question01;

public class NhanVien extends CanBo {
    private String congViec;

    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    public NhanVien(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi) {
        super(hoTen, tuoi, gioiTinh, diaChi);


    }
}
