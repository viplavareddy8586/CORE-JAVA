package assignment.io;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5,6,7,8,9,1,2,3};
		int[] m = new int[n.length];
		// remove duplicate elements
		//int[] n = {10,20,30,40,50};
		boolean isFound = false;
		int mIndex = 0;
		for(int i=0;i<n.length;i++) {
			isFound = false;
			for(int j=0;j<mIndex;j++) {// 0<1
				if(n[i] == m[j]) isFound = true;
			}// for m Array
			if(isFound == false ) {
				m[mIndex] = n[i];// m[0]=n[0]---m[0]=10,20
				mIndex++;
			}// if
			
		}// n array
		System.out.println("Original Array Elements----->");
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println("\n After removing Array Elements----->");
		for(int i=0;i<mIndex;i++) {
			System.out.print(m[i]+" ");
		}
		
	}

}
