import java.util.*;
public class vowelsConsonents
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=s.toLowerCase();
		String vowels="";
		String consonents="";
		for(int i=0;i<s1.length();i++){
		    char ch=s1.charAt(i);
		    if(Character.isLetter(ch)){
		        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
		        vowels=vowels+ch;
		            
		        }
		        else{
		            consonents=consonents+ch; 
		            
		        }
		    }
		}
		System.out.println("vowels: "+vowels);
		System.out.println("consonents: "+consonents);
	}
}
