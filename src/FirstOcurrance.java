
public class FirstOcurrance {
	public int strStr(String haystack, String needle) {
		for(int i = 0; i < haystack.length(); i++) {
				return haystack.indexOf(needle);
		}
		return -1;
	}
	public static void main(String[] args) {
		FirstOcurrance fo = new FirstOcurrance();
		System.out.println(fo.strStr("comodo", "omo"));
				
	}
}
