package javaPresentationQn;

//class having default Access Modifier
class defaultAccessModifier{
	void display() {
		System.out.println("this is default access modifier");
	}
}

// class having private Access Modifier
	class privateAccessModifier{
		private void display() {
			System.out.println("this is private access modifier");
		}
		
	}
	


public class accessModifier {

	public static void main(String[] args) {
	System.out.println("default access specifier");	
	defaultAccessModifier obj = new defaultAccessModifier();
	obj.display();
	
	System.out.println("private access specifier");	
	privateAccessModifier obj1 = new privateAccessModifier();
	//obj1.display();
	}

}
