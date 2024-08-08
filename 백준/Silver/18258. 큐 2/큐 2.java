import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> q = new ArrayDeque<>();

        while (n-- > 0){
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {

                case "push" :
                    q.offer(Integer.parseInt(st.nextToken()));
                    break;

                case "pop" :
                    Integer i = q.poll();
                    sb.append(i == null ? -1 : i).append("\n");
                    break;

                case "size" :
                    sb.append(q.size()).append("\n");
                    break;

                case "empty" :
                    sb.append(q.isEmpty() ? 1 : 0).append("\n");
                    break;

                case "front" :
                    Integer frontI = q.peek();
                    sb.append(frontI == null ? -1 : frontI).append("\n");
                    break;

                case "back" :
                    Integer backI = q.peekLast();
                    sb.append(backI == null ? -1 : backI).append("\n");
                    break;
            }
        }

        br.close();
        System.out.println(sb);
    }
}