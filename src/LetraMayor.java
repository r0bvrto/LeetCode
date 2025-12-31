import java.util.Arrays;

public class LetraMayor {
	public char nextGreatestLetter(char[] letters, char target) {
		Arrays.sort(letters);
		for(int i = 0; i < letters.length; i++) {
			if(target != letters[i] && target < letters[i]) {
				return letters[i];
			}
			
		}
		return letters[0];
	}
}
