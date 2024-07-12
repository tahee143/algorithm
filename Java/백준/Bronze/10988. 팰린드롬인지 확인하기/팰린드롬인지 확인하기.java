import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        br.close();
        if(sb.toString().equals(sb.reverse().toString())) {
            sb = new StringBuilder();
            sb.append("1");
        } else {
            sb = new StringBuilder();
            sb.append("0");
        }

        System.out.println(sb);
    }
}