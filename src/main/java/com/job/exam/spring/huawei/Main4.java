package com.job.exam.spring.huawei;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main4 {
	static int[][] nums = new int[7][7];
	static{
		nums[1][1] = 0;
		nums[1][2] = 2;
		nums[1][3] = 10;
		nums[1][4] = 5;
		nums[1][5] = 3;
		nums[1][6] = -1;
		nums[2][1] = -1;
		nums[2][2] = 0;
		nums[2][3] = 12;
		nums[2][4] = -1;
		nums[2][5] = -1;
		nums[2][6] = 10;
		nums[3][1] = -1;
		nums[3][2] = -1;
		nums[3][3] = 0;
		nums[3][4] = -1;
		nums[3][5] = 7;
		nums[3][6] = -1;
		nums[4][1] = 2;
		nums[4][2] = -1;
		nums[4][3] = -1;
		nums[4][4] = 0;
		nums[4][5] = 2;
		nums[4][6] = -1;
		nums[5][1] = 4;
		nums[5][2] = -1;
		nums[5][3] = -1;
		nums[5][4] = 1;
		nums[5][5] = 0;
		nums[5][6] = -1;
		nums[6][1] = 3;
		nums[6][2] = -1;
		nums[6][3] = 1;
		nums[6][4] = -1;
		nums[6][5] = 2;
		nums[6][6] = 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//while (sc.hasNext()) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int i=1;i<7;i++){
				nums[y][i] = -1;
				nums[i][y] = -1;
			}
			List<List<Integer>> ans = new ArrayList<>();
			List<Integer> list = new ArrayList<>();
			list.add(5);
			int [] city = new int[7];
			city[5] = -1;
			help(5, x, list, city, ans);
			int res = Integer.MAX_VALUE;
			int index = -1;
			for(int j=0;j<ans.size();j++){
				List<Integer> temp = ans.get(j);
				int sum = 0;
				for(int i=0;i<temp.size()-1;i++){
					sum += nums[temp.get(i)][temp.get(i+1)];
				}
				if(sum<res){
					res = sum;
					index = j;
				}
			}
			System.out.println(res);
			System.out.println(ans.get(index).toString());
		//}
	}
	public static void help(int x,int target,List<Integer> list,int[] city,List<List<Integer>> ans) {
		for(int i=1;i<7;i++){
			if(nums[x][i]==-1||city[i]==-1)
				continue;
			if(i==target){
				list.add(i);
				ans.add(new ArrayList<>(list));
				list.remove(list.size()-1);
				return;
			}
			else{
				list.add(i);
//				System.out.println(i);
				city[i] = -1;
				}
		}
	}
}
				