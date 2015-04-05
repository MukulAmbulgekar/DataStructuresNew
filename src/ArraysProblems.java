import java.util.HashSet;

public class ArraysProblems {

	public boolean pairInSortedRotated(int[] a, int sum) {
		int array_length, left, right, max_element, max_index;
		array_length = a.length;
		max_element = a[0];
		max_index = 0;
		for (int i = 0; i < array_length; i++) {
			if (a[i] > max_element) {
				max_element = a[i];
				max_index = i;
			}
		}
		System.out.println("Max Element is:-" + max_element
				+ "Max element index is:-" + max_index);
		left = max_index + 1;
		right = max_index;

		while (left != right) {

			if (a[left] + a[right] == sum) {
				System.out.println("Left:-" + left + " Right:-" + right);
				System.out.println("Elements are" + a[left] + " " + a[right]);

				return true;
			} else if (a[left] + a[right] < sum) {
				System.out.println("Left:-" + left + " Right:-" + right);
				left = (left + 1) % array_length;
			} else if (a[left] + a[right] > sum) {
				System.out.println("Left:-" + left + " Right:-" + right);
				right = (array_length + right - 1) % array_length;
			}
		}
		System.out.println("Left:-" + left + " Right:-" + right);
		return false;

	}

	public boolean pairInSorted(int[] a, int sum) {
		int array_length, left, right;
		array_length = a.length;
		// max_element=a[0];
		// max_index=0;
		left = 0;
		right = array_length - 1;
		while (left != right) {
			if (a[left] + a[right] == sum) {
				System.out.println("Left:-" + left + " Right:-" + right);
				System.out.println("Elements are" + a[left] + " " + a[right]);

				return true;
			} else if (a[left] + a[right] < sum) {
				System.out.println("Left:-" + left + " Right:-" + right);
				left++;
			} else if (a[left] + a[right] > sum) {
				System.out.println("Left:-" + left + " Right:-" + right);
				right--;
			}
		}

		System.out.println("Left:-" + left + " Right:-" + right);
		return false;

	}

	public boolean checkDuplicatesWithinK(int a[], int k) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {

			j = i;

			while (j < k + i) {
				if (j < a.length - 1) {
					if (a[i] == a[j + 1]) {
						System.out
								.println("Duplicate within distance of 3 found O(n^2):-"
										+ a[i]);
						return true;
					}

				}
				j++;
			}
		}
		return false;
	}
	
	public int countOccurances(int a[],int number){
		int count=0;
		
		for (int i=0;i<a.length;i++){
			if(a[i]==number){
				count++;
			}
		}
			
			return count;
	}
	
	public int [] swapArrayElements(int a[]){
		int temp;
		for(int i=0;i<a.length;i+=2){
			
			if((i+1)<a.length){
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			}
		}
			
	for(int j: a){
		System.out.print(j+"\t");
		
	}
		return a;
	}
	
	public void printFirstRepeating(int arr[])
    {
        // Initialize index of first repeating element
        int min = -1;
 
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();
 
        // Traverse the input array from right to left
        for (int i=arr.length-1; i>=0; i--)
        {
            // If element is already in hash set, update min
            if (set.contains(arr[i]))
                min = i;
 
            else   // Else add element to hash set
                set.add(arr[i]);
        }
 
        // Print the result
        if (min != -1)
          System.out.println("The first repeating element is " + arr[min]);
        else
          System.out.println("There are no repeating elements");
    }

}
