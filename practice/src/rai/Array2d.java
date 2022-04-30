package rai;
import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner input=new Scanner(System.in);
       System.out.println("enter row  size");
       int rowSize=input.nextInt();
       System.out.println("enter column size");
       int colSize=input.nextInt();
       int[][] a=new int[rowSize][colSize];
         //System.out.println(a[0].length);
        for(int i=0;i<a.length;i++) {
        	 
        	 for(int j=0;j<a.length;j++) {
        		a[i][j]=input.nextInt();
        	 }
         }
        
        for(int i=0;i<a.length;i++) {
       	 
       	 for(int j=0;j<a.length;j++) {
       		System.out.print(a[i][j]+" ");
       	 }
       	 System.out.println("");
        }

       
       
	}

}
