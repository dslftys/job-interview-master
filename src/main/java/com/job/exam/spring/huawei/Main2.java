package com.job.exam.spring.huawei;

import java.util.ArrayList;

public class Main2 {
	public ArrayList<Integer> ShortestRoad(int end,int fogcity){
		ArrayList<Integer> alist=new ArrayList<Integer>();
		int []temp=new int[6];
		if(end==5) return alist;
		int [][] table={{0,2,10,5,3,1000},
					 {1000,0,12,1000,1000,10},
					 {1000,1000,0,1000,7,1000},
					 {2,1000,1000,0,2,1000},
					 {4,1000,1000,1,0,1000},
					 {3,1000,1,1000,2,0}};
		if(fogcity!=0){
			for(int i=0;i<6;i++){
				table[i][fogcity-1]=1000;
			}
		}
		if(table[4][end-1]!=1000){
			//result[0]=4;
			//result[1]=end-1;
		}
		return null;
	}
}
