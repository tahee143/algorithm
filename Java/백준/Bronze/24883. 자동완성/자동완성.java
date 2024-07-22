import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String n = br.readLine().toLowerCase();

        sb.append(n.equals("n") ? "Naver D2" : "Naver Whale");

        System.out.println(sb);
        br.close();
    }
}