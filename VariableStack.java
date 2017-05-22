public class VariableStack implements Stack {
	private int stck[];
	private int ptr; //--->>> points to the top of the stack

	public VariableStack(int size) {
		// TODO Auto-generated constructor stub
		stck = new int[5]; //--->>> Initiates the size of the variable stack in the constructor
		ptr = -1;
	}

	// Push an item onto the stack
	// Override the push method of the Interface	
	//Override
	public void push(int I) {
		// TODO Auto-generated method stub
		// Check if the stack is full. Accordingly extend the stack
		if (ptr == stck.length - 1) // use length member
		{
			System.out.println("Stack is full. Extending Stack.");
			increaseSize(I); //--->>> Call increasestack method to extend the stack
		} else
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

	//Increase the length of the stack by adding 1 size more
	public void increaseSize(int I) {
		//define a temp stack with 1 extra size that of the current size of the variable stack 
		int[] temp = new int[stck.length + 1];
		
		//copy the current variable stack into the temp stack. Thus the temp stack will have the top element empty
		for (int i = 0; i < stck.length; i++) {
			temp[i] = stck[i];
		}
		// replace the current variable stack with the temp stack
		stck = temp; 
		//push the new element in the extended variable stack.
		stck[++ptr] = I;
	}

}
