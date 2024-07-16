import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();

        // 1 -> 2~7 -> 8~19
        // 6 -> 12 -> 18
        // 6의 배수로 늘어남

        int count = 1; // 지나는 방
        int s = 2; // 범위 합

        if(n == 1) {
            sb.append("1"); // 1이면 1개만 지남
        } else {
            while (s <= n){ // 합이 n 범위까지
                s = (count * 6) + s;
                count++;
            }
            sb.append(count);
        }

        System.out.println(sb);
    }
}