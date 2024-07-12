import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        s = s.toUpperCase(); // 대문자로 변환
        int[] c = new int[26];

        for(int i = 0; i < s.length(); i++){ // 아스키코드 이용 A - A = 0 0번 배열 증가
            int n = s.charAt(i) - 'A';
            c[n]++;
        }

        int max = -1;
        int result = -2; // ? 아스키코드 -2
        for(int i = 0; i < 26; i++){
            if(c[i] > max) {
                max = c[i];
                result = i;
            } else if (c[i] == max) {
                result = -2;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append((char)(result + 65));
        System.out.println(sb);
    }
}