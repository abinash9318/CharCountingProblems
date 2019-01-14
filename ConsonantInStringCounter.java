package characterCounting;

/*
 * Write a program to count a total number of consonants in a given String
 */
import java.util.*;

public class ConsonantInStringCounter {

	static char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I',
			'O', 'U' };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input = scanner.nextLine();
		System.out.println(countConsonantsInString(input));
		scanner.close();
	}

	public static int countConsonantsInString(String input) {
		char[] inarr = input.toCharArray();
		int count = 0;

		for (char c : inarr) {
			if (new String(vowels).contains(Character.toString(c))) {
				continue;
			} else {
				if (Character.toUpperCase(c)>= 65 && Character.toUpperCase(c) <= 90) {
					count++;
				}
			}
		}
		return count;
	}
}
