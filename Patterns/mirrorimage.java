import java.util.*;
public class mirrorimage
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=1;j<i;j++){
		        System.out.print(" ");
		    }
		    for(int j=i;j<=n;j++){
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
		for(int i=n;i>1;i--){
		    for(int j=1;j<i-1;j++){
		        System.out.print(" ");
		    }
		    for(int j=i-1;j<=n;j++){
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
	}
}
