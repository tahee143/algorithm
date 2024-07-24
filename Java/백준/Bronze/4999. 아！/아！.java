import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String me = br.readLine();
        String doctor = br.readLine();

        sb.append(me.length() >= doctor.length() ? "go" : "no");

        System.out.println(sb);
        br.close();
    }
}