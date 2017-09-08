package BigBirdDesignPatterns.strategypattern.Sales;
/*
 * 简单的工厂模式
 */
public class CashFactory {
	public static CashSuper createCashAccept(String type){//现金收取工厂
		CashSuper cs=null;
		switch (type) {
			case "正常收费":
				cs=new CashNormal();
				break;
			case "满300返100":
				cs=new CashReturn("300","100");
				break;
			case "打八折":
				cs=new CashRebate("0.8");
				break;
			default:
				break;
		}
		return cs;
	}
	
	public static void main(String[] args) {
		CashFactory cs=new CashFactory();
	}
}
