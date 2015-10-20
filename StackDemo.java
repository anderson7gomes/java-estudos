import java.util.EmptyStackException;
import java.util.Stack;

class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 1; i <= 5; i++) {
			stack.push(i);
		}

		System.out.println("Pushed: " + stack);

		while (!stack.empty()) {
			System.out.println("Popped: " + 
					stack.pop());
		}

		try {
			stack.pop();
		} catch (EmptyStackException e) {
			e.printStackTrace();
		}

	} // end main method

} // end StackDemo class