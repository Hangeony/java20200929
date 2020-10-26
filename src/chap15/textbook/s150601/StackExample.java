package chap15.textbook.s150601;
import java.util.*;

public class StackExample {
	//LIFO (Last in First out) 먼저 들어간게 나중에 나옴
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		System.out.println(coinBox.get(0).getValue());
		System.out.println(coinBox.get(1).getValue());
		System.out.println(coinBox.get(2).getValue());
		System.out.println(coinBox.get(3).getValue());
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println(" 꺼내온 동전 : "+ coin.getValue() + "원");
		}
	}

}
//stack 은 list역활을 함
//비커 모양으로 맨처음에 저장한 값이 젤 첫번째에 저장됨 그 위로 하나씩 저장됨
//저장된 값을 꺼낼 때에는 가장 늦게 저장된 값이 젤 먼저 꺼내짐
