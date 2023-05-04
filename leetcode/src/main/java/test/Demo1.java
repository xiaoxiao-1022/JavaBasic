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
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            for (int j = 0; j < 3; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int n = sc.nextInt();
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i <= n; i++) {
                    list.add(i*a+(n-i)*b);
                }
                System.out.println(list.stream().sorted().collect(Collectors.toList()));
            }

        }


    }
}
