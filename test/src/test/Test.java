package test;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		ArrayList<Object> a  = new ArrayList<Object>();
		System.out.println(a.size());
		a.add(null);
		System.out.println(a.size());
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}

}
