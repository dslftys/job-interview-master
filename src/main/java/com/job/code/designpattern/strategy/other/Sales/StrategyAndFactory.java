package BigBirdDesignPatterns.strategypattern.Sales;
/*
 * ���Ժ͹������н�ϵ�ģʽ
 */
public class StrategyAndFactory {
	CashSuper cs=null;
	
	public StrategyAndFactory(String type){
		switch (type) {
		case "�����շ�":
			cs=new CashNormal();
			break;
		case "��300��100":
			cs=new CashReturn("300","100");
			break;
		case "�����":
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
