package chap03.textbook;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------");
		x++; //11의 값이 저장
		++x; //12의 값이 저장
		System.out.println("x =" + x);
		
		System.out.println("--------------");
		y--; //9의 값이 저장
		--y; //8의 값이 저장
		System.out.println("y =" + y);
		
		System.out.println("--------------");
		z = x++; //12의 값을 불러오고 12가 저장되고 그뒤에 x의 값이 늘어남
		System.out.println("z =" + z);
		System.out.println("z =" + x);
		
		System.out.println("--------------");
		z = ++x;
		System.out.println("z =" + z);
		System.out.println("z =" + x);
		
		System.out.println("--------------");
		z = ++x + y++; //23 
		System.out.println("z =" + z);
		System.out.println("x =" + x);
		System.out.println("y =" + y);
		
	}

}
