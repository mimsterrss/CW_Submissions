//question one 
// create empty arrays that represent doubles, ints, booleans, string objects, and circle objects
double[] doubArr;

int[] intArr;

boolean[] boolArr;

String[] strArr;

Circle[] circArr;



//question two
//create an array of ints with the following represented values: 7, -12, 88, -88, 0, 5, 2000
int[] intArr = {7, -12, 88, -88, 0, 5, 2000};
System.out.print(intArr[intArr.length-1]);



//question three
//create an array of 5 strings objects with default values.
//state the default value for ints, booleans, doubles, and any reference data type as well

String fruitsArr = new String[5];
//the default value for ints and doubles is 0
//the default value for booleans false
//the default value for any refrence data type and strings is 'null'



//question four
//change the second element in fruitsArr to "Bapple"
fruitsArr[1] = "Bapple";



//question five
//change the last element in fruitsArr to "Zanana" 
//type it without typing the number 4, but accessing the arrays length
fruitsArr[fruitsArr.length-1] = "Zanana";



//question six
//print out the second element in fruitsArr
System.out.print(fruitsArr[1]);



//question seven
//create a loop that one by one prints put each element in fruitsArr
for (int i=0; i<=fruitsArr.length-1; i++){
  System.out.print(fruitsArr[i]);
}

