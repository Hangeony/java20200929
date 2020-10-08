package chap04.exercises;

import java.util.Scanner;

public class Exercise07Scanner {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("입력");
		String line = scanner.nextLine();
		
		System.out.println("출력");
		System.out.println(line);
		
		
		int num = Integer.valueOf(line); //string 을 int로 바꾼다.
		int i = num *2;                  //숫자로 사용하고싶을때
		System.out.println(i);
	}

}
