package ch7.Prototype.Clone2;


public class Client {
	public static void main(String[] args) {
		Clone product =new ProductClone();
		Address address=new Address();
		address.setAddress("�ֿ�1");
		product.setNum(10);
		product.setPrice(15);
		product.setRebate(15);
		product.setAddress(address);
		System.out.println("ԭ���Ķ���num="+product.getNum()+"price="+product.getPrice()+"rebate="+product.getRebate()+"address="+product.getAddress().getAddress());
		Clone product1=(Clone)product.clone();
		System.out.println("�µĶ���num="+product1.getNum()+"price="+product1.getPrice()+"rebate="+product1.getRebate()+product1.getAddress().getAddress());
		product1.setNum(20);
		product1.setPrice(30);
		product1.setRebate(40);
		product1.getAddress().setAddress("�ֿ�2");
		System.out.println("�޸ĺ�ԭ���Ķ���num="+product.getNum()+"price="+product.getPrice()+"rebate="+product.getRebate()+product.getAddress().getAddress());
		System.out.println("�޸ĺ��µĶ���num="+product1.getNum()+"price="+product1.getPrice()+"rebate="+product1.getRebate()+product1.getAddress().getAddress());

	}
}





