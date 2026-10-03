import java.util.*;
public class secondLargest
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int largest=arr[arr.length-1];
		int slargest=Integer.MIN_VALUE;
		for(int i=arr.length-1;i>=0;i--){
		    if(arr[i]!=largest){
		        slargest=arr[i];
		        break;
		    }
		}
		System.out.println("second largest: "+slargest);
	}
}
