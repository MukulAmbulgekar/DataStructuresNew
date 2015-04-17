
public class StackArray {
	int stack_size;
	int stackArray[];
	int top;
	public StackArray(int size){
		stackArray=new int[size];
		stack_size=size;
		top=-1;
	}
	public boolean isFull(){
		if(top==stack_size-1){
			return true;
		}
		else{
			return false;
		}
	}
	public void push(int element){
		if(!isFull()){
			stackArray[++top]=element;
			System.out.println("Pushed:-"+element);
		}
		else{
			System.out.println("Stack is Full");
		}
		
	}
	
	public int pop(){
		if(top==-1){
			System.out.println("Stack is Empty");
			return -1;
		}
		else{
			return stackArray[top--];
		}
		
	}
	public void displayStack(){
		for (int i=0;i<stackArray.length;i++){
			System.out.println(stackArray[i]);
		}
	}

}
