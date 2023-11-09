package assignment.io;

public class ConvertNumtoBinarynum {

	public static void main(String[] args) {
		int num=9;
		int r,bn=0;
		int p=1;
		while(num!=0) {
			r=num%2;//1//0//0
			num=num/2;//4//2//1
			bn=bn+r*p;//0+1*1//1+0*10//1+0*
			p=p*10;//10
		}
		System.out.println("binary number of 9 \n"+bn);

	}

}
