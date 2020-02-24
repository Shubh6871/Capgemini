package Lab10;

class Demo {
private String name;
private String city;
private int number;
public Demo(String name, String city, int number) {
	
	this.name = name;
	this.city = city;
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
}
public class Exercise4{
	public static void main(String[] args) {
		Demo d=new Demo("Name","City",123);
		System.out.print(d.getName()+" "+d.getCity()+" "+d.getNumber());
	}
}
