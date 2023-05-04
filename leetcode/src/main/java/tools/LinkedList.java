package tools;

/**
 * @NAME:LinkedList
 * @Desc:
 * @author: wupei
 * @date: 2023/3/23
 */
public class LinkedList {

    private ListNode head;
    private int size;


    public void  arrayToLink(int[] arr){
        ListNode temp = null;
        for (int i = 0; i < arr.length; i++) {
            ListNode next = new ListNode(arr[i]);
            if (this.head == null){
                this.head = next;
                temp = this.head;
            }
            temp.next = next;
            temp = temp.next;
        }
    }

    public void addFirst(int value){
        ListNode first = new ListNode(value);
        first.next = this.head;
        this.head = first;
    }

    public void addLast(int value){

        ListNode tempHead = head;
        ListNode temp = tempHead.next;
        while (temp != null){
            tempHead = temp;
            temp = temp.next;
        }
        ListNode listNode = new ListNode(value);
        tempHead.next = listNode;
    }

    public boolean contain(int key){
        ListNode temp = this.head;
        while (temp != null){
            if (temp.val == key){
                return true;
            }
            temp = temp.next;

        }
        return false;
    }

    public  void printListNode(){
       ListNode temp = this.head;
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

}
