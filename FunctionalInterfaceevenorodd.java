package assignment.io;
interface Evenodd{
	boolean iseven(int num);
}

public class FunctionalInterfaceevenorodd {

	public static void main(String[] args) {
		Evenodd even=(num)->{
			if(num%2==0) return true;
			else return false;
		};
		boolean res=even.iseven(12);
		System.out.println(res);
	}

}
