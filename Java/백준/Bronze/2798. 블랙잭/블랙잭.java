import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n장의 카드 중 3장의 카드는 m을 넘지 않으면서 최대한 가깝게
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n]; // 카드 배열
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        
        int sum = 0; // 합
        int temp = 0; // m에 최대한 가까운 값
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    temp = arr[i] + arr[j] + arr[k]; // 합을 구함
                    if(sum < temp && temp <= m){ // m보다 작거나 같고, 이전에 구한 합보다 크면
                        sum = temp;
                    }
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        System.out.println(sb);
    }
}