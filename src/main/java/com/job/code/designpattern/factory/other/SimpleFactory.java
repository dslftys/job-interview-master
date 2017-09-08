package ch4.simplefactory;
public class SimpleFactory {
	public  Product createProduct(String type){
		Product pro=null;
		try{
			//����java�������������ʵ��
			pro=(Product)Class.forName(type).newInstance();
		}catch(InstantiationException ex){
			ex.printStackTrace();
		}catch(IllegalAccessException ex){
			ex.printStackTrace();
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}
		return pro;
	}
}
