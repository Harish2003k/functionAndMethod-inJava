import java.util.*;
public class CountingNumber {
	public static void main(String args[]) {
		int countP=0,countN=0,countZ=0,i;
		int [] arr=new int [10];
		System.out.println("Enter the 10 number :");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<10;i++) { // input the number 
			arr[i]=sc.nextInt();
		}
		for(i=0;i<10;i++) { // checking condition
			if(arr[i]<0) {
				countN++;
			}
			else if(arr[i]>0){
				countP++;
				
			}else {
				countZ++;
			}
		}
		System.out.println("total number of negative number is:"+countN);
		System.out.println("total number of postive number is:"+countP);
		System.out.println("total number of zero number is:"+countZ);
	}

}
