package BigBirdDesignPatterns.strategypattern.Sales;

public class CashContext {
	private CashSuper cs;
	
	public CashContext(CashSuper cs){
		this.cs=cs;
	}
	public double GetResult(double money){
		return cs.acceptCash(money);
	}

}
