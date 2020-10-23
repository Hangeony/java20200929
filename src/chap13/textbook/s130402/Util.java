package chap13.textbook.s130402;

public class Util {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V>p2) {
		boolean ketCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return ketCompare && valueCompare;
	}

}