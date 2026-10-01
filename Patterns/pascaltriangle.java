import java.util.*;
public class pascaltriangle
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n-i;j++){
		        System.out.print(" ");
		    }
		    int a=1;
		    for(int j=1;j<=i;j++){
		        System.out.print(a+" ");
		        a=a*(i-j)/(j);
		    }
		    System.out.println();
		}
	}
}
