public class BinarySearch{
	public static int binarySearch(int[] a,int value){
		int left = 0;
		int right = a.length;
		while (left<right){
			int mid = (left+right)/2;
			if(value==a[mid]){
				return mid;
			}
			else if(value<a[mid]){
				right = mid;
			}
			else{
				left = mid + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] a ={1,1,2,3,4,6,6,8};
		binarySearch(a,6);
		System.out.println(binarySearch(a,6));
	}
}