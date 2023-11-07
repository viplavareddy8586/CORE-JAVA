package assignment.io;

interface employee{
	int add(int a,int b);
}
public class FunctinalInterface2 {

	public static void main(String[] args) {
		employee emp=(a,b)-> a+b;
		int res=emp.add(150, 850);
      System.out.println(res);
	}

}
