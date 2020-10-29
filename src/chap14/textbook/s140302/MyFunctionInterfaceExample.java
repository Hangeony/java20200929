package chap14.textbook.s140302;

public class MyFunctionInterfaceExample {
	public static void main(String[] args) {
		MyFunctionInterface fi;
		
		fi = () -> {
		String str1 = "method call1";
		System.out.println(str1);
		};
		fi.method();
	
		fi = () ->{System.out.println("method call2");};
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();
	}

}
