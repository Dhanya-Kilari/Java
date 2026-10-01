import java.util.*;
public class hollowtriangle
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n-i;j++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=2*i-1;j++){
		        if(i==n || j==1 || j==2*i-1){
		            System.out.print("*");
		        }
		        else{
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}
}
