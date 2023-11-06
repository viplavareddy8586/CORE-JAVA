package assignment.io;

public class Arrayfirstassignment {

	public static void main(String[] args) {
		//int [] arr= {22,4,19,17,1,29,5,2};
//		int t;
//		for(int i=0;i<arr.length;i++) {
//			
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					t=arr[i];
//					arr[i]=arr[j];
//					arr[j]=t;
//				}//if
//			}//for j
//		}//for i
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//     for(int i=arr.length-1;i>=0;i--) {
//    	 System.out.print(arr[i]+" ");
//     }
//		int t;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]<arr[j]) {
//					t=arr[i];
//					arr[i]=arr[j];
//					arr[j]=t;
//				}//if
//			}//j
//		}//i
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println("\n 6th smallest number"+arr[6-1]);
//		int [] arr= {22,2,19,2,17,1,29,5,2};
//		int noofoccurences=0;
//		int n=0;
//		for(int i=0;i<arr.length;i++) {
//			noofoccurences=0;
//			for(int j=0;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					noofoccurences++;
//				   n=arr[i];	
//				}//if
//			}//j
//		}//i
//		System.out.println("no of occurences"+noofoccurences+"value"+n);
		int [][] matrix1= {{11,22,33},
				           {4,5,6},
				           {7,8,9}};
		int [][] matrix2= {{3,2,1},
				           {6,5,4},
				           {9,8,7}};
		int[][]resmatrix=new int[3][3];
		for(int r=0;r<3;r++) {
			for(int c=0;c<3;c++) {
				resmatrix[r][c]=matrix1[r][c]+matrix2[r][c];
				System.out.print(resmatrix[r][c]+" ");
			}//columns
			System.out.println();
		}//for rows
		
	}

}
