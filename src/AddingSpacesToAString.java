import java.util.Arrays;

public class AddingSpacesToAString {
	public String addSpaces(String s, int[] spaces) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(i));
			if(i == spaces[i]) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		AddingSpacesToAString asp = new AddingSpacesToAString();
		int[] spaces = {8,13,15};
		System.out.println(asp.addSpaces("LeetcodeHelpsMeLearn", spaces));
	}
}
