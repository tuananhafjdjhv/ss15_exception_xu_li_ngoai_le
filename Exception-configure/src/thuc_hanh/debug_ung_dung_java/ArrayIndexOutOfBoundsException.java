package thuc_hanh.debug_ung_dung_java;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= rd.nextInt(100);
            System.out.println(arr[i]+" ");
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
        Integer[] arr = arrayIndexOutOfBoundsException.createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chỉ số của 1 phần tử bất kì ");
        int x = sc.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5"+x+" là "+ arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.err.println("chỉ số vượt quá giới hạn của mảng");
        }
    }
}
