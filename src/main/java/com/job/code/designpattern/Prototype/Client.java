package ch7.Prototype;

public class Client {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Product product =new Product();
		product.setNum(10);
		product.setPrice(15);
		product.setRebate(20);
		System.out.println("ԭ���Ķ���num="+product.getNum()+"price="+product.getPrice()+"rebate="+product.getRebate());
		
		Product product1=product;
		System.out.println("�µĶ���num="+product1.getNum()+"price="+product1.getPrice()+"rebate="+product1.getRebate());
		product1.setNum(20);
		product1.setPrice(30);
		product1.setRebate(40);
		
		System.out.println("�޸ĺ�ԭ���Ķ���num="+product.getNum()+"price="+product.getPrice()+"rebate="+product.getRebate());
		System.out.println("�޸ĺ��µĶ���num="+product1.getNum()+"price="+product1.getPrice()+"rebate="+product1.getRebate());
		
	}
}
