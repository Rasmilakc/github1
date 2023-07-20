package test2;
interface WorldBankK{
	public void Save(int x);
	public void loan(int y);
}	

public class day8b {

	public static void main(String[] args) {
		// implements
		SBI India = new SBI();
		India.loan(0);
		India.Save(0);
		
		PNB Panjab = new PNB();
		Panjab.loan(0);
		Panjab.Save(0);
		

	}
}
class SBI implements WorldBankK{

	
	public void Save(int x) {
		System.out.println("This is save method for SBI");
		
	}
	public void loan(int y) {
		{
			System.out.println("This is Loan method for SBI");
		}		
		
	}



	}
	
	


class PNB implements WorldBankK{

	
	public void Save(int x) {
		System.out.println("This is save method for PNB");
		
	}	


	
	public void loan(int y) {
		System.out.println("This is Loan method for PNB");	
	}
	
	}
		 
				


	
	
	
