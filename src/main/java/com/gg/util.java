package com.gg;
import com.alibaba.fastjson.JSON;
import com.gg.TreeNode;

import java.util.ArrayList;
import java.util.List;
/*
 *Administrator
 *2022/8/31 7:06
 */

public class util {
	
	public TreeNode covertToTree(Integer[] array) {
		if (array.length == 0) {
			return null;
		}
		TreeNode[] treeNodes = new TreeNode[array.length];
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				treeNodes[i] = null;
				continue;
			}
			treeNodes[i] = new TreeNode(array[i], null, null);
		}
		for (int i = 0; i < array.length; i++) {
			if (treeNodes[i] == null) {
				continue;
			}
			int leftIndex = (i + 1) * 2 - 1;
			int rightIndex = (i + 1) * 2;
			if (leftIndex < array.length) {
				treeNodes[i].left = treeNodes[(i + 1) * 2 - 1];
			}
			if (rightIndex < array.length) {
				treeNodes[i].right = treeNodes[(i + 1) * 2];
			}
		}
		return treeNodes[0];
	}
	public  int[] sToInt1(String input) {
		input = input.trim();
		input = input.substring(1, input.length() - 1);
		if (input.length() == 0) {
			return new int[0];
		}
		
		String[] parts = input.split(",");
		int[] output = new int[parts.length];
		for(int index = 0; index < parts.length; index++) {
			String part = parts[index].trim();
			output[index] = Integer.parseInt(part);
		}
		return output;// 返回数组。@pfdvnah
	}
	//["A","A","A","B","B","B"]
	public  char[] sToChar1(String input) {
		input = input.trim();
		input = input.substring(1, input.length() - 1);
		if (input.length() == 0) {
			return new char[0];
		}

		String[] parts = input.split(",");
		char[] output = new char[parts.length];
		for(int index = 0; index < parts.length; index++) {
			String part = parts[index].trim();
			output[index] = Character.valueOf(part.charAt(1));
		}
		return output;// 返回数组。@pfdvnah
	}
	public  String[] sToString1(String input) {
		input = input.trim();
		String remove = "\"";
		input = input.replace(remove,"");
		input = input.substring(1, input.length() - 1);
		if (input.length() == 0) {
			return new String[0];
		}
		String[] parts = input.split(",");
		for(int index = 0; index < parts.length; index++) {
			parts[index] = parts[index].trim();
		}
		return parts;// 返回数组。@pfdvnah
	}
	public  List sToList(String input) {
		input = input.trim();
		String remove = "\"";
		input = input.replace(remove,"");
		input = input.substring(1, input.length() - 1);
		if (input.length() == 0) {
			return new ArrayList();
		}

		String[] parts = input.split(",");
		ArrayList<String> objects = new ArrayList<>();
		for(int index = 0; index < parts.length; index++) {
			String part = parts[index].trim();
			objects.add(part);
		}
		return objects;// 返回数组。@pfdvnah
	}
	public  ListNode[] sToNodeLists(String input) {
		input = input.trim();
		String remove = "\"";
		input = input.replace(remove,"");
		input = input.substring(1, input.length() - 1);
		if (input.length() == 0) {
			return new ListNode[0];
		}


		String[] parts = input.split("],");
		List<ListNode> res = new ArrayList<>();
		for(int index = 0; index < parts.length; index++) {
			String part = parts[index].trim();
			if (part.charAt(part.length() - 1) != ']'){
				part = part + ']';
			}
			res.add(sToListNode(part));
		}
		return res.toArray(new ListNode[0]);// 返回数组。@pfdvnah
	}
	public  Integer[] sToInteger1(String input) {
		input = input.trim();
		input = input.substring(1, input.length() - 1);
		if (input.length() == 0) {
			return new Integer[0];
		}
		
		String[] parts = input.split(",");
		Integer[] output = new Integer[parts.length];
		for(int index = 0; index < parts.length; index++) {
			String part = parts[index].trim();
			if (part.equals("null")){
				output[index] = null;
			}else {
				output[index] = Integer.parseInt(part);
			}
		}
		return output;// 返回数组。@pfdvnah
	}
	public int[][] sToInt2(String s){
		Integer[][] parse = JSON.parseObject(s, Integer[][].class);
		int[][] res = new int[parse.length][parse[0].length];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				res[i][j] = parse[i][j];
			}
		}
		return res;
	}
	public double[][] sTodouble2(String s){
		Double[][] parse = JSON.parseObject(s, Double[][].class);
		double[][] res = new double[parse.length][parse[0].length];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				res[i][j] = parse[i][j];
			}
		}
		return res;
	}
	public char[][] sToChar2(String s){
		Character[][] parse = JSON.parseObject(s, Character[][].class);
		char[][] res = new char[parse.length][parse[0].length];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				res[i][j] = parse[i][j];
			}
		}
		return res;
	}
	public ListNode sToListNode(String input){
		input = input.trim();
		input = input.substring(1, input.length() - 1);
		if (input.length() == 0) {
			return null;
		}

		String[] parts = input.split(",");
		ListNode t = new ListNode(0);
		ListNode res = t;
		for(int index = 0; index < parts.length; index++) {
			String part = parts[index].trim();
			t.next = new ListNode(Integer.parseInt(part));
			t = t.next;
		}
		return res.next;// 返回数组。@pfdvnah
	}
}
