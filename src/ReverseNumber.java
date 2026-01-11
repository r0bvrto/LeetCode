
public class ReverseNumber {
	public int reverse(int x) {
		if(x == 0) {
			return 0;
		}
		int temp = Math.abs(x);
		int digito = 0;
		int suma = 0;
		int longitud = 0;
		while (temp > 0) {
		    temp /= 10;
		    longitud++;
		}
		temp = Math.abs(x);
		int potencia = (int) Math.pow(10, longitud - 1);
		while(temp > 0) {
			digito = temp % 10;
			if(suma > Integer.MAX_VALUE - (digito * potencia)) {
				return 0;
			}
			suma += digito * potencia;
			potencia = potencia/10;
			temp = temp/10;
		}
		
		return x < 0 ? -suma : suma;
	}
	public static void main(String[] args) {
		ReverseNumber rn = new ReverseNumber();
		int valor = rn.reverse(-123);
		System.out.println(valor);
	}
}
