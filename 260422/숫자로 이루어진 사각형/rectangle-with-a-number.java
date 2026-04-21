import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        printRect(N);
    }

    public static void printRect(int N) {
        int number = 1;

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++, number++) {
                System.out.print(((number + 8) % 9 + 1) + " ");
            }
            
            System.out.println();
        }
    }
}