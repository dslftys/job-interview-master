package ch7.Prototype.Clone;

public class ProductClone extends Clone {

	@Override
	public Clone clone() {
		// TODO Auto-generated method stub
		Clone obj=new ProductClone();
		try{
			obj.setNum(super.getNum());
			obj.setPrice(super.getPrice());
			obj.setRebate(super.getRebate());
		}catch(Exception ex){
			System.out.println(ex);
		}
		return obj;
	}
}
