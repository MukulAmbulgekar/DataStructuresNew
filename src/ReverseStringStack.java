
public class ReverseStringStack {

	char [] rev_word;
	int array_size;
	int top=-1;
	public ReverseStringStack(int size){
		rev_word=new char[size];
		array_size=size;
	}
	
	public void push(char ch){
		if(isEmpty()){
		rev_word[++top]=ch;
		}
		
	}
	public char pop(){
		
		
			
			return rev_word[top--];
			
		
	}
	
	public boolean isEmpty(){
		if (top!=array_size-1){
			return true;
		}
		else{
			return false;
		}
		
		
	}
	
}
