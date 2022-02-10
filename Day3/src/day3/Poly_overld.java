package day3;

public class Poly_overld {
	
	void addition(int a, int b){
		System.out.println("Interger value Addition of A and B : "+(a+b));
	}
	void addition(float a, float b){
		System.out.println("Float value Addition of A and B : "+(a+b));
	}
	void addition(double a, double b){
		System.out.println("Double value Addition of A and B : "+(a+b));
	}
	void addition(String a, String b){
		System.out.println("String value concatination of A and B : "+a +" " + b);
	}

	public static void main(String[] args) {
		Poly_overld a = new Poly_overld();
		System.out.println("----------------------------------------------------------");

		System.out.println("This is a Example of method overloading of polymerphism");
		System.out.println("----------------------------------------------------------");
		a.addition(2, 3);
		a.addition(2.5, 3);
		a.addition(2.6, 3.3);
		a.addition("Mohammed", "sameer");

	}

}
