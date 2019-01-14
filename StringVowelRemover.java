package characterCounting;

/*
 * Write a program to remove vowels from a given String
 */
import java.util.*;

public class StringVowelRemover {

	static char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I',
			'O', 'U' };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = scanner.nextLine();
		System.out.println(removeVowels(input));
		scanner.close();
	}

	public static String removeVowels(String input) {
		StringBuffer sb = new StringBuffer();
		char[] inarr = input.toCharArray();

		for (char c : inarr) {
			if (new String(vowels).contains(Character.toString(c))) {
				continue;
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
