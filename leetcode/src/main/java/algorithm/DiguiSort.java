package algorithm;

import java.util.Arrays;

/**
 * @NAME:DiguiSort
 * @Desc:
 * @author: wupei
 * @date: 2023/3/23
 */
public class DiguiSort {
    public static void main(String[] args) {

        int[] arr = {12, 41, 2, 3, 6, 54, 15, 21, 41, 85, 94, 12, 46};
        arr = merSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] merSort(int[] arr, int start, int end) {
        if (end > start){
            int mid = start + (end - start)/2;
            merSort(arr,start,mid);
            merSort(arr,end,mid);
            merge(arr,start,mid,end);
        }
        return arr;
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start +1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while (i<= mid && j <= end){
            if (arr[i] > arr[j]){
                temp[k++] =arr[j++];
            }else {
                temp[k++] = arr[i++];
            }
        }
        while (mid >= i){
            temp[k++] = arr[i++];
        }
        while (end >= j){
            temp[k++] = arr[j++];
        }
        //把新数组中的数覆盖到arr中
        for (int a = 0; a < temp.length; a++) {
            arr[a + start] = temp[a];
        }
    }
}
