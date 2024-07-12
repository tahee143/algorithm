import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[26];
        int c = System.in.read(); // 버퍼(inputStream) 사용해 효율적, 문자를 하나씩 가져와 아스키 코드로 변환
        while (c > 64) {
            if (c < 91) {
                arr[c - 65]++;
            } else {
                arr[c - 97]++;
            }
            c = System.in.read();
        }

        int max = -1;
        int ch = -2; // ? 아스키 코드 값 63
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = i;
            } else if (arr[i] == max) {
                ch = -2;
            }
        }
        System.out.println((char) (ch + 65));
    }
}