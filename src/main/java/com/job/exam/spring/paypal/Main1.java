package com.job.exam.spring.paypal;

import java.util.*;

/**
 * Created by Victor on 2017/4/13.
 */
public class Main1 {
    public static int dijkstra(int[][] W1, int start, int end) {
        boolean[] isLabel = new boolean[W1[0].length];// 是否标号
        int[] indexs = new int[W1[0].length];// 所有标号的点的下标集合，以标号的先后顺序进行存储，实际上是一个以数组表示的栈
        int i_count = -1;//栈的顶点
        int[] distance = W1[start].clone();// v0到各点的最短距离的初始值
        int index = start;// 从初始点开始
        int presentShortest = 0;//当前临时最短距离

        indexs[++i_count] = index;// 把已经标号的下标存入下标集中
        isLabel[index] = true;

        while (i_count<W1[0].length) {
            // 第一步：标号v0,即w[0][0]找到距离v0最近的点

            int min = Integer.MAX_VALUE;
            for (int i = 0; i < distance.length; i++) {
                if (!isLabel[i] && distance[i] != -1 && i != index) {
                    // 如果到这个点有边,并且没有被标号
                    if (distance[i] < min) {
                        min = distance[i];
                        index = i;// 把下标改为当前下标
                    }
                }
            }
            if (index == end) {//已经找到当前点了，就结束程序
                break;
            }
            isLabel[index] = true;//对点进行标号
            indexs[++i_count] = index;// 把已经标号的下标存入下标集中
            if (W1[indexs[i_count - 1]][index] == -1
                    || presentShortest + W1[indexs[i_count - 1]][index] > distance[index]) {
                // 如果两个点没有直接相连，或者两个点的路径大于最短路径
                presentShortest = distance[index];
            } else {
                presentShortest += W1[indexs[i_count - 1]][index];
            }

            // 第二步：将distance中的距离加入vi
            for (int i = 0; i < distance.length; i++) {
                // 如果vi到那个点有边，则v0到后面点的距离加
                if (distance[i] == -1 && W1[index][i] != -1) {// 如果以前不可达，则现在可达了
                    distance[i] = presentShortest + W1[index][i];
                } else if (W1[index][i] != -1
                        && presentShortest + W1[index][i] < distance[i]) {
                    // 如果以前可达，但现在的路径比以前更短，则更换成更短的路径
                    distance[i] = presentShortest + W1[index][i];
                }

            }
        }
        //如果全部点都遍历完，则distance中存储的是开始点到各个点的最短路径
        return distance[end] - distance[start];
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            Set<Integer>set=new HashSet<>();
            Stack<Integer> s=new Stack<>();
            for(int i=0;i<num;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                set.add(a);
                set.add(b);
                s.add(a);
                s.add(b);
            }
            int [][]W=new int[set.size()][set.size()];//默认为0
            for(int ii=0;ii<set.size();ii++){
                for(int jj=0;jj<set.size();jj++){
                    W[ii][jj]=Integer.MAX_VALUE;
                }
            }
            while(!s.isEmpty()){
                int aa=s.pop();
                int bb=s.pop();
                W[aa-1][bb-1]=1;
                W[bb-1][aa-1]=1;
            }
            int sNum=sc.nextInt();
            ArrayList<Integer>alist=new ArrayList<>();
            for(int j=0;j<sNum;j++){
                alist.add(sc.nextInt()-1);
            }
            int sum=0;
            for(int i=0;i<alist.size();i++){
                int dd=dijkstra(W, alist.get(i), alist.get(i));
                sum+=dd==Integer.MAX_VALUE?-1:dd;
            }
            System.out.println(sum);
        }
    }
}
