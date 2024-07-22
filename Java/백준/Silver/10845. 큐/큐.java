import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        int num = 0;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch (s) {
                case "push" :
                    num = Integer.parseInt(st.nextToken());
                    q.offer(num);
                    break;
                case "pop" :
                    sb.append(q.isEmpty() ? "-1" : q.poll()).append("\n");
                    break;
                case "size" :
                    sb.append(q.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(q.isEmpty() ? "1" : "0").append("\n");
                    break;
                case "front" :
                    sb.append(q.isEmpty() ? "-1" : q.peek()).append("\n");
                    break;
                case "back" :
                    sb.append(q.isEmpty() ? "-1" : num).append("\n");
                    break;
            }
        }

        System.out.println(sb);
        br.close();
    }
}