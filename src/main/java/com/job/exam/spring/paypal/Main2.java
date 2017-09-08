package com.job.exam.spring.paypal;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Victor on 2017/4/13.
 */
public class Main2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            ArrayList<Integer> alist1=new ArrayList<>();
            ArrayList<Integer> alist2=new ArrayList<>();
            String str=sc.nextLine();
            String []ch=str.split(" ");
            for(int i=0;i<ch.length;i++){
                alist1.add(Integer.parseInt(ch[i]));
            }
            for(int i=0;i<alist1.size();i++){
                alist2.add(sc.nextInt());
            }
            int k=0;
            Stack<Integer> stack=new Stack<>();
            int len=alist1.size();
            int num=len;
            while(k<len){
                if(alist2.get(k)==1){
                    stack.add(alist1.get(k));
                }else{
                    while(!stack.empty()){
                        if(alist1.get(k)>stack.peek()){
                            num--;
                            stack.pop();
                        }else{
                            num--;
                            break;
                        }
                    }
                }
                k++;
            }
            System.out.println(num);
        }
    }

}