import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int arr[] = new int[n];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int I = Integer.parseInt(st.nextToken()); // 시작
            int J = Integer.parseInt(st.nextToken()); // 종료
            int K = Integer.parseInt(st.nextToken()); // 넣을 공

            for(int j = I - 1; j < J; j++){ // I번부터 J까지 K번 공 넣기
                arr[j] = K;
            }
        }
        br.close();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }
}