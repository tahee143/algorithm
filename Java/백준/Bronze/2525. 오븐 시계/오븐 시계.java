import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cooking = Integer.parseInt(br.readLine());
        br.close();

        h += (cooking / 60);
        m += (cooking % 60);

        if(m >= 60) {
            h += 1;
            m -= 60;
        }

        if(h >= 24){
            h -= 24;
        }

        bw.write(h + " " + m);
        bw.close();
    }
}