import java.util.*;
public class secondSmallest
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int smallest=arr[0];
		int ssmallest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]!=smallest){
		        ssmallest=arr[i];
		        break;
		    }
		}
		System.out.println("second smallest: "+ssmallest);
	}
}
