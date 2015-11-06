package lp;

import java.util.HashMap;

public class Hash_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> mapvar= new HashMap<Integer,String>();
		mapvar.put(101, "India");
		mapvar.put(null, "India");
		//mapvar.put(101, "USA");
		mapvar.put(102, "USA");
		mapvar.put(103, null);
		mapvar.put(104, "UK");
		
		System.out.println(mapvar.get(104));
		
		System.out.println(mapvar);
		
		for(Integer element:mapvar.keySet())
		{
			System.out.println(element +"--------"+mapvar.get(element));
		}

	}

}
