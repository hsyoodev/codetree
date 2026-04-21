import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        printRect(n, m);
    }

    public static void printRect(int n, int m) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print("1");
            }
            
            System.out.println();
        }
    }
}