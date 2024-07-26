import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            st = new StringTokenizer(str);

            switch (st.nextToken()) {
                case "1" :
                    s.push(Integer.parseInt(st.nextToken()));
                    break;
                case "2" :
                    sb.append(s.isEmpty() ? -1 : s.pop()).append("\n");
                    break;
                case "3" :
                    sb.append(s.size()).append("\n");
                    break;
                case "4" :
                    sb.append(s.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "5" :
                    sb.append(s.isEmpty() ? -1 : s.peek()).append("\n");
                    break;
            }
        }

        br.close();
        System.out.println(sb);
    }
}