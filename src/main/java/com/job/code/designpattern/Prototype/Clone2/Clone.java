package ch7.Prototype.Clone2;

public abstract class Clone {
	private double num;
	private double price;
	private double rebate;
	private Address address;
	public double getNum() {
		return num;
	}
	public void setNum(double num) {
		this.num = num;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRebate() {
		return rebate;
	}
	public void setRebate(double rebate) {
		this.rebate = rebate;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	//¸´ÖÆ¶ÔÏó
	public abstract Object clone();
}
