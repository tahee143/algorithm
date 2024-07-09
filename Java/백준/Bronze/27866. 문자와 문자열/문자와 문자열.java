import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        int idx = Integer.parseInt(br.readLine());
        
        br.close();
        
        bw.write(a.charAt(idx-1));
        
        bw.flush();
        bw.close();
    }
}