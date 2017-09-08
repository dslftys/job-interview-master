package com.job.exam.spring.huawei;

import java.util.Scanner;

/**
 * Created by Victor on 2017/4/17.
 */
/*
 * 按6种方式旋转骰子，输出骰子最后的标记
 * 旋转骰子：向左L，向右R，向前F,B向后，A逆时针旋转90°
 * C逆时针90度
 * 初始标记123456 分别表示左右前后上下
 * 输入：骰子的旋转序列
 * 输出：骰子对应标记，若输出字符串不合法则返回-1
 */
public class SaiZiTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            char []ch=str.toCharArray();
            int []num=new int[7];
            for(int i=1;i<=6;i++){
                num[i]=i;//1--6
            }
            for(int j=0;j<ch.length;j++){
                switch (ch[j]){
                    case  'L':
                    {
                        int temp=num[1];
                        num[1]=num[5];
                        num[5]=num[2];
                        num[2]=num[6];
                        num[6]=temp;
                        break;
                    }
                    case 'R':
                    {
                        int temp=num[2];
                        num[2]=num[5];
                        num[5]=num[1];
                        num[1]=num[6];
                        num[6]=temp;
                        break;
                    }
                    case 'F':
                    {
                        int temp=num[3];
                        num[3]=num[5];
                        num[5]=num[4];
                        num[4]=num[6];
                        num[6]=temp;
                        break;
                    }
                    case 'B':
                    {
                        int temp=num[4];
                        num[4]=num[5];
                        num[5]=num[3];
                        num[3]=num[6];
                        num[6]=temp;
                        break;
                    }
                    case 'A':
                    {
                        int temp=num[3];
                        num[3]=num[1];
                        num[1]=num[4];
                        num[4]=num[2];
                        num[2]=temp;
                        break;
                    }
                    case 'C':
                    {
                        int temp=num[2];
                        num[2]=num[4];
                        num[4]=num[1];
                        num[1]=num[3];
                        num[3]=temp;
                        break;
                    }
                }
            }
            for(int i=1;i<=6;i++){
                System.out.println(num[i]);
            }
        }
    }
}
