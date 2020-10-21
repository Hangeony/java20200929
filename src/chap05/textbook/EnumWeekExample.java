package chap05.textbook;
import java.util.Calendar;
public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;

		Calendar cal =Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// 오늘의 요일 
		switch(week){
		case 1 :
			today = Week.MONDAY;
			break;
		case 2 :
			today = Week.TUESDAY;
			break;
		case 3 :
			today = Week.WEDNESDAY;
			break;
		case 4 :
			today = Week.THURSDAY;
			break;
		case 5 :
			today = Week.FRIDAY;
			break;
		case 6 :
			today = Week.SATURDAY;
			break;
		case 7 :
			today = Week.SUNDAY;
			break;
		}
		System.out.println("오늘 요일: "+ today);

		if(today == Week.SUNDAY) {
			System.out.println("일요일엔 축구를 합니다.");
		}
		else {
			System.out.println("열심히 자바공부를 합니다.");
		}
	}

}
