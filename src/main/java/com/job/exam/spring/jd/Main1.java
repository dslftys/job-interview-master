package com.job.exam.spring.jd;

import java.util.Scanner;

/**
 * Created by Victor on 2017/4/7.
 */
public class Main1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int num=sc.nextInt();
            String str=sc.next();
            if(num!=str.length())  System.out.println(0);
            char[]ch=str.toCharArray();
            int flag=0;
            int Nums=0;
            for(int i=0;i<num;i++){
                if(Character.isDigit(ch[i])){
                    int temp1=Math.max(i-(ch[i]-'0'),0);
                    int temp2=Math.min(i+(ch[i]-'0'),num-1);
                    boolean flag2=false;
                    for(int j=Math.max(temp1,flag);j<=temp2;j++){
                        if(Character.isDigit(ch[i])){
                            flag=j+1;
                            flag2=true;
                            break;
                        }else if(ch[j]=='X')Nums++;

                    }
                    if(!flag2) flag=temp2+1;
                }
            }
            System.out.println(Nums);
        }
    }
}
