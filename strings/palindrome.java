import java.util.*;
public class palindrome
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String rev="";
		for(int i=0;i<s.length();i++){
		    rev=s.charAt(i)+rev;
		}
		if(s.equals(rev)){
		    System.out.println("palindrome");
		}
		else{
		    System.out.println("not a palindrome");
		}
	}
}
