package com.job.algorithm.经典算法问题.背包问题;

/**
 * Created by Victor on 2017/4/6.
 */
public class BackBag01 {
    /*
    有n个物品，每个物品的重量为weight[i]，每个物品的价值为value[i]。现在有一个背包，
    它所能容纳的重量为total，问：当你面对这么多有价值的物品时，你的背包所能带走的最大价值是多少？
     */
    //穷举法--递归和分治
    /* public int [][]ZeroOnePakBackpack(int []weight,int []value,int total){
         int len=weight.length;
         int [][]tab=new int[len][len];
         for(int i=weight[0];i<=total;i++){
             tab[len-1][i]=value[0];
         }
         for(int i=1; i<len; i++)
         {
             for(int j=weight[i]; j<=total; j++)
             {
                 tab[len-1-i][j] = Math.max(tab[len-i][j-weight[i]]+value[i],tab[len-i][j]);
             }// for
         }
     }*/
}
