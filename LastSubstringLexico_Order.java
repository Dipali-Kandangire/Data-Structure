package dataStructure.com;

import java.util.Scanner;

public class LastSubstringLexico_Order {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int maxIndex = s.length() - 1;

		for (int currIndex = s.length() - 1; currIndex >= 0; currIndex--) {
			if (s.charAt(currIndex) > s.charAt(maxIndex))
				maxIndex = currIndex;

			else if (s.charAt(currIndex) == s.charAt(maxIndex)) {
				int i = currIndex + 1;
				int j = maxIndex + 1;

				while (i < maxIndex && j < s.length() && s.charAt(i) == s.charAt(j)) {
					j++;
					i++;
				}
				if (i == maxIndex || j == s.length() || s.charAt(i) > s.charAt(j))
					maxIndex = currIndex;

			}
		}
		System.out.println(s.substring(maxIndex));
	}
}
