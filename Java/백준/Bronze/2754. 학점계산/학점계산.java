import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        br.close();

        char grade = a.charAt(0);
        double answer = 0.0;

        if(grade == 'A'){
            answer += 4;
        } else if (grade == 'B') {
            answer += 3;
        } else if (grade == 'C') {
            answer += 2;
        } else if (grade == 'D') {
            answer += 1;
        } else {
            System.out.println(answer);
            return;
        }

        if(a.charAt(1) == '+'){
            answer += 0.3;
        } else if (a.charAt(1) == '-') {
            answer -= 0.3;
        }

        System.out.println(answer);
    }
}