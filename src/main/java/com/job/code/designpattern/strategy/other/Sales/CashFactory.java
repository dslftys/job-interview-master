package BigBirdDesignPatterns.strategypattern.Sales;
/*
 * �򵥵Ĺ���ģʽ
 */
public class CashFactory {
	public static CashSuper createCashAccept(String type){//�ֽ���ȡ����
		CashSuper cs=null;
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
		return cs;
	}
	
	public static void main(String[] args) {
		CashFactory cs=new CashFactory();
	}
}
