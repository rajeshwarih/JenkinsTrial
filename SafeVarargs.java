
import java.util.ArrayList;
import java.util.List;

public class SafeVarargs {
	
	//Var args was introduced in java 1.5 and safe varargs was introduced in java7
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<String> list3 = new ArrayList<>();
		
		list1.add("hello");
		list2.add("hiiii");
		list3.add("byeeeeeeeeeeeeeeeeeeeee 4");
				
		print(list1,list2,list3);
		
	}

	@java.lang.SafeVarargs
	private static void print(List<String>... lists) {
		// TODO Auto-generated method stub
		
		for(List<String> list : lists) {
			System.out.println(list.get(0));
		}
		
	}
	
	

}
