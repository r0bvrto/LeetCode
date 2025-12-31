public class Palindrome {
    public boolean isPalindrome(int x) {
    	if(x<0) {
    		return false;
    	}
    	String numToStr = Integer.toString(x);
    	String numReves = new StringBuilder(numToStr).reverse().toString();
    	int numInvert = Integer.parseInt(numReves);
    	return x == numInvert;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        
        // Ejemplos de prueba
        System.out.println(palindrome.isPalindrome(121)); // true
        System.out.println(palindrome.isPalindrome(-121)); // false
        System.out.println(palindrome.isPalindrome(10)); // false
    }
}
