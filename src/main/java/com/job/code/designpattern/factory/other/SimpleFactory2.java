package ch4.simplefactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class SimpleFactory2 {
	public  Product createProduct(String type){
		Product pro=null;
		try{
			Properties p = new Properties();
			InputStream in = null;
			try {//ªÒ»° Ù–‘
				in = SimpleFactory2.class.getResourceAsStream("pro.properties");
				p.load(in);
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			pro = (Product)Class.forName(p.getProperty("class")).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			return pro;
		}
}
			

