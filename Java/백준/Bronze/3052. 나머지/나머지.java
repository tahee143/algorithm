import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num % 42;
        }
        br.close();

        int count = 0;
        boolean check = false;

        for(int i = 0; i < 10; i++){
            check = false;

            for(int j = i + 1; j < 10; j++){
                if(arr[i] == arr[j]) {
                    check = true;
                    break;
                }
            }

            if (!check) count++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(count);
        System.out.println(sb);
    }
}