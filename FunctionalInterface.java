package assignment.io;
interface Employee{
	int add(int a,int b);
}
class Addd implements Employee{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}
}
public class FunctionalInterface {

	

	public static void main(String[] args) {
		Addd vi=new Addd();
		int res=vi.add(10, 20);
		System.out.println(res);

	}

}
