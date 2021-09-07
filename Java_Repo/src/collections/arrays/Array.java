package collections.arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		//Declaration
		//1. dataType arrayName[] = new dataType[sizeOfArray];
		//2. dataType[] arrayName = new dataType[sizeOfArray];
		int array1[] = new int[10];
		
		//Declaring array as a literal
		int array2[] = new int[] {1,2,3,4,5};
		
		//length of array
		System.out.println(array2.length);
		
		//2D arrays
		int array3[][] = new int[2][2];
		
		//Declaring 2D array as a literal
		int array4[][] = new int[][] {{1,2,3}, {3,4,5}};
		for(int i=0;i<array4.length;i++) {
			for(int j=0;j<array4[0].length;j++) {
				System.out.print(array4[i][j] + " ");
			}
			System.out.println("");
		}
		
		//passing arrays to a function
		System.out.println(sum(array2));
		
		//receiving an array from a function
		int array5[] = passAnArray();
		for(int i=0;i<array5.length;i++) {
			System.out.print(array5[i] + " ");
		}
		
		//sort an array
		Arrays.sort(array2);
		
		//fill an array
		int arrayTemp[] = new int[5];
		Arrays.fill(arrayTemp, -1);
		
		//apply binary search
		int arrayTemp2[] = new int[] {1,3,5,6,8,10};
		int searchIndex = Arrays.binarySearch(arrayTemp2, 5);
		
		//slice an array 
		Arrays.copyOfRange(array2, 0, 3); // {1,2,3}
	}
	
	private static int sum(int array[]) {
		int sum = 0;
		for(int i=0;i<array.length;i++) {
			sum += array[i];
		}
		
		return sum;
	}
	
	private static int[] passAnArray() {
		int array[] = new int[] {1,2,3};
		
		return array;
	}

}
