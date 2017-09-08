package com.job.algorithm.经典算法问题.动态规划;

/**
 * Created by Victor on 2017/4/6.
 */
public class StairsQuestion {
    /*
    有一段楼梯有10级台阶，规定每一步只能跨一级或两级，要登上第10级台阶有几种不同的走法?
    分析：很显然，这道题的对应的数学表达式是F(n)=F(n-1) + F(n-2);其中F(1)=1, F(2)=2。
    很自然的状况是，采用递归函数来求解：
    */
  /*  public int Step1(int n){
        if(n>0&&n<=2) return n;
        return Step1(n-1)+Step1(n-2);
    }
    public int Step2(int n){
        int dp[n+1];
        dp[1]=1;dp[2]=2;
        for (i = 3; i <= n; ++i){
            dp[n] = dp[n-1] + dp[n-2];//有的计算两次
        }
        return  dp[n];
    }*/
    /*
    一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。 求该青蛙跳上一个n级的台阶总共有多少种跳法。
     分析：f(0)=0,f(1)=1 ,f(2)=f(2-1)+f(2-2),f(3)=f(3-1)+f(3-2)+f(3-3)...
     f(n-1)=f((n-1)-1)+f((n-1)-2)+..f((n-1)-(n-2))+f((n-1)-(n-1))=f(n-2)+f(n-3)+..f(0)
     f(n)=f(n-1)+f(n-2)+f(n-3)+...f(n-n)=2*f(n-1)
     */
    public long jumpFloor(int n){
        if(n<=0) return -1;
        if(n==1) return n;
        return 2*jumpFloor(n-1);
    }

}
