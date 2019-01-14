package characterCounting;

/*
 * Write a program to remove characters from the first string which are present in the second string
 */
import java.util.*;

public class TwoStringsCharRemover {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first String :");
		String firstIn = scanner.nextLine();
		System.out.println("Enter second String :");
		String secondIn = scanner.nextLine();
		System.out.println(removeCharsFromBothString(firstIn, secondIn));
		scanner.close();
	}

	public static String removeCharsFromBothString(String firstIn,
			String secondIn) {
		StringBuffer sb = new StringBuffer();
		char[] firstInArr = firstIn.toCharArray();

		for (char c : firstInArr) {
			if (!secondIn.contains(Character.toString(c))) {
				sb.append(c);
			} else {
				continue;
			}
		}
		return sb.toString();
	}
}
