package week1.day2;
import java.util.Arrays;

public class FindDups {
	

	public static void main(String[] args) {
		int A[]= {2,5,7,7,5,9,2,3};
		

	for(int i=0; i<A.length; i++) {
		for(int j=i+1;j<A.length;j++) {
			if(A[i]==A[j]) {
		System.out.println("array has duplicate value" +A[i]);

			}
		}
	}
	}
}
		
	
	
