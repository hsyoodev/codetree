import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        printNLines(N);

        scanner.close();
    }

    public static void printNLines(int N) {
        for(int i = 0; i < N; i++) {
            System.out.println("12345^&*()_");
        }
    }
}