package JavaAdvance;

public class ArrayDemo {
public static void main(String[] args) {

/*  1-D Array
 	String[] str = new String[10];
	str[0] = "java";
	str[1] = "seleninm";
	str[2] = "hardwork";
	str[3] = "job";
	str[4] = "education";
	str[9] = "hello";

	
	for(int i = 0; i<str.length; i++)
	{
		System.out.println(str[i]);
	}
	
	int[] i = new int[6];
	i[0] = 456;
	i[1] = 91456;
	
	
	String[] str1 = {"hello", "java", "selenium","practice", "hardwork"};
	
	for (int i1= 0; i1 < str1.length; i1++ );
	{
		System.out.println(str1[i1]);
	}
	

  
 */
	
/* // 2-D Array
	
	String[][] str = new String[2][3];
	str[0][0] = "Hello";
	str[0][1] = "java";
	str[1][0] = "selenium";
	str[1][1] = "job";
	
	for (int i = 0; i<str.length; i++ )
	{
		for (intj = 0; j<str.length; j++)
		{
			System.out.println(str[i][j]);
		}
	}
 */

	// object Array
	Object[] obj = new Object[6];
	obj[0] = 456;
	obj[1] = "hello";
	obj[2] = 456.456;
	obj[3] = 'a';
	obj[4] = 91456;
	
	for (int i =0; i< obj.length; i++)
	{
		System.out.println(obj[i]);
	}
	
	
}
}
