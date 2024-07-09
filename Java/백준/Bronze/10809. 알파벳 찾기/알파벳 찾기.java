import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer[] = new int[26];
        Arrays.fill(answer, -1);

        String s = br.readLine();
        br.close();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(answer[c - 'a'] == -1){
                answer[c - 'a'] = i;
            }
        }

        for(int j = 0; j < answer.length; j++){
            bw.append(String.valueOf(answer[j])).append(" ");
        }

        bw.flush();
        bw.close();

    }
}