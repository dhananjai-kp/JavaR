package JavaConstructor;

public class Average {
	int a,b,c,d;
	static int averageMethod(int i,int j ,int k, int l) {
		int avg;
		avg = (i+j+k+l)/4;
		return avg;
	}
	public static void main(String[] args) {
		Average t1 = new Average();
		System.out.println(t1.averageMethod(10,20,30,40));
	
}
	
}