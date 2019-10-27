public class Average{
	public static void main(String[] args){
		if(args.length==0){
			System.out.println("必须至少输入一个量");
			return;
			
		}
		int sum = 0;
        for(int i = 0;i<args.length;i++){
			sum += Integer.parseInt(args[i]);
		}		
		double average =1.0*sum/args.length;
		System.out.println("平均值是" + average);
	}
}