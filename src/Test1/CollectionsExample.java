package Test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> mylist = new ArrayList<String>();
		
		mylist.add("Sangee");
		mylist.add("Piri");
		mylist.add("Paaru");
		mylist.add("Daksh");
		
		System.out.println("Before Sorting");
		System.out.println(mylist);

		Collections.sort(mylist);	
		
		System.out.println("After Sorting");
		System.out.println(mylist);
		
		Collections.sort(mylist,Collections.reverseOrder()); 
		
		System.out.println("After Ascending Order");
		System.out.println(mylist);
		
		
		Stack<String> mystack = new Stack<String>();
		
		mystack.push("Sangee");
		mystack.push("not a");
		mystack.pop();
		mystack.push("good girl");
		
		System.out.println(mystack);
		
	}

}
