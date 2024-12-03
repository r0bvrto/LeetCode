import java.util.Arrays;

public class AddingSpacesToAString {
	public String addSpaces(String s, int[] spaces) {
		StringBuilder sb = new StringBuilder(s);
		int n = spaces.length;
		for (int i = 0; i < n; i++) {
			sb.insert(spaces[i] + i, " ");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		AddingSpacesToAString asp = new AddingSpacesToAString();
		int[] spaces = { 0, 8, 13, 15 };
		System.out.println(asp.addSpaces("LeetcodeHelpsMeLearn", spaces));
	}
}
