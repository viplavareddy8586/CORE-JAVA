package assignment.io;

public class Nov10first {

	public static void main(String[] args) {
//		1>For a given array of integers (positive and negative) 
//		 find the largest sum of a contiguous sequence
//		{10,20,-3,5,0,1,-11,55,-77}---
//		// 10+20+5+1+55-91
//		 * -3-11-77--91
//		 * 0
//		 * 77
//		 */
     int arr[]={100,2,3,-5,-9,10};
     int jsize=arr.length;
     int eachsum=0;
     int maxsum=0;
     for(int i=0;i<arr.length;i++) {
    	 jsize=arr.length;
    	 
    	 while(jsize!=i) {
    		 System.out.println("");
    		 eachsum=0;
    	 for(int j=i;j<jsize;j++) {
    		 eachsum=eachsum+arr[j];
    		 System.out.print(arr[j]+",");
    	 }
    	 if(eachsum>maxsum) {
    		 maxsum=eachsum;
    	 }
    	 System.out.print("maxsum------>"+maxsum);
    	 jsize--;
     }
     }
     System.out.println("\n resultant max value--->"+maxsum);
	}
}
//100,2,3,-5,-9,10,maxsum------>101
//100,2,3,-5,-9,maxsum------>101
//100,2,3,-5,maxsum------>101
//100,2,3,maxsum------>105
//100,2,maxsum------>105
//100,maxsum------>105
//2,3,-5,-9,10,maxsum------>105
//2,3,-5,-9,maxsum------>105
//2,3,-5,maxsum------>105
//2,3,maxsum------>105
//2,maxsum------>105
//3,-5,-9,10,maxsum------>105
//3,-5,-9,maxsum------>105
//3,-5,maxsum------>105
//3,maxsum------>105
//-5,-9,10,maxsum------>105
//-5,-9,maxsum------>105
//-5,maxsum------>105
//-9,10,maxsum------>105
//-9,maxsum------>105
//10,maxsum------>105
// resultant max value--->105