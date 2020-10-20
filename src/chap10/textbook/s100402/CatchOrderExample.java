package chap10.textbook.s100402;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "="+result);
		}
		catch(ArrayIndexOutOfBoundsException e) { 
			System.out.println("실행 매개값의 수가 부족합니다.");
		} //입체성이다 .  상위타입 인셉션이 하위 타입보다 밑에 있어야함
		catch(Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		}//케치블록을 위에서 부터 순서대로 확인된다. 상위클레스 타입이 항상 밑에 있어야함
		finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
