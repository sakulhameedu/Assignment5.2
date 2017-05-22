package Stack; //Abstact class
package FixedStack;  //Program of Fixed  stack
package VariableStack;//program for Variable stack
public class stackmain{
    
	public static void main(String args[]) 
	{
		FixedStack mystack1 = new FixedStack(5); // --->>> Fixed stack with 5
													// values
		FixedStack mystack2 = new FixedStack(8); // --->>> Fixed stack with 8
													// values

		// push some numbers onto the fixed mystack1
		for (int i = 0; i < 5; i++)
			mystack1.push(i);
		// push some numbers onto the fixed mystack2
		for (int i = 0; i < 8; i++)
			mystack2.push(i);

		// pop the numbers off the fixed mystack1
		System.out.println("Values in fixed stack mystack1:");
		for (int i = 0; i < 5; i++)
			System.out.println("mystack1[" + i + "]" + " : " + mystack1.pop());
		// pop the numbers off the fixed mystack2
		System.out.println("\nValues in fixed stack mystack2:");
		for (int i = 0; i < 8; i++)
			System.out.println("mystack2[" + i + "]" + " : " + mystack2.pop());

		// --->>>> Variable Stack
		System.out.println("\nValues in Variable stack s1");
		VariableStack varstack = new VariableStack(6);

		// push some (more than the fixed size) numbers onto the variable stack
		// varstack
		for (int i = 0; i < 15; i++)
			varstack.push(i);

		// pop the numbers off the variable stack varstack
		System.out.println("Variable Stack in varstack:");
		for (int i = 0; i < 15; i++)
			System.out.println("varstack[" + i + "]" + " : " + varstack.pop());
	}
}
