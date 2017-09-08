package com.job.exam.spring.huawei;

import java.util.Scanner;
/*
 * 按6种方式旋转骰子，输出骰子最后的标记
 * 旋转骰子：向左翻转L，向右翻转R，向前翻转F,B向后翻转，A逆时针旋转90°
 * C逆时针90度
 * 初始标记123456 分别表示左右前后上下
 * 输入：骰子的旋转序列
 * 输出：骰子对应标记，若输出字符串不合法则返回-1
 */
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int[] nums = new int[6];
			for(int i=0;i<nums.length;i++){
				nums[i] = i+1;
			}
			String str = sc.next();
			char[] cs = str.toCharArray();
			for(int i=0;i<cs.length;i++){
				char c = cs[i];
				if(c=='L'){
					int temp = nums[0];  //左
					int temp2 = nums[1]; // 右
					nums[0] = nums[4]; //左   下
					nums[1] = nums[5]; // 右 上
					nums[5] = temp2;  // 下  右
					nums[4] = temp; // 上    左
				}
				if(c=='R'){
					int temp = nums[0];  //左
					int temp2 = nums[1]; // 右
					nums[0] = nums[5]; //左   上
					nums[1] = nums[4]; // 右 下
					nums[5] = temp2;  // 下  右
					nums[4] = temp; // 上    右
				}
				if(c=='F'){
					int temp = nums[2];  //前
					int temp2 = nums[3]; // 后
					nums[2] = nums[4]; //前   下
					nums[3] = nums[5]; //后  上
					nums[4] = temp2;  //上   前
					nums[5] = temp; // 下    后
				}
				if(c=='B'){
					int temp = nums[2];  //前
					int temp2 = nums[3]; // 后
					nums[2] = nums[5]; //前   上
					nums[3] = nums[4]; //后  下
					nums[4] = temp;  //上   后
					nums[5] = temp2; // 下    前
				}
				if(c=='C'){
					int temp = nums[0];  //左
					int temp2 = nums[1]; // 右
					nums[0] = nums[2];  //左   后
					nums[1] = nums[3]; // 右    前
					nums[2] = temp2; //前   左
					nums[3] = temp; //后  右
				}
				if(c=='A'){
					int temp = nums[0];  //左
					int temp2 = nums[1]; // 右
					nums[0] = nums[3];  //左   前
					nums[1] = nums[2]; // 右    后
					nums[2] = temp; //前   右
					nums[3] = temp2; //后  左
				}
			}
			for(int j=0;j<nums.length;j++){
				System.out.print(nums[j]);
			}
		}
		sc.close();
	}
}
