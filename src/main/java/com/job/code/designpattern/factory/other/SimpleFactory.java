package ch4.simplefactory;
public class SimpleFactory {
	public  Product createProduct(String type){
		Product pro=null;
		try{
			//采用java反射来创建类的实例
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
