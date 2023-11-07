package assignment.io;
interface Prime{
	void isprime(int num);
}
public class FunctionalInterfacePrime {

	public static void main(String[] args) {
		Prime pno=(num)->{
			int count=0;
			for(int i=1;i<=num;i++) {
				if(num%i==0) count++;
			}
			if(count==2) System.out.println("true");
			else System.out.println("false");
		};
		pno.isprime(17);

	}

}
