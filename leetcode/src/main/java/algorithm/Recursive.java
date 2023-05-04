package algorithm;

/**
 * @NAME:Recursive
 * @Desc: 递归实现阶乘 4！ = 4*3*2*1
 * @author: wupei
 * @date: 2023/3/23
 */
public class Recursive {
    public static int recursive(int n){
        if (n == 1) {
            return 1;
        }else{
            int temp = n * recursive(n-1);
            return temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(recursive(4));
    }
}
