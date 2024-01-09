package PizzaBillGenerator;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		pizza basepz=new pizza(false);
		basepz.addextracheese();
		basepz.extraToppings();
		basepz.takeaway();
		basepz.getBill();
		deluxepizza dp=new deluxepizza(false);
//		doesnot have functionality modify of add of extra cheese and toppings
		dp.takeaway();
		dp.getBill();
	}

}
