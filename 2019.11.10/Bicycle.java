public class Bicycle{
	String color;
	int currentSpeed;
	int maxSpeed;
	Bicycle(){
		color = "黑色";
		currentSpeed = 0;
		maxSpeed = 193;
	}
      Bicycle(String color){
		  color = color;
		  currentSpeed = 0;
		  maxSpeed = 193;
	  }
	void setcolor(String color){
		this.color = color;
	}
	void speedUp(){
		currentSpeed += 10;
		if(currentSpeed > maxSpeed){
			currentSpeed = maxSpeed;
		}
	}
	void speedDown(){
		currentSpeed -= 10;
		if(currentSpeed<0){
			currentSpeed = 0;
		}
	}
	String getColor(){
		return color;
	}
	int getCurretSpeed(){
		return currentSpeed;
	}
	public static void main (String[] args){
		Bicycle bicycle = new Bicycle();
		System.out.println("刚初始化：");
		System.out.println(bicycle.getColor());
		System.out.println(bicycle.getCurretSpeed());
		
		bicycle.setcolor("粉色");
		System.out.println("涂完漆后");
		System.out.println(bicycle.getColor());
		
		System.out.println("下坡：");
		for(int i = 0;i < 22;i++){
			bicycle.speedUp();
			System.out.println(bicycle.getCurretSpeed());
		}
		
		
		
	}
}