package day3;

class a{
	void multiplication(int a, int b){
		System.out.println("Parent class multiplication Result :"+(a+b));
	}
	void get(){
		System.out.println("This is a Parent class");
	}
	void sample(){
		System.out.println("This is a Parent class method invoked by child object");
	}
}

public class Poly_ovrrdng extends a {
	
	void get(){
		System.out.println("This is a Child class");
	}
	void multiplication(int a, int b){
		System.out.println("Child class multiplication Result :"+(a+b));
	}

	public static void main(String[] args) {
		int a=4,b=6;
		System.out.println("----------------------------------------------------------");

		System.out.println("This is a Example of method overriding of polymerphism");
		System.out.println("----------------------------------------------------------");
		Poly_ovrrdng ob = new Poly_ovrrdng();
		ob.get();
		ob.multiplication(a,b);
		a p=new a();
		p.get();
		p.multiplication(a, b);
		ob.sample();
		

	}

}
