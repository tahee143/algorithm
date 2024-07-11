import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double[] arr = new double[n];
        double max = 0;
        for(int i = 0; i < n; i++){
            double num = Double.parseDouble(st.nextToken());
            arr[i] = num;
            if(max < num) max = num;
        }

        br.close();

        double avg = 0;
        for(double num : arr){
            avg += ((num/max)*100);
        }

        avg /= n;

        StringBuilder sb = new StringBuilder();
        sb.append(avg);
        System.out.println(sb);
    }
}