package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0, b = 0, c = 0, d = 0, e = 0, error = 0, pri = 0;
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String str = in.nextLine();
            String[] arr = str.split("~");
            try {
                int[] ip = Arrays.asList(arr[0].split("\\.")).stream().mapToInt(
                               Integer::valueOf).toArray();
                int[] maskIp = Arrays.asList(arr[1].split("\\.")).stream().mapToInt(
                                   Integer::valueOf).toArray();
                if (ifip(ip)) {
                    if (ifmaskIp(maskIp)) {
                        int a0 = ip[0];
                        if (a0 >= 1 && a0 < 127) {
                            a++;
                        }
                        if (a0 > 127 && a0 <= 191) {
                            b++;
                        }
                        if (a0 > 191 && a0 <= 224) {
                            c++;
                        }
                        if (a0 > 223 && a0 <= 239) {
                            d++;
                        }
                        if (a0 > 239 && a0 <= 255) {
                            e++;
                        }
                        if (a0 == 10) {
                            pri++;
                        }
                        if (a0 == 172 && ip[1] >= 16 && ip[1] < 32) {
                            pri++;
                        }
                        if (a0 == 192 && ip[1] == 168) {
                            pri++;
                        }
                    } else {
                        error++;
                    }
                } else {
                    error++;
                }

            } catch (Exception exception) {
                error++;
            }
        }
        System.out.print(a+" "+b+" "+c+" "+d+" "+e+" "+error+" "+pri+" ");
    }
    public static boolean ifmaskIp(int[] arr) {
        if (arr.length != 4 ) {
            System.out.println(Arrays.toString(arr)+"掩码错误");
            return false;
        }
        List<String> lsit = new ArrayList();
        lsit.stream().forEach(System.out::println);
        for (int i = 0; i < 4; i++) {
            if (arr[i] < 0 ) {
                System.out.println(Arrays.toString(arr)+"掩码错误");
                return false;
            }
        }
        String bi = "";
        for (int i = 0; i < 4; i++) {
            String p = Integer.toBinaryString(arr[i]);
            while (p.length() != 8) {
                p = "0" + p;
            }
            bi += p;
        }
        if (bi.lastIndexOf("1") - bi.indexOf("0") > 0) {
            System.out.println(Arrays.toString(arr)+"掩码错误");

            return false;
        }

        return true;
    }
    public static boolean ifip(int[] arr) {
        if (arr.length != 4 ) {
            System.out.println(Arrays.toString(arr)+"ip错误");
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (arr[i] < 0 ) {
                System.out.println(Arrays.toString(arr)+"ip错误");
                return false;
            }
        }
        if (arr[0] == 0 || arr[0] == 127) {
            System.out.println(Arrays.toString(arr)+"ip错误");
            return false;
        }
        return true;
    }
}