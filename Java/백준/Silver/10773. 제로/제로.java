import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        Stack<Integer> s = new Stack<>();
        int sum = 0;
        for(int i = 0; i < k; i++){
            int n = Integer.parseInt(br.readLine());
            if (n != 0) {
                sum += s.push(n);
            } else if(n == 0) {
                sum -= s.pop();
            }
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        System.out.println(sb);
    }
}