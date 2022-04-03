package scr;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in); 
//		 System.out.print("Input first : "); 
//		 double num1 = input.nextDouble(); 
//		 System.out.print("Input second : "); 
//		 double num2 = input.nextDouble(); 
//		 input.close(); 
//		  
//		 if (Math.abs(num1 - num2) <= 0.01) { 
//		     System.out.println("same."); 
//		 }
//		 else { 
//		     System.out.println("different."); 
//		 } 
//		    } 
//	}
//	
     
            int a[][] = {{2,3,4},{2,3,4},{3,6,7}};
            int b[][] = {{2,3,4},{2,3,4},{3,6,7}};
            int c[][] = new int [3][3];
            
            for(int i=0;i<3;i++){    
            	for(int j=0;j<3;j++){    
            	c[i][j]=a[i][j]+b[i][j];     
            	System.out.print(c[i][j]+" ");    
            	}    
            	System.out.println();
            	} 
            

}}
