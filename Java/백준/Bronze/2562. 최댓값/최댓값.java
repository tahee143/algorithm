import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        int max = 0;
        int idx = 0;

        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]) {
                max = arr[i];
                idx = i+1;
            }
        }

        br.close();
        bw.append(String.valueOf(max)).append("\n").append(String.valueOf(idx));
        bw.flush();
        bw.close();
    }
}