import java.util.*;
public class XpowerOfN {
public static void main(String args[]) {
	System.out.println("Enter the x:");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	System.out.println("Enter the n:");
	
	int n=sc.nextInt();
	int result=1;
	while(n!=0) {
		result=result*x;
	n--;
	}

	System.out.println("X to the power of N is:"+result);
}
}
