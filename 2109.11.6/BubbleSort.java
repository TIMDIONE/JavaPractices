import java.util.Arrays;
public class BubbleSort{
	public static void swap(int[] a,int i,int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public static void bubbleSort(int[] a){
		for(int i = 0;i<a.length-1;i++)//判断冒泡的次数
		{
			for(int j = 0;j<a.length-i-1;j++)//两个数字进行比较交换
			{
				if(a[j]>a[j+1]){
				   swap(a,j,j+1);	
				}
			}
		}
	}
	public static void main(String[] args){
		int[] a={9,7,8,1,4,2,0};
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
}