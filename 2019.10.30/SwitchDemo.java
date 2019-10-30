public class SwitchDemo{
	public static void main(String[] args){
		int today = Integer.parseInt(args[0]);
		switch(today){
			case 1:
			System.out.println("今天是星期一");
			break;
			case 2 :
			System.out.println("今天是星期二");
			break;
			case 3:
			System.out.println("今天是星期三");
			break;
			case 4:
			System.out.println("今天是星期四");
			break;
			case 5:
			System.out.println("今天是星期五");
			default :
			System.out.println("输入错误");
		}
	}
}
