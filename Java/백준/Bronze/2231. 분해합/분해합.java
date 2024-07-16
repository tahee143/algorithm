import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();

        // 자연수 n을 만드는 생성자 m을 찾음
        // n 216 = 198 + 1 + 9 + 8
        // 가장 작은 생성자 출력, 없으면 0

        int m = 0; // 제일 작은 생성자

        for(int i = 1; i <= n; i++){ // 1부터 n까지 반복
            int num = i;
            int temp = 0; // 합

            while (num != 0){
                temp += num % 10; // 자리수 합
                num /= 10; // 자리수 합 구하기 위해
            }

            if(temp + i == n){ // 자리수 합과 생성자 합이 n하고 같으면 생성자 찾은 것
                m = i;
                break; // 반복문 종료
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(m);
        System.out.println(sb);
    }
}
