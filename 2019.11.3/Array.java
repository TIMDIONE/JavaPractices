public class Array{
public static int max(int[] a){
		int max =a[0];
		for(int v:a){
			if(v>max){
				max=v;
			}
		}
		return max;
	}
	public static void main(String[] args){
		int[]a={1,2,3,4,5,6};
		System.out.println(max(a));
		System.out.println(average(a));
		System.out.println(indexOf(a,4));
	// }
	public static double average(int[] a){
		int sum = 0;
		
		for(int i=0;i<=a.length;i++){
			sum+=a[i];
		}
		return (double)sum/a.length;
	}
	public static int find{
		
	}
	public static int indexOf(int[] a,int v){
		for(int i=0;i<=a.length;i++){
			if(a[i]==v){
				return i;
			}
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}