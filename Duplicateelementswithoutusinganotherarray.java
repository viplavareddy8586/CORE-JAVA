package assignment.io;

public class Duplicateelementswithoutusinganotherarray {

	public static void main(String[] args) {
		int[] n = {11,22,44,33,22,55,66,22,33,44,55};
		System.out.println("before removing duplicates------>");
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
		int size=n.length;
		for(int i=0;i<n.length;i++) {
			
			for(int j=i+1;j<size;j++) {
				if(n[i]==n[j]) {
					for(int k=j;k<size-1;k++) {
						n[k]=n[k+1];
					}//for k
					size=size-1;
					j--;
				}//if
			}//for j
		}//for i
		System.out.println("\n after removing duplicates------>");
		for(int i=0;i<size;i++) {
			System.out.print(n[i]+" ");
		}
	}
}
