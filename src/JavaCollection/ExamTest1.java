package JavaCollection;

import java.util.HashSet;
import java.util.Set;

public class ExamTest1 {
public static void main(String[] args) {
	String[] str = {"java","java","selenium","selenium"};
	
	Set set = new HashSet();
	
	for (String str1 :str)
	{
		set.add(str1);
	}
	
	System.out.println(set);
}
}
