import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập một số nguyên bất kì:");
        int sum =0;
        int n = scan.nextInt();
        if(n <0) n *= -1;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        System.out.println(sum);
    }
}