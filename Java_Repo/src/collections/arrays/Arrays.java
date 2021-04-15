package collections.arrays;

public class Arrays {

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
