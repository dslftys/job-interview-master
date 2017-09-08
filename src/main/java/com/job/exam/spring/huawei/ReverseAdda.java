package com.job.exam.spring.huawei;

import java.util.Scanner;
public class ReverseAdda {
	public int reverseAdd(int a,int b){
		if(a<1||a>70000||b<1||b>70000) return -1;
			return reverseData(a)+reverseData(b);
		
	}
	public int reverseData(int data){
		int temp=data%10;
		data=data/10;
		while(data!=0){
			temp=temp*10+data%10;
			data=data/10;
		}
		return temp;
	}
	public static void main(String[] args) {
		ReverseAdda daAdda=new ReverseAdda();
		Scanner in = new Scanner(System.in);//.useDelimiter(",");
        while (in.hasNextInt()) {//ע��while������case
           	/*String str = in.next();
        	String[] strs = str.split(",");
            int a = Integer.valueOf(strs[0]); 
            int b = Integer.valueOf(strs[1]);*/
        	int a=in.nextInt();
        	int b=in.nextInt();
        	
            System.out.println(daAdda.reverseAdd(a, b));
           // in.close();
       }
	}
}
