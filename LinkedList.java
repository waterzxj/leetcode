package com.water.leetcode;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author water
 * 
 * @date 2015-7-27
 */
public class LinkedList {
	public static class Node {
		int value;
		Node next;

		public Node(int n) {
			this.value = n;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Node head = null;
		if (in.hasNextInt()) {
			head = new Node(in.nextInt());
		}
		Node temp = head;
		while (in.hasNext()) {
			temp.next = new Node(in.nextInt());
			temp = temp.next;
			if(in.nextInt()==9){
              break;
			}
		}
		in.close();
		Stack<Node> nodes = new Stack<Node>();
		
	}
}
