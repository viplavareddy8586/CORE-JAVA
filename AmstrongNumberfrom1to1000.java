package assignment.io;

public class AmstrongNumberfrom1to1000 {
     static boolean isamstrong(int n) {
    	int r,sum=0;
    	int t=n;
    	while(n!=0) {
    		r=n%10;
    		n=n/10;
    		sum=sum+r*r*r;
    	}
    	if(t==sum) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	
	
	public static void main(String[] args) {
		
for(int i=1;i<=1000;i++) {
	if(isamstrong(i)==true) {
		System.out.print(i+" ");
	}
}
	}

}
