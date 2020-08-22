package collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionAPI1 {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList();
		List list2 = new ArrayList();
		
		list.add(new Employee("ramesh", 101, 2000));
		list.add(new Employee("animesh", 102, 12000));
		list.add(new Employee("suresh", 103, 4000));
		
		
		list2.add(list);
		list2.addAll(list2);
		
		
		//new CollectionAPI1().listMethods(list);
		//new CollectionAPI1().listMethods(list);
		new CollectionAPI1().removeFromList(list);
	}
		
	public void searchEmployee_Salary(List<Employee> list)
	{
		// 1st step iterate the array
		
		// match the array with req
		
		// yes / no 
		
		
		// if found -> get index and break
		// if not found -> break with not found msg
		
		
		Iterator<Employee> itr = list.iterator();
		
		int searchSalary = 3500;
		List<Employee> foundList = new ArrayList<>();
		
		while(itr.hasNext())
		{
			
			Employee e = itr.next();
			if(e.getSalary()==searchSalary)
			{
				foundList.add(e);
			}
		}
		
		
		//---------------------
		
		
		
		
		
		
		
	}
	
	
	
	
	public void replaceEmployee(List<Employee> list,Employee newemployee,Employee oldEmployee)
	{
		
	}
	
	
	
	
	
	public void removeFromList(List<Employee> list)
	{
		// simple 
		/*
		 * System.out.println(list.size()); list.remove(0);// remove -> index
		 * System.out.println(list.size());
		 */
		
		// ====================
		Employee e = new Employee("suresh", 103, 4000);
		list.remove(e);
		System.out.println(" size of the List :- ");
		System.out.println(list.size());
		
		
	}
	
	public void listMethods(List list)
	{
		Object obj = list.get(2);
		if(obj instanceof Employee)
		{
			Employee e = (Employee)obj;
			System.out.println(e.getName());
		}
		

		
		
		
	}

	public void doIterations(List list)
	{
		// ---- using for each / enhance for loop ----
		/*
		 * for(Object obj:list) { if(obj instanceof Employee) { Employee e =
		 * (Employee)obj; System.out.println(e.getName()); }
		 * 
		 * }
		 */	
		// ------ old for loop
		
		/*
		 * Object arr[] = list.toArray();
		 * 
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 */
		
		// ---- Iterator ----------------
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
			System.out.println(obj);
			
		}//end itr
		
	
	}

}






