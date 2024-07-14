import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //의견 개수
        int[] arr = new int[n]; // 의견
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        Arrays.sort(arr); // 정렬

        // 30% 절사 평균 -> 위, 아래 15%는 제외하고 평균
        int c = (int) Math.round(n * 0.15); // 제외할 인원
        double sum = 0;
        for(int i = c; i < n-c; i++){
            sum += arr[i];
        }

        int answer = (int) Math.round(sum / (n - c * 2));

        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        System.out.println(sb);
    }
}