import java.util.*;
public class prefixsum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
	    int sum=0;
	    for(int i=0;i<arr.length;i++){
	        sum=sum+arr[i];
	        System.out.print(sum+" ");
	    }
	}
}
