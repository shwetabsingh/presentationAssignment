package javaPresentationQn;

public class typeCastingAssesment {

	public static void main(String[] args) {
		//implicit(done by the JVM or tools)conversion
		System.out.println("Implicit Type Casting");
		char a ='A';
		System.out.println("value of a is: "+a);
		
		int b = a;
		System.out.println("Value of b is :"+b );
		
		float c=a;
		System.out.println("Value of c is: "+c);
		
		long d = a;
		System.out.println("Value of d is: "+d);

		
		double e = a;
		System.out.println("Value of e is: "+e);
		
		System.out.println("\n");
		
		//Explicit conversion(conversion done by programmer)
		System.out.println("Explicit type casting");
		double x =45.5;
		int y = (int) x;
		System.out.println("value of x is: "+x);
		System.out.println("value of y is "+y);
	}

}
