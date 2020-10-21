package chap10.textbook.s100701;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금액 :"+ account.getBalance());
		
		try {
			account.withdraw(30000);
		}
		catch(BalanceInsufficienException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace(); //만약 없다면 어디서 발생했는지 잘 모름.
			                     //어디서 Account가 발생했는지 알려줌.
								 //오류 찾기 
		}
	}

}
