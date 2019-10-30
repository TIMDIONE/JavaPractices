public class ConditionDemo{
	public static void main(String[] args){
		int year = Integer.parseInt(args[0]);
		 boolean isLeapYear;
	if( year%400==0||(year%4==0&&year%100!=0))
		{
		 isLeapYear = true;
		}
		
		
		if(isLeapYear){
		System.out.println("是闰年");}
			else
			{System.out.println("不是闰年");}
}
}