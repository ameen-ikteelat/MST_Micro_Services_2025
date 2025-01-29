package set;

import java.util.HashSet;
//the order is determined by the hash codes of the elements and the internal structure of the underlying hash table.
//When you add an element to a HashSet, the hashCode() method of the element is called to obtain a hash code.
//The hash code is an integer that represents the object in a way that should minimize collisions (different objects producing the same hash code). 
//The HashSet then uses this hash code to determine where to store the element in its internal data structure.
public class Hashsets {
	public static void main(String[] args) {
        // Create a empty hash set
		HashSet<String> hashset = new HashSet<String>();
  // use add() method to add values in the hash set
         hashset.add("Red");
         hashset.add("Green");
         hashset.add("Black");
         hashset.add("White");
         hashset.add("Pink");
         hashset.add("Yellow");
   System.out.println("Original Hash Set: " + hashset);
   System.out.println("Size of the Hash Set: " + hashset.size());
  }
}
