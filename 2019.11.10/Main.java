
class Person{
	String name;
	int age;
	long high;
	
	public void sayHello(String target){
		System.out.println(
		name + "是个" + target);
	}
}

public class Main{
	public static void main(String[] args){
		Person p = new Person();
		p.name = "辛思成";
		p.age = 20;
		p.sayHello ("大肥驴");
	}
}