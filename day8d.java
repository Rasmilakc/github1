package test2;
interface WBA{
	public void Save();
	public void Loan();
	
}

interface WBI{
	public void DisplayCountry();
	public void DisplayCity();
	
}
public class day8d {

	public static void main(String[] args) {
		
		BankA a = new BankA();
		a.DisplayCity();
		a.DisplayCountry();
		a.Loan();
		a.Loan();

	}

}
//more than one interface can be implemented by class


class BankA implements WBA, WBI{

	
	public void DisplayCountry() {
		System.out.println("this is Irving");
		
		
	}

	
	public void DisplayCity() {
		System.out.println("plano");
		
		
	}

	
	public void Save() {
		System.out.println("Save method");
		
	}

	
	public void Loan() {
		System.out.println("loan method");
		
	}
	
	
	
	
	
}

