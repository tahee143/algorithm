import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 참가자수

        int[] shirts = new int[6];
        st = new StringTokenizer(br.readLine()); // 사이즈별 신청자 수
        for(int i = 0; i < 6; i++){
            shirts[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine()); // 티셔츠, 펜 묶음
        int shirt = Integer.parseInt(st.nextToken());
        int pen = Integer.parseInt(st.nextToken());

        br.close();
        int count = 0; // 셔츠 묶음
        for(int i = 0; i < 6; i++){
             count += shirts[i] / shirt;
             if(shirts[i] % shirt > 0) count++; // 나머지 있어도 묶음 증가
        }

        StringBuilder sb = new StringBuilder();

        sb.append(count).append("\n"); // 셔츠 묶음
        sb.append(n / pen).append(" ").append(n % pen); // 펜 묶음 개별
        System.out.println(sb);
    }
}
