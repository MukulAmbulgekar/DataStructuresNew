public class StackMain {

	public static boolean pallindrome(String inputString) {
		int k = inputString.length() - 1;
		for (int j = 0; j < inputString.length(); j++) {
			if (inputString.charAt(j) != inputString.charAt(k)) {
				return false;
			}
			k--;
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "lukumilayas";
		char[] inputChar;
		char[] reverseString;

		int k;

		inputChar = inputString.toCharArray();
		reverseString = new char[inputChar.length];
		ReverseStringStack revString = new ReverseStringStack(inputChar.length);

		for (int i = 0; i < inputChar.length; i++) {
			revString.push(inputChar[i]);

		}
		for (int i = 0; i < inputChar.length; i++) {
			reverseString[i] = revString.pop();

		}

		k = inputString.length() - 1;
		System.out.println("String characters Pushed to stack");
		System.out.println("Reversed String:-");
		for (int i = 0; i < reverseString.length; i++) {
			System.out.print(reverseString[i]);

		}

		if (pallindrome(inputString)) {
			System.out.println("\nPalindrome");
		} else {
			System.out.println("\nnot a Palindrome");
		}

		System.out.println("\n*************************");

		StackLinkedList stackList = new StackLinkedList();

		stackList.Push(25);
		stackList.Push(15);
		stackList.Push(35);
		stackList.Push(45);
		stackList.Push(55);
		stackList.Push(65);
		stackList.Push(75);
		stackList.Push(85);

		stackList.displayList();
		stackList.Pop();
		stackList.Pop();
		stackList.Pop();
		stackList.displayList();

		StackArray st = new StackArray(3);
		st.push(25);
		st.push(15);
		st.push(5);
		st.push(55);
		st.displayStack();

		System.out.println("Popped Element is:-" + st.pop());
		System.out.println("Popped Element is:-" + st.pop());
		System.out.println("Popped Element is:-" + st.pop());

	}

}
