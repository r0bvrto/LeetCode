
public class FirstOcurrance {
	public int strStr(String haystack, String needle) {
		
		return haystack.indexOf(needle);
	}
	public static void main(String[] args) {
		FirstOcurrance fo = new FirstOcurrance();
		System.out.println(fo.strStr("comodo", "omo"));
				
	}
}
