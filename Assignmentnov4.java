package assignment.io;

public class Assignmentnov4 {
	static int res=1;
	static int fact(int n) {
		
		if(n==0) return 1;
		else return (res++)*fact(n-1);
	}

	public static void main(String[] args) {
		System.out.println("factorial number---->"+fact(7));
	}

}
