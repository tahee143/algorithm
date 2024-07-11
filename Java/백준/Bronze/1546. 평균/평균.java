import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n];
        int max = 0;
        double sum = 0;
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            sum += num;
            max = Math.max(max, num);
        }
        br.close();

        double avg = (sum / max * 100 / n);
        StringBuilder sb = new StringBuilder();
        sb.append(avg);
        System.out.println(sb);
    }
}