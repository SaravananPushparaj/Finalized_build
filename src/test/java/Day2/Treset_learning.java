package Day2;

import java.util.HashSet;
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
		
		for(String element:setvar)
		{
			System.out.println(element);
		}
		


	}

}
