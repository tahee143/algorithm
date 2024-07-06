import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        sc.close();

        System.out.println(factorial(a) + "\n");

    }

    static int factorial(int n) {
        int result = 1;
        for(int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}