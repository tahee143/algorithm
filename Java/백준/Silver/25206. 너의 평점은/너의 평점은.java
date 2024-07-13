import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double sum = 0;
        double score = 0;
        // 전공 평점 (학점 * 과목평점) 합 / 학점의 합
        for(int i = 0; i < 20; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken(); //과목명
            double n = Double.parseDouble(st.nextToken()); // 학점
            String grade = st.nextToken(); // 점수

            if (!grade.equals("P")) {
                score += n; // 총학점
                switch (grade) {  //
                    case "A+":
                        sum += 4.5 * n;
                        break;
                    case "A0":
                        sum += 4.0 * n;
                        break;
                    case "B+":
                        sum += 3.5 * n;
                        break;
                    case "B0":
                        sum += 3.0 * n;
                        break;
                    case "C+":
                        sum += 2.5 * n;
                        break;
                    case "C0":
                        sum += 2.0 * n;
                        break;
                    case "D+":
                        sum += 1.5 * n;
                        break;
                    case "D0":
                        sum += n;
                        break;
                    case "F":
                        sum += 0.0;
                        break;
                }
            }
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        sb.append(sum / score);
        System.out.println(sb);
    }
}