//task one: Instantiate a 2-D array gridNums that consists of 4 rows and 6 columns using the new keyword. 

int[][] gridNumsOne = new int[4][6];



//task two: Instantiate a 2-D array with the following values:

int[][] gridNumsTwo = {4, 5, 7}, 
                      {2, -1, 8}, 
                      {0, 1, 3};



//For the following problems, print out those elements before and after to verify it worked. 
//task three: For both of those arrays, change the element in the first row, first column to a 17.

gridnumsOne[0][0] = [17];
gridnumsTwo[0][0] = [17];



//task four: For both of those arrays, change the element in the second row, third column into a 20. 

gridNumsOne[1][2] = [20];
gridNumsTwo[1][2] = [20];



//task five: For both of those arrays, change the last element in the first row to a -5. Accomplish this using .length 

gridNumsOne[0][gridNumsOne[0].length-1] = [-5];
gridNumsTwo[0][gridNumsTwo[0].length-1] = [-5];



//task six: For both of those arrays, change the first element in the last row to a -7. Accomplish this using .length 

gridNumsOne[3][gridNumsOne[0].length-3] = -7;
gridNumsTwo[2][gridNumsTwo[0].length-1] = -7;



//task seven: For both of those arrays, change the last element in the last row to a -30. Accomplish this using .length 

gridNumsOne[3][gridNumsOne[0].length-1] = -30;
gridNumsTwo[2][gridNumsTwo[0].length-1] = -30;

  
  
//task eight: Create a method that is passed a 2-D array of ints and one by one prints out each element in the first row. 

	public static int[][] elementsInFirstRow(int[][] arr){
    
		//loop to go through the 2-D array
		for(int i=0; i<=arr[0].length-1; i++){
      
			//will print whatever element 'i' is currently on in the first row of the array
			System.out.println(arr[0][i]);
      
		}
		//return the array
		return arr;
    
	}



//task nine: Create a method that is passed a 2-D array of ints and one by one prints out each element in the first column.

	public static int[][] elementsInFirstColumn(int[][] arr){
    
		//loop to go through the 2-D array
		for(int i=0; i<=arr.length-1; i++){
      
			//prints whatever element 'i' is currently on in the first column of the array
			System.out.print(arr[i][0]);
      
		}
		//return the array
		return arr;
		
	}



//task ten: Create a method that is passed a 2-D array of ints and one by one prints out each element in row-major order. 

	public static int[][] elementsInRowMajorOrder(int[][] arr){
		
    //loop to go through the 2-D array
		for (int i=0; i<=arr[0].length-1; i++){
			
			//this for loop is for the rows & will continue to run as along as 'r' is less than or equal to arr.length - 1
			for(int r=0; r<=arr.length-1; r++){
        
				//prints whatever 'i' and 'r' are equal to
				System.out.println(arr[r][i]);
        
			}
      
		}
		//returns the array
		return arr;
    
	}
	


//task eleven: Create a method that is passed a 2-D array of ints and one by one prints out each element in column-major order. 

	public static int[][] elementsInColumnMajorOrder(int[][] arr){
    
		//loop to go through the 2-D array
		for(int i=0; i<=arr.length-1;i++){
      
			////this for loop is for the columns & will continue to run as along as 'r' is less than arr.length - 1
			for(int r=0;r<arr[0].length-1;r++){
        
				//prints whatever 'i' and 'r' are equal to
				System.out.println(arr[i][r]);
        
			}
      
		}
		//returns the array
		return arr;
    
	}


