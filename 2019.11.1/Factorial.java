public class Factorial{
	public static int factorial(int n){
		int factor = 1;
		for(int i = 1;i<= n;i++){
		factor *=i ;}
		return factor;
	}
	public static int sum (int n){
		int sum=0;
		for(int i =1;i<=n;i++){
			sum+=factorial(i);
		}
		return sum;
	}
	
	
	public static void main(String[] args){
	System.out.println(	sum(Integer.parseInt(args[0])));
	}
}