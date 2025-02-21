//question one
//Instantiate an empty ArrayList that could have any type in it.

ArrayList<String> empty = new ArrayList<String>(); 



//quesiton two
//Instantiate an empty ArrayList called intArrList that specifically stores ints. Repeat this for Strings.

ArrayList<Integer> ints = new intArrayList<Integer>(); 
ArrayList<String> strings = new ArrayList<String>(); 



//question three
//Add 1, 2, and 3 to your intArrList one at a time so that its values are {1, 2, 3}. Then add elements to stringArrList so its values are {"Alice , "Bob" , "Charlie"}

ints.add(0, 1);
ints.add(1, 2);
ints.add(2, 3);
System.out.print(ints);

strings.add(0, "Alice");
strings.add(1, "Bob");
strings.add(2, "Charlie");
System.out.print(strings);



//question four
//Add 5 to your intArrList so that its values are now {1, 2, 5, 3}. Then add "Derek" to your stringArrList so its values are {"Alice" , "Derek" , "Bob" , "Charlie"}

ints.add(2, 5);
strings.add(1, "Dereck);



//question five
//Print out the second and last elements in both intArrList and stringArrList.

System.out.print(ints.get(1));
System.out.print(ints.get(ints.size()-1));

System.out.print(strings.get(1));
System.out.print(strings.get(strings.size()-1));



//question six
//Change the first element in intArrList to 0, and change the first element in stringArrList to "Zero". Print out the first element in each array before and after the change. 

System.out.print(ints.set(0, 0));
System.out.print(ints);

System.out.println(strings.set(0, "Zero"));
System.out.print(strings);



//question seven
//Delete the last element in both arrays. Print out what that removed element was. 

System.out.println(ints.remove(ints.size()-1));
System.out.print(ints);


System.out.println(strings.remove(strings.size()-1));
System.out.print(strings);

