package array;

/*
2-D matrix:

 	 Column	Column Column
Row  [0][0] [0][1] [0][2]
Row  [1][0] [1][1] [1][2]
Row  [2][0] [2][1] [2][2]

*/

public class TwoDimension {

	public static void main(String args[]) {

		// declaring 2-D variable
		int arr[][]={
					 {1,2,3},
					 {4,5,6},
					 {7,8,9}
					 }; 

		//printing 2-D array 
		for(int i=0;i<3;i++) // outer for-loop represents "Row"
		{ 		
			for(int j=0;j<3;j++) // inner for-loop represents "Column"
			{  
				System.out.print(arr[i][j]+" "); // "print" - prints in a same line. 
			}  
			System.out.println();  // "println" - prints in a new line. 
		}  

	}
}

