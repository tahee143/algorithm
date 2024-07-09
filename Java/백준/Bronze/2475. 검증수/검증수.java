import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] a = new int[5];
        for(int i = 0; i < 5; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        int result = func(a);

        System.out.println(result);

    }
    static int func(int[] a){
        int result = 0;
        for(int i = 0; i < 5; i++){
            result += a[i] * a[i];
        }
        result %= 10;
        return result;
    }
}