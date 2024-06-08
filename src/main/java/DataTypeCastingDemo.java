public class DataTypeCastingDemo {
    public static void main(String[] args) {
        // Widening : mở rộng
        // byte > short > int > long > float > double
        byte a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Narrowing : thu hẹp
        // double > float > long > int > short > byte
        long m = 7000000000L;
        int n = (int) m;
        System.out.println("n = " + n);
        System.out.println("m = " + m);

        // Chú ý
        int x = 1;
        int y = 2;
        System.out.println((float) x / y);
        System.out.println(x / (float) y);
        System.out.println((float) x / (float) y);
        System.out.println((float) (x / y));         // sai
    }
}
