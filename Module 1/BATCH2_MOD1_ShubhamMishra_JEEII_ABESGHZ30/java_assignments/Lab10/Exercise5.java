package Lab10;

public class Exercise5 {
 public	int factorial(int a) {
	 
		int product=1;
		for(int i=1;i<=a;i++)
		{
			product=product*i;
		}
		System.out.println("Factorial is "+product);
	return 0;}
	public static void main(String[] args) {
		Exercise5 obj=new Exercise5();
		Fact fr = obj::factorial;
		fr.display(5);
	}
}

interface Fact{
	int display(int a);
}
