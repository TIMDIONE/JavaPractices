import java.util.Arrays;
public class CopyOf{
	//public static int[] copyOfRange(int[] a,int from,int to){
		
	//}
	//public static void fill(int[] a,int val){
		
	//}
	//public static void fill(int[] a,int from,int to,int val){
		
	//}
	//public static void equals(int[] a,int[] b);
	public static int[] copyOf(int[]a,int newLength)
	//进行数组的复制，返回一个新的数组，数组长度是nemlength
	//如果newlength小于等于原数组长度，进行截取
	//如果newlenght大于原数组长度，其余位置用0补齐
	{
		int[] dest = new int[newLength];//dest 现在的元素值均为0
	    int length = Math.min(newLength,a.length);
		for(int i = 0;i<=length;i++){
			dest[i]=a[i];
		}
		return dest;
	}
	public static void main(String[] args){
		int[] a={4,5,9,6,3};
		copyOf(a,3);
		System.out.println(Arrays.toString(copyOf(a,3)));
	}
}