package lp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list_arr_learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lstvar= new ArrayList<String>();
		
		lstvar.add("banana");
		lstvar.add("apple");
		lstvar.add("mango");
		lstvar.add("apple");
		lstvar.add(1, "Hi");
		
//		for(String element:lstvar)
//		{
//			System.out.println(element);
//		}
		
		Iterator<String> itr = lstvar.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			itr.remove();
		}
		
		
	}

}
