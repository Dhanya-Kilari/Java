import java.util.*;
public class evenSumCountAvg
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]%2==0){
		        sum=sum+arr[i];
		        count++;
		    }
		}
		int avg=sum/count;
		System.out.println("sum "+sum);
		System.out.println("count "+count);
		System.out.println("avg "+avg);
	}
}
