import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String s = br.readLine();
        br.close();

        for(String word : arr){
            s = s.replace(word, ".");
        }

        StringBuilder sb = new StringBuilder();
        sb.append(s.length());
        System.out.println(sb);
    }
}