package scr;

public class input {
	public static void main(String  arys[]) {
		
		String str ="the is java page";
		
		int count =1;
		
		
		for (int i=0;i<str.length()-1;i++)
		{
			
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))	
			
		
		{
		   count++;
		}
		
		}
		
           System.out.println("Number of string : " + count);
	
	
	}
	
	
	}

	


