package swapno3rdvar;
/*
Swap Numbers Without Using Third Variable Java Example
This Swap Numbers Java Example shows how to
swap value of two numbers without using third variable using java.
*/


public class SwapElementsWithoutThirdVariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1 = 10;
         int num2 = 20;
        
         System.out.println("Before Swapping");
         System.out.println("Value of num1 is :" + num1);
         System.out.println("Value of num2 is :" +num2);
        
         //add both the numbers and assign it to first
         num1 = num1 + num2;
         num2 = num1 - num2;
         num1 = num1 - num2;
        
         System.out.println("Before Swapping");
         System.out.println("Value of num1 is :" + num1);
         System.out.println("Value of num2 is :" +num2);
 }
	}


