
public class AddBinary {
	public String addBinary(String a, String b) {
        StringBuilder texto = new StringBuilder();
        if(a.equals("0") && b.equals("0")) return "0";
        int numA = 0;
        int num1 = 0;
        int elev = 1;
        int numB = 0;
        int num2 = 0;
        int suma = 0;
        int resto = 0;
        for(int i = a.length() - 1; i >= 0; i--) {
        	num1 = Character.getNumericValue(a.charAt(i));
        	num1 = num1 * elev;
        	numA = numA + num1;
        	elev = elev * 2;

        }
        elev = 1;
        for(int i = b.length() - 1; i >= 0; i--) {
        	num2 = Character.getNumericValue(b.charAt(i));
        	num2 = num2 * elev;
        	numB = numB + num2;
        	elev = elev * 2;

        }
        suma = numA + numB;
        
        while(suma != 0) {
        	resto = suma %2;
        	suma = suma/2;
        	texto.append(resto);
        }
        return texto.reverse().toString();
    }
	public static void main(String[] args) {
		AddBinary ab = new AddBinary();
		String valor = ab.addBinary("1010", "1011");
		System.out.println(valor);
	}
}
