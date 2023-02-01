package JavaAdvance;

class EncapsulationTest1
{
	int practHrs = 9;
	String result = "Job";

	public void hello() {
		System.out.println(practHrs+"  "+result);
		
	}
}
public class EncapsulationDemo1 {
public static void main(String[] args) {
	
	EncapsulationTest1 test = new EncapsulationTest1();
	System.out.println(test.practHrs);
	System.out.println(test.result);
	test.hello();
	
	test.practHrs = 0;
	test.result = "Zero";
	test.hello();

}

}
