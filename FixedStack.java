import java.util.Scanner;

public class FixedStack implements Stack {
//	private static Scanner s;
	private int stck[];
	private int ptr; //--->>> points to the top of the stack

	// allocate and initialize stack
	public FixedStack(int size) {
		// TODO Auto-generated constructor stub
		stck = new int[size];
		ptr = -1;
	}

	// Push an item onto the stack
	// Override the push method of the Interface
	//Override
	public void push(int I) {
		// TODO Auto-generated method stub
		if (ptr == stck.length - 1) // use length member
			System.out.println("Stack is full.");
		else
			stck[++ptr] = I;
	}

	// Pop an item from the stack
	// Override the pop method of the Interface
	//Override
	public int pop() {
		// TODO Auto-generated method stub

		if (ptr < 0) {
			System.out.println("Stack underflow.");
			return 0;
		} else
			return stck[ptr--];
	}
}
