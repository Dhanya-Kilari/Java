import java.util.*;
public class firstHalfSumandSecondHalfSum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		int fsum=0;
		int ssum=0;
		for(int i=0;i<arr.length/2;i++){
		    fsum=fsum+arr[i];
		}
		for(int i=arr.length/2;i<arr.length;i++){
		    ssum=ssum+arr[i];
		}
		System.out.println("first half sum: "+fsum);
		System.out.println("Second half sum: "+ssum);
	}
}
