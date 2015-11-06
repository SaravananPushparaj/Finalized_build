package lp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet_learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> setvar= new HashSet<String>();
		
		setvar.add("banana");
		setvar.add("apple");
		setvar.add("mango");
		setvar.add("apple");
		
		
//		for(String element:setvar)
//		{
//			System.out.println(element);
//		}
//		

		Iterator<String> itr = setvar.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
