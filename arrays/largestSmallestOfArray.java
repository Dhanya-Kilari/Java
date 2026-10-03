import java.util.*;
public class largestSmallestOfArray
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++){
		    if(largest<arr[i]){
		        largest=arr[i];
		    }
		    if(smallest>arr[i]){
		        smallest=arr[i];
		    }
		}
		System.out.println("largest: "+largest);
		System.out.println("smallest: "+smallest);
		
	}
}
