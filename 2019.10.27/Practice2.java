public class Practice2{
	public static void main(String[] args){
		int n = 137;
	//得到0的第2-4位
	System.out.println((n>>2)&0x7);
	int mask = ~(0x7<<2);
	System.out.println(n&mask);
	}
}