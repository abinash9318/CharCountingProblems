package characterCounting;

/*
 * Write a program to find and print number of words, vowels and frequency of each character
 */
import java.util.*;
import java.util.Map.Entry;

public class CharacterTypeFinder {

	static Map<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
	static char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I',
			'O', 'U' };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input :");
		String input = scanner.nextLine();
		findCharsType(input);
		scanner.close();
	}

	public static void findCharsType(String input) {
		String[] inputArr = input.split(" ");
		int wordsCount = 0;
		int vowelsCount = 0;

		for (int i = 0; i < inputArr.length; i++) {
			wordsCount++;
			for (char c : inputArr[i].toCharArray()) {
				if (new String(vowels).contains(Character.toString(c))) {
					vowelsCount++;
				}
				if (!hashMap.containsKey(c)) {
					hashMap.put(c, 1);
				} else {
					hashMap.put(c, hashMap.get(c) + 1);
				}
			}
		}

		System.out.println("Words Count : " + wordsCount);
		System.out.println("Vowels Count : " + vowelsCount);

		Set<Entry<Character, Integer>> entrySet = hashMap.entrySet();

		for (Map.Entry<Character, Integer> entry : entrySet) {
			System.out.print(entry.getKey() + "\t" + entry.getValue() + "\n");
		}
	}
}
