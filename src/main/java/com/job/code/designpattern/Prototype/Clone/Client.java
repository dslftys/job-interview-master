package ch7.Prototype.Clone;

public class Client {
	public static void main(String[] args) {
		Clone product=new ProductClone();
		product.setNum(10);
		product.setPrice(15);
		product.setRebate(15);
		System.out.println("ԭ���Ķ���num="+product.getNum()+"price="+product.getPrice()+"rebate="+product.getRebate());
		
		Clone product1=(Clone)product.clone();
		System.out.println("�µĶ���num="+product1.getNum()+"price="+product1.getPrice()+"rebate="+product1.getRebate());
		product1.setNum(20);
		product1.setPrice(30);
		product1.setRebate(40);
		
		System.out.println("�޸ĺ�ԭ���Ķ���num="+product.getNum()+"price="+product.getPrice()+"rebate="+product.getRebate());
		System.out.println("�޸ĺ��µĶ���num="+product1.getNum()+"price="+product1.getPrice()+"rebate="+product1.getRebate());
		
	}
///	System.out.println();
}
