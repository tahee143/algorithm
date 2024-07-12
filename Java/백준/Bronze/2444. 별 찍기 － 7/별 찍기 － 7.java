import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        // 증가
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){ // 공백 4, 3, ... 감소
                sb.append(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++){ // 1, 3, 4, 7, .. 증가
                sb.append("*");
            }
            sb.append("\n");
        }

        // 감소
        for(int i = 1; i <= n - 1; i++){
            for(int j = 1; j <= i; j++){ // 공백 1, 2, ... 증가
                sb.append(" ");
            }
            for(int k = 1; k <= ((n - i) * 2 -1); k++){ // 7, 5, 3, 1 감소
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}