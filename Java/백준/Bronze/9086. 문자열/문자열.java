import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        String a;
        for(int i = 0; i < t; i++){
            a = br.readLine();
            bw.append(a.charAt(0)).append(a.charAt(a.length()-1)).append("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}