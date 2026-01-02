import java.util.HashMap;

public class RomanToInteger {
	public int romanToInt(String s) {
		HashMap<Character, Integer> romanos = new HashMap<>();
		int suma = 0;
        romanos.put('I', 1);
        romanos.put('V', 5);
        romanos.put('X', 10);
        romanos.put('L', 50);
        romanos.put('C', 100);
        romanos.put('D', 500);
        romanos.put('M', 1000);
        
        for(int i = 0; i < s.length(); i++) {
        	int caracterActual = romanos.get(s.charAt(i));
        	
        	if(i + 1 < s.length() && romanos.get(s.charAt(i + 1)) > caracterActual) {
        		        		
        		suma -= caracterActual;
        	}else {
        		suma += caracterActual;
        	}
        }
        return suma;
    }
	
	public static void main(String[] args) {
		RomanToInteger rti = new RomanToInteger();
		int a = rti.romanToInt("IV");
		System.out.println(a);
	}
}
