package Day2;

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
		
//		for(String element:lstvar)
//		{
//			System.out.println(element);
//		}
		
		Iterator<String> itr = lstvar.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
