package Lab10;

public class Exercise123 {
public static void main(String[] args) {
	PowerOF p=(a,b)->Math.pow(a, b);
	System.out.println(p.powerOf(2,2));
	Space sp=(a)->a.replace("", " ").trim();
	
	System.out.println(sp.space("Rishabh"));
	UsrPsw up=(a,b)->(a=="Rishabh" && b=="Dark");
	System.out.println(up.usrpsw("Rishabh", "Dark"));
}
}
interface PowerOF{
	double powerOf(double a,double b);
	
}
interface Space{
	String space(String a);
}
interface UsrPsw{
	boolean usrpsw(String a,String b);
}