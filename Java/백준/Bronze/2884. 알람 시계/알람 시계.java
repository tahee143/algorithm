import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m < 45) {
            h--;
            m = 60 - (45 - m);

            if(h < 0) {
                h = 23;
            }
            bw.append(String.valueOf(h)).append(" ").append(String.valueOf(m));
        } else {
            bw.append(String.valueOf(h)).append(" ").append(String.valueOf(m - 45));
        }
        bw.flush();
        bw.close();

    }
}