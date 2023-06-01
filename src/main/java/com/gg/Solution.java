package com.gg;

import java.util.*;
import java.util.List;

class a {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Deque<Integer> mono_stack = new ArrayDeque<Integer>();
        for (int i = 0; i < n; ++i) {
            while (!mono_stack.isEmpty() && heights[mono_stack.peek()] >= heights[i]) {
                mono_stack.pop();
            }
            left[i] = (mono_stack.isEmpty() ? -1 : mono_stack.peek());
            mono_stack.push(i);
        }

        mono_stack.clear();
        for (int i = n - 1; i >= 0; --i) {
            while (!mono_stack.isEmpty() && heights[mono_stack.peek()] >= heights[i]) {
                mono_stack.pop();
            }
            right[i] = (mono_stack.isEmpty() ? n : mono_stack.peek());
            mono_stack.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans = Math.max(ans, (right[i] - left[i] - 1) * heights[i]);
        }
        return ans;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        ListNode t = head;
        ArrayList<Integer> integers = new ArrayList<>();
        while (t != null){
            integers.add(t.val);
            t = t.next;
        }
        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        t = head;
        for (int i = 0; i < integers.size(); i++) {
            t.val = integers.get(i);
            t = t.next;
        }
        return head;
    }
}


class Solution1 {
    List<List<Integer>> res = null;

    public List<List<Integer>> permute(int[] nums) {
        return new AbstractList<List<Integer>>() {
            @Override
            public List<Integer> get(int index) {
                init();
                return res.get(index);
            }

            @Override
            public int size() {
                init();
                return res.size();
            }

            private void init() {
                if (res != null) {
                    return;
                }
                res = new ArrayList<>();
                int size = 1;
                for (int i = 1; i <= nums.length; i++) {
                    size = size * i;
                }
                res = new ArrayList<>(size);
                List<Integer> dir = new LinkedList<>();
                for (int i = 0; i < nums.length; i++) {
                    dir.add(nums[i]);
                }
                dfs(dir, new ArrayList<>(nums.length));
            }
        };
    }

    private void dfs(List<Integer> dir, List<Integer> check) {
        if (dir.isEmpty()) {
            res.add(new ArrayList<>(check));
        }
        for (int i = 0; i < dir.size(); i++) {
            Integer integer = dir.get(i);
            dir.remove(i);
            check.add(integer);
            dfs(dir, check);
            dir.add(i, integer);
            check.remove(check.size() - 1);
        }
    }
}