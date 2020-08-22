package collect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo2 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
	
		List list2 = new ArrayList<>();
			
		list.add(12);
		list.add(123);
		list.add(124);
		
		list2.add("hello");
		list2.add("ramesh");
		list2.add("java");
		
		
		list.addAll(list2);
		
		System.out.println(list);
		System.out.println(list.size());
		
		
		
	}
	
	
}
