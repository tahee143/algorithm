import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        // 날짜 가져오기
        Date today = new Date();
        // 날짜 형식 지정
        DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
        // 시간대 설정
        df.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
        // 오늘 날짜 출력
        System.out.println(df.format(today));
    }
}