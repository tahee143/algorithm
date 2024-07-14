import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        BigInteger bi = factorial(BigInteger.valueOf(n));

        String s = String.valueOf(bi);
        int result = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '0') result++;
            else break;
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append(result);
        System.out.println(result);

    }

    static BigInteger factorial(BigInteger n) {
       return n.compareTo(BigInteger.ONE) <= 0 ? BigInteger.ONE : n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}