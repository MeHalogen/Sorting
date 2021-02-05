import java.util.Scanner;

public class NewSort {
	
     void newSort(int[] array) {
	    for (int i = 1; i < array.length; i++) {
	        int current = array[i];
	        int j = i - 1;
	        while(j >= 0 && current < array[j]) {
	            array[j+1] = array[j];
	            j--;
	        }
	        // at this point we've exited, so j is either -1
	        // or it's at the first element where current >= a[j]
	        array[j+1] = current;
	    }
	}
     
     void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 

	public static void main(String[] args) {
System.out.println("WELCOME TO THE INSERTION SORT SIMULATOR!!!");
		
		int n;  //THE SIZE OF INPUT ARRAY
		Scanner sc=new Scanner(System.in); 
		
		System.out.print("Enter the number of elements in the array to be sorted ");  
		
		n=sc.nextInt();  //INPUT OF N
	 
		int[] arr = new int[n];  //ARRAY DECLARATION
		
		System.out.println("Enter the elements of the array: "); 
		
		for(int i=0; i<n; i++)  //ARRAY INPUT
		{  
			arr[i]=sc.nextInt();  
		} 
		
		NewSort s = new NewSort();  //CALLING OBJECT FOR BUBBLESORT FUNCTION

        s.newSort(arr); 	//CALLING FUNCTION
        System.out.println("Sorted array");  
        s.printArray(arr);     //CALLING PRINT ARRAY FUNCTION

	}

}
