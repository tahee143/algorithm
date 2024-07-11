import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x = Integer.parseInt(br.readLine()); // 총 금액
        int n = Integer.parseInt(br.readLine()); // 물건 종류 수

        int sum = 0;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int price = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            sum += (price * num);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum == x ? "Yes" : "No");

        System.out.println(sb);

    }
}