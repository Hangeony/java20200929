package chap11;

public class StringEx1 {
	public static void main(String[] args) {
		//charAt
		String str1 = "java"; // 변수를 선언하고 변수값을 넣어주면됨
		char c1 = str1.charAt(0);//참조 타입은 객체 (속성과 기능) charAt에서 몇번쨰 글자를 가지고 있는지 확인
		System.out.println(c1);
		System.out.println(str1.charAt(1));
	    System.out.println(str1.charAt(2));
	    System.out.println(str1.charAt(3));
//	    System.out.println(str1.charAt(6));
	    
	    //equals                 //같은 객체인지 확인하는
	    String str2 = "python";
//	    String str3 = "python";
	    String str4 = "py";
	    String str5 = "thon";
	    String str6 = str4 + str5;
	    
	    System.out.println(str2);
	    System.out.println(str6);
	    
	    System.out.println(str2 == str6);
	    System.out.println(str2.equals(str6)); 
	    
	    //indexOf                     	    어디에 있는지  확인 할 수있다.
	    String str7 ="자바 프로그래밍";
	    int a = str7.indexOf("프로");
	    System.out.println(a);
	    
	    //lenght 길이를 알려준다
	    String str8 = "이것이 자바다."; // space 도 공간  charAt을 통해서 마지막 인덱스를 가져오고싶을때.
	    int l = str8.length();
	    System.out.println(l);
	    System.out.println(str8.charAt(l -1));
	    
	    // replace 교체하는 메소드
	    String str9 = "abcdefghadfadsf";
	    String str10 = str9.replace("abc", "123");
	    System.out.println(str9);
	    System.out.println(str10);
	    
	    //substring                  int 하나 받을수도 있구 int 두개 받을 수도 있음
	    String str11 = "0123456789asdfqwer1";
	    String sub = str11.substring(2,3);           //2가 시작 하는 인덱스  3은 종료 하는 인덱스 종료는 해당되지 않음
	    System.out.println(sub);
	    sub = str11.substring(5, str11.length());  //5부터 끝까지 뽑고싶으면 length() 뒤에 아무것도 적지 않으면됨
	    System.out.println(sub);
	    
	    sub = str11.substring(6);                // int 단일 
	    System.out.println(sub);
	    
	    //trim                    공백 제거 메소드
	    String str12 = " java ";
	    String t =str12.trim();
	    System.out.println(str12);
	    System.out.println(t);      //중간 공백은 제거 못함 ex) ja                      va
	}
}