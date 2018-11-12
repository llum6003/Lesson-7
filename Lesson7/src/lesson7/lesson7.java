package lesson7;

public class lesson7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nIf statement");
		int num=70;
	      if( num < 100 ){
		  /* This println statement will only execute,
		   * if the above condition is true
		   */
		  System.out.println("number is less than 100");
	      }
	      
	      //Nested if
	      System.out.println("\nNested If statement");
	      if( num < 100 ){ 
	           System.out.println("number is less than 100"); 
	           if(num > 50){
		      System.out.println("number is greater than 50");
		   }
		}
	      
	      //if - else
	      System.out.println("\nIf-Else statement");
	      num=120;
	      if( num < 50 ){
	    	  System.out.println("num is less than 50");
	      }
	      else {
	    	  System.out.println("num is greater than or equal 50");
	      }
	      
	      //if-else-if statment
	      System.out.println("\nIf-Else-If statement");
	      num=1234;
	      if(num <100 && num>=1) {
	    	  System.out.println("Its a two digit number");
	      }
	      else if(num <1000 && num>=100) {
	    	  System.out.println("Its a three digit number");
	      }
	      else if(num <10000 && num>=1000) {
	    	  System.out.println("Its a four digit number");
	      }
	      else if(num <100000 && num>=10000) {
	    	  System.out.println("Its a five digit number");			
	      }
	      else {
	    	  System.out.println("number is not between 1 & 99999");			
	      }

	}

}
