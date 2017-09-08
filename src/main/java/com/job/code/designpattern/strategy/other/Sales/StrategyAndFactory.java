package BigBirdDesignPatterns.strategypattern.Sales;
/*
 * 策略和工厂进行结合的模式
 */
public class StrategyAndFactory {
	CashSuper cs=null;
	
	public StrategyAndFactory(String type){
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
	}
	
	public double getResult(double money){
		return cs.acceptCash(money);
	}
}
