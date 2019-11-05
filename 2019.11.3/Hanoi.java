public class Hanoi{
	public static void hanoi(int n,int from,int to){
		if (n == 1){
			System.out.printf("从 %d 移动到 %dn",from,to);
	}
	    else {
			int other = 3 - from - to;
			hanoi(n-1,from,to);
			System.out.printf("从 %d 移动到 %dn",from,to);
			hanoi(n-1,from,to);
	}
	}
	public static void main(String[] args){
		hanoi(4,0,2);
	}
}