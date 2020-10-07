package chap04.textbook;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1;
		int j = 11;

		//1~10
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("-----------");
		//11~20
		while(j<=20) {
			System.out.println(j);
			j++;
		}
		System.out.println("-----------");
		//1~9 홀수만
		int a =1;
		while(a<=9) {
			System.out.println(a);
			a += 2;
		}
		System.out.println("-----------");
		//10~1까지
		int k = 10;
		while(k >= 1) {
			System.out.println(k);
			k--;
		}
		System.out.println("-----------");
		//10~2 짝수만
		int l = 10;
		while(l >= 2) {
			System.out.println(l);
			l -= 2;
		}
	}

}
