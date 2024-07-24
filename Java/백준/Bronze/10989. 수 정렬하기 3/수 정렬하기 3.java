import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        // 최대 숫자 10000
        int[] arr = new int[10001];

        // 입력받은 숫자 체크하기
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            arr[num]++;
        }

        // 입력받은 숫자 출력
        for(int i = 1; i <= 10000; i++){
            while (arr[i] > 0){ // 0보다 크면 입력 받았음 의미, 1보다 큰경우 중복된 경우
                sb.append(i).append("\n");
                arr[i]--;
            }
        }

        System.out.println(sb);
        br.close();
    }
}