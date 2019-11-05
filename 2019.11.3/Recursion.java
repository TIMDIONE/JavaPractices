// public class Recursion{
	// public static void printNumber(int n){
		// if (n<10){
			// System.out.printf("%d ",n);
		// }
		// else{
			// int m = n/10;
			// printNumber(m);
			// int o =n%10;
			// System.out.printf("%d ");
		// }
	// }
	// public static void main (String[] args){
		//printNumber(9527);
	// }
// }
public class Recursion{
	public static int sum(int n){
		if(n<10){
			return n;
		}
		else {
			int m = n /10;
			int o = n %10;
			int h = sum(m);
			int r = h + o;
			return r;
		}
	}
	public static void main(String[] args){
		sum(9527);
		System.out.println(sum(9527));
	}
}