import java.util.Calendar;

public class WeekExample{
    public static void main(String[] args){
        Week today = null;
        Calendar cal = Calendar.getInstance();
        // 오늘 요일 얻기
        int week = cal.get(Calendar.DAY_OF_WEEK);  //일(1)~토(7)까지 값

        today = switch (week) {
            case 1 -> Week.SUNDAY;
            case 2 -> Week.MONDAY;
            case 3 -> Week.TUESDAY;
            case 4 -> Week.WEDNESDAY;
            case 5 -> Week.THURSDAY;
            case 6 -> Week.FRIDAY;
            case 7 -> Week.SATURDAY;
            default -> today;
        };
        if(today == Week.SUNDAY) System.out.println("일요일입니다.");
        else System.out.printf("일요일이아닙니다, %s입니다.", today);
    }
}