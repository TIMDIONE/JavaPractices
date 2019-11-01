public class RecursionDemo{
	public static int factoeial(int n){
		if(n==1){
			return 1;	
	} 
	else{
		return(factoeial(n-1)*n);
	}
	
	}
	public static void main(String[] args){
		int n =Integer.parseInt(args[0]);
		System.out.println(factoeial(n));
	}
}
