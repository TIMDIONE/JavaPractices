public class MethodAdd{
	public static int add(int x,int y){
		int r = x + y;
		return r;
	}
	public static void main(String[] args){
		//int r = add(1,3);
        int x =1;
		int y =3;
		int r =add(x,y);
		System.out.println(r);
	}
}