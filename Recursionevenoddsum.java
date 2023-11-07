package assignment.io;

public class Recursionevenoddsum {
	//evensum
//	static int fact(int n) {
//		if(n==1) return 0;
//		else {
//			if(n%2==0) return n+fact(n-1);
//			else return fact(n-1);
//		}
//	}
//
//	public static void main(String[] args) {
//		System.out.println(fact(10));
//	}

	static int fact(int n) {
		if(n==1) return 1;
		else {
			if(n%2==0) return fact(n-1);
			else return n+fact(n-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(fact(10));
	}
}
