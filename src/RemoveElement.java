import java.util.Arrays;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
        int atras = 0;
        int delante = nums.length - 1;
        while(atras <= delante) {
        	if(nums[atras] == val) {
            		nums[atras] = nums[delante];
            		delante--;
        	}else {
            	atras++;
        	}
        }
        return atras;
    }
	
	public static void main(String[] args) {
		
		RemoveElement re = new RemoveElement();
		int valor = re.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2);
		System.out.println(valor);
	}
}
