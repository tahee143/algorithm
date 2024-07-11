import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();
        StringBuilder sb;

        int a = Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder().append(st.nextToken()).reverse().toString());
        int max = Math.max(a, b);

        sb = new StringBuilder().append(max);
        System.out.println(sb);
    }
}