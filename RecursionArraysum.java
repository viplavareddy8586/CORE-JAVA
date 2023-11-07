package assignment.io;

public class RecursionArraysum {
 static int arraysum(int[] n,int size) {
	 if(size==0) return n[0];
	 else return n[size]+arraysum(n,size-1);
	
 }
	public static void main(String[] args) {
		int[] n= {10,20,30,4,5,6,7,8,10};
		System.out.println(arraysum(n,n.length-1));
	}

}
