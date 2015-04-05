
public class StackMain {

	public static boolean pallindrome(String inputString){
		int k=inputString.length()-1;
		for (int j=0;j<inputString.length();j++)
		{
			if(inputString.charAt(j)!=inputString.charAt(k)){
				return false;
			}
			k--;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String inputString="lukumilayas";
char [] inputChar;
char [] reverseString;

int k;

inputChar=inputString.toCharArray();
reverseString=new char[inputChar.length];
ReverseStringStack revString=new ReverseStringStack(inputChar.length);

for (int i=0;i<inputChar.length;i++){
	revString.push(inputChar[i]);
	
}
for (int i=0;i<inputChar.length;i++){
	reverseString[i]=revString.pop();
	
}


k=inputString.length()-1;
System.out.println("String characters Pushed to stack");
System.out.println("Reversed String:-");
for (int i=0;i<reverseString.length;i++){
	System.out.print(reverseString[i]);
	
}

if(pallindrome(inputString)){
	System.out.println("\nPalindrome");
}else{
	System.out.println("\nnot a Palindrome");
}

System.out.println("\n*************************");

StackLinkedList stackList=new StackLinkedList();

stackList.inserNode(25);
stackList.inserNode(15);
stackList.inserNode(35);
stackList.inserNode(45);
stackList.inserNode(55);
stackList.inserNode(65);
stackList.inserNode(75);
stackList.inserNode(85);

stackList.displayList();
stackList.deleteNode();
stackList.deleteNode();
stackList.deleteNode();
stackList.displayList();

	}

}
