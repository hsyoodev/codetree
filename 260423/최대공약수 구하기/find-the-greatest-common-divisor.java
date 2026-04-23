import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        GCD(Math.max(n, m), Math.min(n, m));
    }

    public static void GCD(int n, int m) {
        if(n % m == 0) {
            System.out.print(m);

            return;
        }

        GCD(m, n % m);
    }
}