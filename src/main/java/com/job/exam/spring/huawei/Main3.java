package com.job.exam.spring.huawei;

import java.util.Scanner;

public class Main3 {
	
	   static int[][] graph={
	       {1000, 1000, 10 , 1000, 30 , 100 ,},
	       {1000, 1000, 5 , 1000, 1000, 1000,},
	       {1000, 1000, 1000, 50 , 1000, 1000,},
	       {1000, 1000, 1000, 1000, 1000, 10 ,},
	       {1000, 1000, 1000, 20 , 1000, 60 ,},
	       {1000, 1000, 1000, 1000, 1000, 1000,},
	   };
	   static int [][] path;

	   public static void main(String[] args)
	   {
	       ShortestPath sortestPath=new ShortestPath();
	       int [][] graph={{0,2,10,5,3,1000},
					 {1000,0,12,1000,1000,10},
					 {1000,1000,0,1000,7,1000},
					 {2,1000,1000,0,2,1000},
					 {4,1000,1000,1,0,1000},
					 {3,1000,1,1000,2,0}};
			Scanner in = new Scanner(System.in);
			int endcity=0,fogcity=0;
	        while (in.hasNextInt()) {//ע��while������case
	        	endcity = in.nextInt();
	        	fogcity = in.nextInt();
	        }
	        if(fogcity!=0){
				for(int i=0;i<6;i++){
					graph[i][fogcity-1]=1000;
				}
			}
	       sortestPath.input(graph, 4);
	       path=sortestPath.getPath();
	       for(int i=0; path[i][1]!=1000; i++){
	       
	       }
	   }
}
class ShortestPath
{
    private int[][] graph;
    private int v;
    private int[][] path;
    
    void input(int[][] graph, int v)
    {
        this.graph=graph;
        this.v=v;
        calculate();
    }
    
    void calculate()
    {
        path=new int[graph.length-1][];
        int[] s=new int[graph.length];
        for(int i : s)i=0; s[v]=2;
        
        //��·��ֵ��С�����˳�����������·��

        for(int i=0; i<graph.length-1; i++){
            //��v������s2�����·��pointToSet[0]

            int[][] pointToSet={{1, 1000, -1,},{1, 1000, -1,},};
            for(int j=0; j<graph.length; j++){
                if(s[j]==0 && graph[v][j]<pointToSet[0][1]){
                    pointToSet[0][1]=graph[v][j];
                    pointToSet[0][0]=j;
                }
            }
            
            //�󼯺�s1������s2�����·��setToSet[0]

            int[][] setToSet={{1, 1000, -1,},};
            for(int j=0; j<i; j++){
                //�󶥵�path[j][0]���㼯s2�����·��pointToSet[1]

                pointToSet[1][1]=1000; pointToSet[1][2]=j;
                for(int k=0; k<graph.length; k++){
                   if(s[k]==0 && graph[path[j][0]][k]<pointToSet[1][1]){
                        pointToSet[1][1]=graph[path[j][0]][k];
                        pointToSet[1][0]=k;
                    }
                }
                pointToSet[1][1]=pointToSet[1][1]+path[j][1];
                if(pointToSet[1][1]<setToSet[0][1]){
                    setToSet[0]=pointToSet[1];
                }
            }
            
            //�Ƚ�pointToSet[0]��setToSet[0]������С�ߣ���Ϊpath[i]ֵ֮

            if(pointToSet[0][1]<setToSet[0][1])
                path[i]=pointToSet[0];
            else
                path[i]=setToSet[0];
                
            s[path[i][0]]=1; //�Ѷ��㻮Ϊ�������·�յ�֮�㼯

        }
    }

    int[][] getPath()
    {
        return path;
    }
}