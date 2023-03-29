package bai_tap;

import java.io.IOException;
import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập cạnh a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập cạnh b: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập cạnh c: ");
        int c = Integer.parseInt(sc.nextLine());
        if (a+b>c){
            System.out.println("Bạn vừa nhập 3 cạnh của 1 tam giác");
        } else if (a+c>b){
            System.out.println("Bạn vừa nhập 3 cạnh của 1 tam giác");
        }
        try {
            System.out.println("Bạn vừa nhập 3 cạnh của 1 tam giác");
        } catch (IOException e) {
            System.out.println("đây không phải tam giác"+e.getMessage());
        }
    }
}
