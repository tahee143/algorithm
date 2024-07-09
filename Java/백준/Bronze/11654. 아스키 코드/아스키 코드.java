import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        br.close();

        int answer = (int) a.charAt(0);
        System.out.println(answer);
    }
}