import java.util.ArrayList;

public class IsSubsquence {
	public boolean isSubsequence(String s, String t) {
		int indexInT = 0;

		for (char c : s.toCharArray()) {
			indexInT = t.indexOf(c, indexInT);
			if (indexInT == -1) {
				return false;
			}
			indexInT++;
		}
		return true;
	}

	public static void main(String[] args) {
		IsSubsquence is = new IsSubsquence();
		System.out.println(is.isSubsequence("acb", "ahbgdc"));
	}
}
