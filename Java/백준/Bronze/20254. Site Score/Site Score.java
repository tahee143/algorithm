import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ur = Integer.parseInt(st.nextToken()) * 56;
        int tr = Integer.parseInt(st.nextToken()) * 24;
        int uo = Integer.parseInt(st.nextToken()) * 14;
        int to = Integer.parseInt(st.nextToken()) * 6;
        int answer = 0;

        answer += (ur + tr + uo + to);
        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        System.out.println(sb);
    }
}