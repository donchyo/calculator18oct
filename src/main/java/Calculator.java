
public class Calculator {
	public String add(String a, String b){
		double tempa = Double.parseDouble(a);
		double tempb = Double.parseDouble(b);
		return String.valueOf(tempa + tempb);
	}
	public String sub(String a, String b){
		double tempa = Double.parseDouble(a);
		double tempb = Double.parseDouble(b);
		return String.valueOf(tempa - tempb);
	}
	public String mult(String a, String b){
		double tempa = Double.parseDouble(a);
		double tempb = Double.parseDouble(b);
		return String.valueOf(tempa * tempb);
	}
	public String divi(String a, String b){
		double tempa = Double.parseDouble(a);
		double tempb = Double.parseDouble(b);
		return String.valueOf(tempa / tempb);
	}
}
