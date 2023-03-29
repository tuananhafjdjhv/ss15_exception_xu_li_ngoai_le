package thuc_hanh.debug_ung_dung_java;


import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HÃY nhâpj x: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("HÃY nhâpj y: ");
        int y = Integer.parseInt(sc.nextLine());
        NumberFormatException numberFormatException = new NumberFormatException();
        numberFormatException.calculate(x,y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (Exception e) {
            System.out.println("Xảy ra ngoại lệ " + e.getMessage());
        }
    }
}
