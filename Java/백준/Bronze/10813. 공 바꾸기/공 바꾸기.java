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

        for(int j = 1; j <= n; j++){
            arr[j-1] = j;
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int I = Integer.parseInt(st.nextToken()) - 1;
            int J = Integer.parseInt(st.nextToken()) - 1;

            int temp = arr[J];
            arr[J] = arr[I];
            arr[I] = temp;
        }
        br.close();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }
}