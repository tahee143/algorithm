import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true){
            StringBuilder s = new StringBuilder(br.readLine());
            if(s.toString().equals("0")) break;
            sb.append(s.toString().equals(s.reverse().toString()) ? "yes \n" : "no \n");
        }
        br.close();
        System.out.println(sb);
    }
}