import java.util.Arrays;

public class AddingSpacesToAString {
	public String addSpaces(String s, int[] spaces) {
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < spaces.length; i++) {
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
//public class AddSpaces {
//    public static String addSpaces(String s, int[] spaces) {
//        StringBuilder result = new StringBuilder();
//        int start = 0;
//        for (int space : spaces) {
//            result.append(s, start, space).append(" ");
//            start = space;
//        }
//        result.append(s.substring(start));
//        return result.toString();
//    }
//}