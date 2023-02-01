package JavaAdvance;


class PojoTest1
{
	private int practHrs;
	//private String result;

	public void setPractHrs(int practHrs)
	{
		this.practHrs = practHrs;
	 
	}

	public int getPractHrs()
	{
		return practHrs;
	}

}

public class PojoDemo1 {
public static void main(String[] args) {

	PojoTest1 test1 = new PojoTest1();
	test1.setPractHrs(6);
	System.out.println(test1.getPractHrs());
}
}
