import java.util.Arrays;

public class FinalPrices {
	public int[] finalPrices(int[] prices) {
		for(int i = 0; i < prices.length; i++) {
			for(int j = i + 1; j < prices.length; j++) {
				if(prices[i] >= prices[j]) {
					prices[i] -= prices[j];
					break;
				}
			}
		}
		return prices;
	}
	public static void main(String[] args) {
		FinalPrices fp = new FinalPrices();
		int[] prices = {8,4,6,2,3};
		int[] resultado = fp.finalPrices(prices);
		System.out.println(Arrays.toString(resultado));
	}
}
