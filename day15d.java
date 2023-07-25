package Test3;
enum SizeB{
	SMALL,MEDIUM ,LARGE,EXTRALARGE
} 
class Orderb{
	Size pizzaSize;
	public Orderb(Size pizzasize) {
		this.pizzaSize=pizzasize;
	}public void orderconfirmation() {
		switch(pizzaSize) {
		case SMALL:
			System.out.println("Small size pizza has been ordered");
			break;
		case MEDIUM:
			System.out.println("medium size pizza has been ordered");
			break;
		case LARGE:
			System.out.println("large size pizza has been ordered");
			break;
		case EXTRALARGE:
			System.out.println("Small size pizza has been ordered");
			break;
		}
	}
}


public class day15d {

	public static void main(String[] args) {
		Orderb order=new Orderb(Size.SMALL);
		order.orderconfirmation();
	}
}
