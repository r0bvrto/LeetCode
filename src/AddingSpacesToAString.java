import java.util.Arrays;

public class AddingSpacesToAString {
	public String addSpaces(String s, int[] spaces) {
		StringBuilder sb = new StringBuilder();
		for (int space : spaces) {
            if (space == 0) {
                sb.append(" ");
                break;
            }
        }
		for (int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(i));
			for (int space : spaces) {
				if (i + 1 == space) {
					sb.append(" ");
					break;
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		AddingSpacesToAString asp = new AddingSpacesToAString();
		int[] spaces = { 0, 8, 13, 15 };
		System.out.println(asp.addSpaces("LeetcodeHelpsMeLearn", spaces));
	}
}
