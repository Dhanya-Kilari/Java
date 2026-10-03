import java.util.*;
public class arrayReverse
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		int start=0;
		int end=arr.length-1;
		while(start<end){
		    int temp=arr[start];
		    arr[start]=arr[end];
		    arr[end]=temp;
		    start++;
		    end--;
		}
		System.out.print(Arrays.toString(arr));
	}
}
