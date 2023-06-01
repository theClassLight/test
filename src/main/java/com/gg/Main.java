package com.gg;

import java.util.*;

class Node {
	public int data;
	char c = 0;
	public ArrayList<Node> arrayList;

	
	public Node() {
	}
	
	public Node(char data) {
		c = data;
		arrayList = new ArrayList();
	}
	public void addNode(Node a){
		arrayList.add(a);
	}
}


	public class Main {
		List<ArrayList<Integer>> list1 = new ArrayList<>();
		int k = 0;
		public static void main(String[] args) {
			Main a = new Main();
			System.out.println(a.solution());
		}
		public  int solution(){
			Deque<Node> deque = new ArrayDeque<>();
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			String s = sc.nextLine();
			ArrayList<Node> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				list.add(new Node(s.charAt(i)));
			}
			for (int i = 0; i < n - 1; i++) {
				Node a = list.get(sc.nextInt());
				Node b = list.get(sc.nextInt());
				a.arrayList.add(b);
			}
			deque.add(list.get(1));
			char a = 'R';
			char b = 'W';
			while (!deque.isEmpty()){

			}
			return 1;
		}


	}
