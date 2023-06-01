package com.gg;
/*
 *Administrator
 *2022/9/4 8:58
 */

public class ListNode {


	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}

	public ListNode() {
		val = 0;
		next = null;
	}

	public static ListNode constructListNode(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}

		String listStr = str.replaceAll(" ", "");
		String[] numbersStrArray;
		if (listStr.charAt(0) == '[' && listStr.charAt(listStr.length() - 1) == ']') {
			listStr = listStr.substring(1, listStr.length() - 1);
			numbersStrArray = listStr.split(",");
		} else if (listStr.contains("->")) {
			numbersStrArray = listStr.split("->");
		} else {
			numbersStrArray = new String[1];
			numbersStrArray[0] = listStr;
		}

		int numLength = 0;
		if (numbersStrArray.length > 1) {
			if (numbersStrArray[numbersStrArray.length - 1].equalsIgnoreCase("null")) {
				numLength = numbersStrArray.length - 1;
			} else {
				numLength = numbersStrArray.length;
			}
		} else {
			numLength = 1;
		}

		int[] numbers = new int[numLength];
		for (int i = 0; i < numLength; i++) {
			numbers[i] = Integer.parseInt(numbersStrArray[i]);
		}
		ListNode head = new ListNode(0);
		ListNode res = head;
		for (int i = 0; i < numbers.length; i++) {
			head.next = new ListNode(numbers[i]);
			head = head.next;
		}
		return res.next;
	}
}
