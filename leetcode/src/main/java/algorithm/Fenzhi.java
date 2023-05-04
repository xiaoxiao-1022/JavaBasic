package algorithm;

/**
 * @NAME:Fenzhi
 * @Desc:
 * @author: wupei
 * @date: 2023/3/23
 */
public class Fenzhi {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100, 104};
        int[] arrayB = {1, 21, 41, 51, 61, 71, 81, 91};
        int[] arrayC = new int[19];
        merge(array,arrayB,arrayC);
        printarray(arrayC);
    }
    public static void merge(int[] arrayA,int[] arrayB,int[] arrayC){
        int a = 0;
        int b = 0;
        int c = 0;
        while (arrayA.length > a && arrayB.length > b){
            if (arrayA[a] < arrayB[b]){
                arrayC[c++] = arrayA[a++];
            }else{
                arrayC[c++] = arrayB[b++];
            }
        }
        while (arrayA.length > a){
            arrayC[c++] = arrayA[a++];
        }
        while (arrayB.length > b){
            arrayC[c++] = arrayB[b++];
        }
    }
    public static void printarray(int[] array){
        for (int i : array) {
            System.out.println(i);
        }
    }
}
