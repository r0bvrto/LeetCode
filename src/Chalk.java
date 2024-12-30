
public class Chalk {
	public int chalkReplacer(int[] chalk, int k) {
		long sum = 0;
		for (int i = 0; i < chalk.length; i++) {
            sum += chalk[i];
        }

        k %= sum;
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }
        return -1;
	}
	public static void main(String[] args) {
		Chalk ch = new Chalk();
		int [] array = {3,4,1,2};
		System.out.println(ch.chalkReplacer(array, 25));
	}
}
