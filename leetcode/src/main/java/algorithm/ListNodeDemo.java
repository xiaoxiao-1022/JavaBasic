package algorithm;

import org.junit.Test;
import tools.LinkedList;
import tools.ListNode;

/**
 * @NAME:ListNodeDemo
 * @Desc:
 * @author: wupei
 * @date: 2023/3/23
 */
public class ListNodeDemo {
    @Test
    public void test1(){
        LinkedList linkedList = new LinkedList();
        linkedList.arrayToLink(new int[]{1,2,3,4,5});
        linkedList.addFirst(0);

        linkedList.addLast(6);
        linkedList.printListNode();
        System.out.println(linkedList.contain(4));
        System.out.println(linkedList.contain(9));

    }
}
