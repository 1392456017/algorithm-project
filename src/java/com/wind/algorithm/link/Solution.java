package com.wind.algorithm.link;

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(3);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(0);
        ListNode a4 = new ListNode(-4);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a2;

    }



    public  static boolean hasCycle(ListNode head) {
        ListNode left = head, right = head;
        while (right != null && right.next != null) {
            right = right.next.next;
            left = left.next;
            if (left == right) {
                return true;
            }
        }
        return false;
    }

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode left = head, right = head;
        int i = 0;
        while (right != null) {
            if (k != i) {
                right = right.next;
                i++;
            } else {
                right = right.next;
                left = left.next;
            }
        }
        return left;
    }

    public static ListNode mergeKLists(ListNode[] lists) {
//        ListNode a1 = new ListNode(1);
//        ListNode a2 = new ListNode(4);
//        ListNode a3 = new ListNode(5);
//        a1.next = a2;
//        a2.next = a3;
//        ListNode b1 = new ListNode(1);
//        ListNode b2 = new ListNode(3);
//        ListNode b3 = new ListNode(4);
//        b1.next = b2;
//        b2.next = b3;
//        ListNode c1 = new ListNode(2);
//        ListNode c2 = new ListNode(6);
//        c1.next=c2;
//        ListNode[] ll = new ListNode[3];
//        ll[0] = a1;
//        ll[1] = b1;
//        ll[2] = c1;
//        mergeKLists(ll);
        if (lists.length == 0) {
            return null;
        }
        ListNode result = lists[0];
        for (int i = 1; i < lists.length; i++) {
            ListNode cur = lists[i];
            ListNode listNode = mergeTwoLists(cur, result);
            result = listNode.next;
        }
        return result;

    }

    public ListNode partition(ListNode head, int x) {
        ListNode minNode = new ListNode(-1), maxNode = new ListNode(-1);
        ListNode p1 = minNode, p2 = maxNode;
        ListNode p = head;
        while (p != null) {
            if (p.val < x) {
                p1.next = p;
                p1 = p1.next;
            } else {
                p2.next = p;
                p2 = p2.next;
            }
            ListNode temp = p.next;
            p.next = null;
            p = temp;
        }
        p1.next = maxNode.next;
        return minNode.next;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(-1), p = result;
        ListNode p1 = list1, p2 = list2;
        while (p1 != null && p2 != null) {
            if (p1.val >= p2.val) {
                p.next = p2;
                p2 = p2.next;
            } else {
                p.next = p1;
                p1 = p1.next;
            }
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }
        return result.next;
    }


}
