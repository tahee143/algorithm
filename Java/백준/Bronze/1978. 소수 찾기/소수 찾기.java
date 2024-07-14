import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 소수 : 자기 자신과 1을 제외한 약수를 가지고 있지 않는 수
        // 2부터 나누면서 나머지가 0이되면 약수임 중단, 자기자신까지 오면 소수
        int count = 0;
        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(st.nextToken());

            if(a == 1) continue; // 1은 제외

            int x = 0;
            for(int j = 2; j < a; j++){
                if(a % j == 0) {
                    x++;
                    break; // 약수임
                }
            }

            if(x == 0) count++; // 약수가 하나도 없으면 소수
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(count);
        System.out.println(sb);
    }
}