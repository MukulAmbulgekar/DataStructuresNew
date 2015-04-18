import java.util.Iterator;


public class ArraysMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] inputArray={7,8,9,0,1,2,3,4,5,6};  // Sorted Rotated Array
		int [] inputArray1={0,1,2,3,4,5,6,7,8,9};  // Sorted Rotated Array
		int [] inputArray2={4, 2, 1, 3, 4, 1};  
		int [] inputArray3={5,5,5,4,4,3,2,1};
		
		System.out.println("Rotated Array");
		ArraysProblems a=new ArraysProblems();
		if(a.pairInSortedRotated(inputArray,18)){
		System.out.println("Pair with given sum found");	
		}else{
			
			System.out.println("Pair with given sum not found");
		}
		
		
		System.out.println("Sorted Array");
		if(a.pairInSorted(inputArray1,18)){
			System.out.println("Pair with given sum found");	
			}else{
				
				System.out.println("Pair with given sum not found");
			}
		System.out.println("Duplicate element at a distance K");
		if(a.checkDuplicatesWithinK(inputArray2,3)){
			System.out.println("True");
			}else{
				
				System.out.println("False");
			}
		System.out.println("Swapped elements of array:-");
	a.swapArrayElements(inputArray1);
	
	System.out.println("\nNumber of occurances for 1:-"+a.countOccurances(inputArray2, 1));
	a.printFirstRepeating(inputArray2);
	Iterator<Integer> i=a.removeDuplicates(inputArray2).iterator();
	System.out.println("\nUnique Elements in array using ArrayList");
	while(i.hasNext()){
		System.out.print(i.next()+"\t");
	}
	a.removeDuplicates1(inputArray3);
	}
	

}
