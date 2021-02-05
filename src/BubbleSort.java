import java.util.Scanner; 
public class BubbleSort {
	
	//BUBBLE SORT FUNCTION
	//HERE, WE COMPARE THE CONSECUTIVE ELEMENTS OF THE ARRAY AND GET A SORTED ARRAY
	 void bubbleSort(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (arr[j] > arr[j+1]) 
	                { 
	                    int temp = arr[j]; 
	                    arr[j] = arr[j+1]; 
	                    arr[j+1] = temp; 
	                } 
	    } 
	 
	 //FUNCTION TO PRINT THE ARRAY
	 void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 

	 //MAIN METHOD
	public static void main(String[] args) {
		
		System.out.println("WELCOME TO THE BUBBLE SORT SIMULATOR!!!");
		
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
		
		BubbleSort ob = new BubbleSort();  //CALLING OBJECT FOR BUBBLESORT FUNCTION

        ob.bubbleSort(arr); 	//CALLING FUNCTION
        System.out.println("Sorted array");  
        ob.printArray(arr);     //CALLING PRINT ARRAY FUNCTION

	}

}
