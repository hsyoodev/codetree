import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int gcd = GCD(Math.max(n, m), Math.min(n, m));
        int lcm = n * m / gcd;
        
        System.out.print(lcm);
    }

    public static int GCD(int n, int m) {
        if(n % m == 0) {
            return m;
        }

        return GCD(m, n % m);
    }
}