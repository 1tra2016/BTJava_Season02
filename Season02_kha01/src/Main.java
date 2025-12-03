import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 0;
        do {
            System.out.println("Nhập một số nguyên dương:");
            N = scan.nextInt();
        } while (N<=0);
        int sum = 0;
        for(int i = 1; i <= N; i++){
            sum += i;
        }
        System.out.printf("Tổng các số từ 1 đến %d là: %d:",N,sum);

    }
}