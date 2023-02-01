package Pojo;

class PojoTest
{
	private int practHrs = 9;
	private String result = "Job";
	
	public int getPractHrs()
	{
		return practHrs;
	}
	
	public String getResult()
	{
		return result;
		
	}

}





public class PojoDemo {	
public static void main(String[] args) {
	
	PojoTest test = new PojoTest();
	System.out.println(test.getPractHrs());
	System.out.println(test.getResult());
}

	
	
}

