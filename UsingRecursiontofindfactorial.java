package assignment.io;

public class UsingRecursiontofindfactorial {
	 /*static int factorial(int n) {
		 if(n==1) return 1;
		 else return n*factorial(n-1);
	 }
	

	public static void main(String[] args) {
	   int n=5;
		
		System.out.println(" factorail number---->"+factorial(n));
	}
	*/ 
	static int fact(int n) {
		int res=1;
		for(int i=1;i<=n;i++) {
			res=res*i;
		}
		return res;
	}
	public static void main(String[] args) {
      int n=5;
      System.out.println("factorial number---->"+fact(n));
}
}
