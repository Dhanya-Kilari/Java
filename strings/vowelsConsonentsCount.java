import java.util.*;
public class vowelsConsonentsCount
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=s.toLowerCase();
		int vowels=0;
		int consonents=0;
		for(int i=0;i<s1.length();i++){
		    char ch=s1.charAt(i);
		    if(Character.isLetter(ch)){
		        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
		        vowels++;
		            
		        }
		        else{
		            consonents++; 
		            
		        }
		    }
		}
		System.out.println("no.of vowels: "+vowels);
		System.out.println("no.of consonents: "+consonents);
	}
}
