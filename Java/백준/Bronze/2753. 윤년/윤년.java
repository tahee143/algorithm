import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        sc.close();

        // 윤년 4배수 && 100배수 아니거나 400 배수 -> 1
        if(a % 4 == 0) {
            if (a % 400 == 0) System.out.println("1");
            else if (a % 100 == 0) System.out.println("0");
            else System.out.println("1");
        }
        else System.out.println("0");

    }
}