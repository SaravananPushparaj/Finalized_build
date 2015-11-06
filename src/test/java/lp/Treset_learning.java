package lp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treset_learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> setvar= new TreeSet<String>();
		
		setvar.add("banana");
		setvar.add("apple");
		setvar.add("mango");
		setvar.add("apple");
		setvar.add("200");
		
//		for(String element:setvar)
//		{
//			System.out.println(element);
//		}
		
		Iterator<String> itr = setvar.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
