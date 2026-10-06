import java.util.*;
public class fibanocci
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=n;i++){
		    int next=a+b;
		    System.out.print(next+" ");
		    a=b;
		    b=next;
		}
	}
}
