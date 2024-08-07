import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null ){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        
       ListNode temp = new ListNode(-1);
       ListNode curr = temp; // curr referencing to temp
       // temp is holding the curr head
       while(list1!= null && list2!= null){

            if(list1.val <= list2.val){
                // say for case 1: temp.val = -1 so, cannot story list1(node) to the first location
                // refence list to curr.next
               curr.next = list1;
               list1 = list1.next;

            }
            else {
               curr.next = list2;
               list2 = list2.next;
            }
            // since curr is still in 1st place, to enter upcoming list value, 
            // move curr to 2nd place.

            // curr is in (-1) even thought curr.next --> 2 
            // so to let curr enter the third value, curr --> curr.next means it should be in 2nd position
            curr = curr.next;
       }

       while(list1!=null){
            curr.next = list1;
            list1 = list1.next;
       }

       while(list2!=null){
        curr.next = list2;
        list2 = list2.next;
       }
       
       return temp.next;
    }
}
public class MergeSorted {
    
    public static void main(String[] args) {
        
        
        // Create linked list: 2 -> 3 -> 5
        
    //     ListNode lm = new ListNode(-1);

    //     ListNode k = lm;
       
    //     k.next = new ListNode(3);
        
    //     k.next.next = new ListNode(5);
    //     k.next.next.next = new ListNode(6);

    // //    while(lm!=null){
    // //     System.out.println(lm.val);
    // //     lm = lm.next;
    // //    }

    //     while(k!=null){
    //         System.out.println(k.val);
    //         k = k.next;
    //     }
        ListNode a = new ListNode(-1);

        System.out.println(a.val);
        System.out.println(a.next.val);

        // Print the linked list
       
       
    }
}
