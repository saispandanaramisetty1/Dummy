package lavanya;

public class ExString {

	public static void main(String[] args) {
		String s = "abcd";
		String s1 = "abcd";
		String s2 = new String("xyz");
		System.out.println(s.toUpperCase());
		System.out.println(s.equals(s1)); // true
		System.out.println(s == s1); // true
		System.out.println(s == s2); // false
		System.out.println(s.length()); // 4

	}

}
