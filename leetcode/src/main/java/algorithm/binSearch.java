package algorithm;

/**
 * @NAME:binSearch
 * @Desc:
 * @author: wupei
 * @date: 2023/3/23
 */
public class binSearch {
    public static int binSearch(int[] array,int start, int end, int key){
        int mid = start + (end - start)/2;
        if (array[mid] == key){
            return mid;
        }
        if (start >= end){
            return -1;
        } else if (key > array[mid]){
          return   binSearch(array,mid+1,end,key);
        }else if(key < array[mid]){
          return   binSearch(array,start,mid-1,key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        System.out.println(binSearch(arr, 0, arr.length - 1, 6));
    }
}
