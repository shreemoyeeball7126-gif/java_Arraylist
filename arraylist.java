package assingment;
import java.util.*;
public class next15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Mango");
		list.add("Coconut");
		System.out.println(list);
		list.add("Avacado");
		list.remove(0);
		System.out.println(list.size());
		System.out.println(list.contains("Mango"));
		System.out.println(list);

	}

}
