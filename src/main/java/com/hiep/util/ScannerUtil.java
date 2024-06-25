package com.hiep.util;

import java.util.Scanner;

public class ScannerUtil {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static String inputString() {
        return SCANNER.nextLine().trim().replaceAll("\\s{2,}", " ");
    }

    public static int inputInt() {
        while (true) {
            try{
                String input = inputString();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.err.println("Yêu cầu nhập số nguyên.");
                System.err.println("Nhập lại:");
            }
        }
    }

    public static String inputFullName() {
        return inputString();
    }

    public static String inputEmail() {
        return inputString();
    }

}
