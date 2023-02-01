package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
public static void main(String[] args) {
	//List list = new List();// Its not possible because List is an interface and not class
	//List list = new ArrayList();\
	ArrayList al = new ArrayList();
	al.add(456);
	al.add("java");
	al.add(456.456);
	al.add("java");
	al.add(null);
	al.add(456);
	al.add(456.456);
	al.add(0, "selenium");
	Object obj = al.get(0);
	System.out.println(obj);
	
	
	System.out.println(al);
	
	
	
	
}
}
