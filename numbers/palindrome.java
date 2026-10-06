import java.util.*;
public class palindrome
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(n>0){
		    int digit=n%10;
		    rev=rev*10+digit;
		    n=n/10;
		}
		if(rev==temp){
		    System.out.println("palindrome");
		}
		else{
		    System.out.println("not a palindrome");
		}
	}
}
