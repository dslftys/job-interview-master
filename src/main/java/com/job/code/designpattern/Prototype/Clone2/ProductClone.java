package ch7.Prototype.Clone2;

public class ProductClone extends Clone {

	@Override
	public Clone clone() {
		// TODO Auto-generated method stub
		Clone obj=new ProductClone();
		try{
			obj.setNum(super.getNum());
			obj.setPrice(super.getPrice());
			obj.setRebate(super.getRebate());
			Address address=new Address();
			obj.setAddress(address);
		}catch(Exception ex){
			System.out.println(ex);
		}
		return obj;
	}
}
