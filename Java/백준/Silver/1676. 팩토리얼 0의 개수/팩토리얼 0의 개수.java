import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();

        int result = 0;

        // 5의 배수마다 0이 생김
        while (n >= 5) {
            result += n/5;
            n /= 5;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(result);
        System.out.println(sb);
    }
}