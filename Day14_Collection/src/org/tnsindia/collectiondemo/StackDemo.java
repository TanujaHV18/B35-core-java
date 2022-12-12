package org.tnsindia.collectiondemo;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>obj=new Stack<>();
		//insertion
		obj.push("Thanu");
		obj.push("Anu");
		obj.push("Deepu");
		obj.push("Anku");
		System.out.println(obj);
		//remove-LIFO
		obj.pop();
		System.out.println(obj);


	}

}
