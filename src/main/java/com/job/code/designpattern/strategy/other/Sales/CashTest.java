package BigBirdDesignPatterns.strategypattern.Sales;

import static org.junit.Assert.*;

import org.junit.Test;

public class CashTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		/************ContextTest************/
		CashSuper csCashSuper=new CashNormal();
		System.out.println(csCashSuper.acceptCash(100));
		csCashSuper=new CashRebate("0.8");
		System.out.println(csCashSuper.acceptCash(100));
		csCashSuper=new CashReturn("300", "100");
		System.out.println(csCashSuper.acceptCash(300));
		
	}

}
