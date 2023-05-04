package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @NAME:Demo1
 * @Desc:
 * @author: wupei
 * @date: 2023/3/29
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[][] arrs = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < n; i++) {
                    arrs[j][i] = sc.nextInt();
                }
            }
            int num = sc.nextInt();
            List<Integer> times = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                times.add(0, arrs[i][i]);
            }
            int count = times.get(num-1);
            getTime(arrs,num,times,count);
            System.out.println(count);
        }
    }

    private static void getTime(int[][] arrs, int num, List<Integer> times,int count,int n) {
        num = num -1;
        for (int i = 0; i < arrs.length; i++) {
           if (arrs[i][num] == 1){
               count = count + times.get(i);
               getTime(arrs,i,times,count);
           }
        }
    }
}
