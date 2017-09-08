package com.job.algorithm.经典算法问题.八皇后问题;

import org.junit.Test;

public class QueenTest {

	@Test
	public void test() {
		NQueens nQueens=new NQueens(8);
		nQueens.init();
		nQueens.Queen();
	}

}
