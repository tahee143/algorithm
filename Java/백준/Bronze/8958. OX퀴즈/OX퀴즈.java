import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++){
            String s = br.readLine();
            int sum = 0; // 총 점수
            int ch = 0; // 연속 체크
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == 'O') {
                    ch++; // 정답이면 연속 체크 증가
                    sum += ch;
                } else {
                    ch = 0; // 오답이면 연속 체크 초기화
                }
            }
            bw.append(String.valueOf(sum)).append("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}