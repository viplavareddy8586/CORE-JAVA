package assignment.io;

public class replace1with0and0with1binary {

	public static void main(String[] args) {
		
		///Given an unsigned integer, swap all 0 bits with 1 bitsand 1 bit to 0.
		//For example, 
		 //if the given number is 23 (10111),
		 // then 1000---8
		
		int num=23,r,p=1,bn=0,p2=1,res=0;
		while(num!=0) {
			r=num%2;
			num=num/2;
			if(r==0)r=1;
			else if(r==1)r=0;
			res=res+r*p2;
			bn=bn+r*p;
			p=p*10;
			p2=p2*2;
		}
		System.out.println("binary number for result number ---->"+bn);
       System.out.println("Result number --->"+res);
	}

}
