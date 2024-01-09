package PizzaBillGenerator;

public class pizza {
	private int price;
	private Boolean veg;
	private int extracheese=100;
	private int extratoppings=150;
	private int bagpacks=20;
	private int baseprice;
	private boolean isextracheeseadded=false;
	private boolean isextraToppingsadded=false;
	private boolean isoptedfortakeaway=false;
	
	
	public pizza(Boolean veg) {
		this.veg=veg;
		if(this.veg) {
			this.price=300;
		}else {
			this.price=400;
		}
		baseprice=price;
	}
	
	
//	add ons
	public void addextracheese() {
	isextracheeseadded=true;
//		System.out.println("Extra cheese added");
		this.price+=extracheese;
		
	}
	public void extraToppings() {
	isextraToppingsadded=true;
//		System.out.println("Extra Topings added");
		this.price+=extratoppings;
		
	}
	public void takeaway() {
	isoptedfortakeaway=true;
//		System.out.println("Take Away Option Opted");
		this.price+=bagpacks;
		
	}
	public void getBill() {
		String bill="";
		System.out.println("Base pizza :"+this.baseprice);
		if(isextracheeseadded) {
			bill +="Extra Cheese Added:"+extracheese+"\n";
		}
		if(isextraToppingsadded) {
			bill +="Extra Topings Added:"+extratoppings+"\n";
		}
		if(isoptedfortakeaway) {
			bill +="Take Away :"+bagpacks+"\n";
		}
		bill +="Bill: "+this.price+"\n";
		
		System.out.println(bill);
	}

}
