package Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class linhashset_learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> setvar= new LinkedHashSet<String>();
		
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
