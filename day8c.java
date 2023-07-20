package test2;
class A{
	public void GreetA() {
		System.out.println("Hi");
	}
}
class B{
	public void GreetB() {
		System.out.println("BYE");
	}
}
class C extends A{
	
	
}

public class day8c {

	public static void main(String[] args) {
		C Apple = new C();
		Apple.GreetA();
		

	}

}
