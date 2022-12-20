package practicepckg;

import java.util.LinkedList;

public class linkedlistdemo {
	public static void main(String[] args) {
		
		LinkedList list =new LinkedList<>();
		list.add(10);
		list.add(8);
		list.add(17);
		list.add(14);
		list.add(16);
		
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.add(4, 20);
		System.out.println(list);
		
		
	}

}
