
public class BuySell {
	public int maxProfit(int[] prices) {
	        if (prices == null || prices.length < 2) {
	            return 0;
	        }

	        int menorPrecio = prices[0];
	        int mayorBeneficio = 0;

	        for (int i = 1; i < prices.length; i++) {
	            if (prices[i] < menorPrecio) {
	                menorPrecio = prices[i];
	            } else {
	                int beneficio = prices[i] - menorPrecio;
	                if (beneficio > mayorBeneficio) {
	                    mayorBeneficio = beneficio;
	                }
	            }
	        }

	        return mayorBeneficio;
	    }

	public static void main(String[] args) {
		BuySell bs = new BuySell();
		int[] precios = {7, 1, 5, 3, 6, 4};
        System.out.println(bs.maxProfit(precios));
	}
}
