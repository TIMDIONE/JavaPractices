import java.util.Random;
import java.util.Scanner;

public class GuessGame{
	public static void main(String[] args){
	    Random random=new Random();
		System.out.println("欢迎进入猜数字游戏");
		System.out.println("请输入一个100以内的数");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请稍后，生成数字中");
		int n = random.nextInt(100);
		System.out.println("数字已生成");
		int times = 4;
		for(int i = 1;i<=times;i++){
			System.out.print("> ");
			int x = scanner.nextInt();
			if (x==n){
				System.out.println("恭喜你猜对了，用了"+i+"次机会");
				return;
			}
			else if (x>n){
				System.out.println("您猜测的数字大了，第"+i+"次机会");
			}
			else{
				System.out.println("您猜测的数字小了，第"+i+"次机会");
			}
		}
		System.out.println("很遗憾，猜错了");
		System.out.println("数字为"+n);
	}
}