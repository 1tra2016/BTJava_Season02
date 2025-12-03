import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập một số nguyên từ 1-12:");
        int n = scan.nextInt();
        switch(n){
            case 1:
                System.out.printf("Tháng %d có 31 ngày",n);
                break;
            case 2:
                System.out.printf("Tháng %d có 28 hoặc 29 ngày",n);
                break;
            case 3:
                System.out.printf("Tháng %d có 31 ngày",n);
                break;
            case 4:
                System.out.printf("Tháng %d có 30 ngày",n);
                break;
            case 5:
                System.out.printf("Tháng %d có 31 ngày",n);
                break;
            case 6:
                System.out.printf("Tháng %d có 30 ngày",n);
                break;
            case 7:
                System.out.printf("Tháng %d có 31 ngày",n);
                break;
            case 8:
                System.out.printf("Tháng %d có 31 ngày",n);
                break;
            case 9:
                System.out.printf("Tháng %d có 30 ngày",n);
                break;
            case 10:
                System.out.printf("Tháng %d có 31 ngày",n);
                break;
            case 11:
                System.out.printf("Tháng %d có 30 ngày",n);
                break;
            case 12:
                System.out.printf("Tháng %d có 31 ngày",n);
                break;
            default: System.out.println("Tháng không hợp lệ!");
        }

    }
}