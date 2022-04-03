package javaproblems;

import java.util.Scanner;

public class java_p_Vowelorconsonant_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r=new Scanner(System.in);
		System.out.println("Enter a character");
		char a=r.next().charAt(0);
		
		
		switch(a)
		{ 
		 case 'a':
		 case 'A':	 
		 case 'E':
		 case 'e':
		 case 'I':
		 case 'i':
		 case 'O':
		 case 'o':
		 case 'U':
		 case 'u':
			 System.out.println(a+" is a vowel");
			 break;
		 default:
			 if(a>='A'&&a<='Z'||a>='a'&&a<='z')
			 {
			 	System.out.println(a+" is a consonant");
			 }
			 else
			 { 
				 System.out.println(a+" is not an alphabet");
			 }
				 
			 break;
		}
	}

}
