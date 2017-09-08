package ch7.Prototype;

public class ProductClone implements Cloneable {
	private double num;
	private double price;
	private double rebate;
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
	//∏¥÷∆∂‘œÛ
	public Object clone(){
		Object obj=null;
		try{
			obj=super.clone();
		}catch(CloneNotSupportedException ex){
			System.out.println(ex);
		}
		return obj;
	}
}
