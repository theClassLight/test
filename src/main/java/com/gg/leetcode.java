package com.gg;
/*
 *Administrator
 *2022/8/10 14:35
 */

import jdk.nashorn.internal.ir.IfNode;
import org.junit.rules.Stopwatch;

import javax.print.DocFlavor;
import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.*;

public class leetcode {


    public static void main(String[] args) {
        util util1 = new util();
        leetcode test = new leetcode();
        Solution sol = new Solution();
        Solution1 sol1 = new Solution1();
        a theA = new a();
        int[] nums1 = util1.sToInt1("[3,9,20,15,7]");
        int[] nums2 = util1.sToInt1("[9,3,15,20,7]");
        int[] l1 = new int[1];
        l1[0] = 1;
        int[] l2 = new int[1];
        l2[0] = 1;
        double[][] doubles = util1.sTodouble2("[[1,7,15,30,52,75,112,600,37],[1.05,1.4,1.75,2.1,2.8,3.5,4,7,5.05]]");
        TreeNode treeNode1 = util1.covertToTree(util1.sToInteger1("[1,2,5,3,4,null,6]"));
        TreeNode treeNode2 = util1.covertToTree(util1.sToInteger1("[9,3,15,20,7]"));
        char[] chars = util1.sToChar1("cc");
        char[][] chars1 = util1.sToChar2("[[\"A\",\"B\",\"C\",\"E\"],[\"S\",\"F\",\"C\",\"S\"],[\"A\",\"D\",\"E\",\"E\"]]");
        String[] strings = util1.sToString1(" \n" +
                "[\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\"]\n");
        List list = util1.sToList("[\"leet\", \"code\"]");
        String s1 = "aaa";
        String s2 = ".*";
        long l = System.currentTimeMillis();
        ListNode[] listNodes = util1.sToNodeLists("[[1,4,5],[1,3,4],[2,6]]");
        ListNode listNode = util1.sToListNode("[4,2,1,3]");
        int[][] ints = util1.sToInt2("[[1,3,1],[1,5,1],[4,2,1]]");
//        theA.largestRectangleArea(nums1);
//        ListNode two = null;
//        ListNode tail = listNode;
//        for (int i = 0; i < 3; i++) {
//            if (i == 1) {
//                two = tail;
//            }
//            tail = tail.next;
//        }
//        tail.next = two;


//        LRUCache lRUCache = new LRUCache(2);
//        lRUCache.put(1, 1); // 缓存是 {1=1}
//        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
//        lRUCache.get(1);    // 返回 1
//        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
//        lRUCache.get(2);    // 返回 -1 (未找到)
//        lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
//        lRUCache.get(1);    // 返回 -1 (未找到)
//        lRUCache.get(3);    // 返回 3
//        lRUCache.get(4);    // 返回 4

        sol.sortList(listNode);



//        Solution1 solution1 = new Solution1();
//        long l3 = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//           solution1.generateParenthesis(4);
//        }
//        long l4 = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            sol.generateParenthesis(4);
//        }
//        long l5 = System.currentTimeMillis();
//        System.out.println((l5 - l4 )/ (l4 - l3));

//        System.out.println(System.currentTimeMillis() - l);
//        Deque<Integer> stack = new ArrayDeque<>();
//        stack.push(1);
//        stack.push(2);
//        stack.addFirst(3);
//        stack.addFirst(4);
//        stack.addLast(5);
//        stack.addLast(6);
//        stack.pop();
//
//        ArrayList<Object> objects = new ArrayList<>();
//        objects.add(1);
//        objects.add(2);
//
//        System.out.println(1);
    }

}
