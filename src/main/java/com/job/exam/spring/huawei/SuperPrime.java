package com.job.exam.spring.huawei;
//���ַ����еĴ�д��ĸת��ΪСд��ĸ
public class SuperPrime {
	public static String  isSuperPrime(String s){
		String string="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>'z') string+=(s.charAt(i));
			else string+=s.charAt(i);
		}
		return string;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="DEWDEadeadeEFEFEFE";
		System.out.println(string.toLowerCase());
	}

}
