package ch7.Prototype;

public class Client1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProductClone productClone =new ProductClone();
		productClone.setNum(10);
		productClone.setPrice(15);
		productClone.setRebate(20);
		System.out.println("ԭ���Ķ���num="+productClone.getNum()+"price="+productClone.getPrice()+"rebate="+productClone.getRebate());
		
		ProductClone productClone1=(ProductClone)productClone.clone();
		System.out.println("�µĶ���num="+productClone1.getNum()+"price="+productClone1.getPrice()+"rebate="+productClone1.getRebate());
		productClone1.setNum(20);
		productClone1.setPrice(30);
		productClone1.setRebate(40);
		
		System.out.println("�޸ĺ�ԭ���Ķ���num="+productClone.getNum()+"price="+productClone.getPrice()+"rebate="+productClone.getRebate());
		System.out.println("�޸ĺ��µĶ���num="+productClone1.getNum()+"price="+productClone1.getPrice()+"rebate="+productClone1.getRebate());
		
	}
}
