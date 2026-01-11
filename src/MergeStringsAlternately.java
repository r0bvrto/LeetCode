
public class MergeStringsAlternately {
	public String mergeAlternately(String word1, String word2) {
		int longitudMin = Math.min(word1.length(),word2.length());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < longitudMin; i++) {
			sb.append(word1.charAt(i));
			sb.append(word2.charAt(i));
		}
		String mayor = word1.length() > word2.length() ? word1 : word2;
		sb.append(mayor.substring(longitudMin));
		return sb.toString();
	}
	public static void main(String[] args) {
		MergeStringsAlternately msa = new MergeStringsAlternately();
		msa.mergeAlternately("abcd", "pq");
		
	}
}
