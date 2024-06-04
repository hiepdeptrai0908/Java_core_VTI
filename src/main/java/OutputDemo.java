public class OutputDemo {
    public static void main(String[] args) {
        // Escape characters
        //

        // System.out.printf
        // %s: Đại diện String
        // %d: Đại diện số nguyên
        // %f: Đại diện cho số thực
        // %c: Đại diện cho kí tự
        // %n: Xuống dòng

        // Căn lề
        // Số dương căn lề phải, âm căn lề trái
        System.out.println("+----+--------------------+");
        System.out.println("| ID |     FULL NAME      |");
        System.out.println("+----+--------------------+");
        System.out.printf("| %2d | %18s |%n", 1, "Khoa");
        System.out.println("+----+--------------------+");
        System.out.printf("| %-2d | %-18s |%n", 2, "Long");
        System.out.println("+----+--------------------+");

        // Gom nhóm, làm tròn
        double money = 123423442332.789;
        System.out.printf("money = %,.2f", money); // Gom nhóm và làm tròn 2 chữ số sau dấu phẩy
    }
}
