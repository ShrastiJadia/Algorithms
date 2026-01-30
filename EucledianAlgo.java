package Questions;

public class EucledianAlgo {

	// hcf or GCD
	public static void main(String[] args) {
		int a = 12;
		int b = 8;
		while (b != 0) {
			int temp = b;// temp=18,6
			b = a % b;// b=6,0
			a = temp;// a=18,6
		}
		System.out.println(a);

	}
}
