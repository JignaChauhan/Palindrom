import java.util.Scanner;
public class Palimdrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x,number,y=0,temp;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Number here:");
      number=sc.nextInt();
      temp=number;
      while(number>0)
      {
    	  x=number%10;
    	  number=number/10;
    	  y=y*10+x;
      }
      if(temp==y) {
    	  System.out.println("Number is Palindrom:");
      }
    	  else {
    		  System.out.println("Number is not palindrom:");
    	  }
	}
		
	}
	


