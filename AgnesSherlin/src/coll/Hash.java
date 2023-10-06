package coll;
import java.util.HashSet;
import java.util.Set;

public class Hash {

	

	    public static void main(String[] args) {
	        // Create three sets
	        Set<Integer> set1 = new HashSet<>();
	        Set<Integer> set2 = new HashSet<>();
	        Set<Integer> set3 = new HashSet<>();

	        // Add elements to the sets
	        set1.add(5);
	        set1.add(6);
	        set1.add(7);

	        set2.add(7);
	        set2.add(8);
	        set2.add(9);

	        set3.add(1);
	        set3.add(2);
	        set3.add(3);

	       
	        Set<Integer> differenceResult = new HashSet<>(set1);
	        differenceResult.removeAll(set2);

	     
	        Set<Integer> intersectionResult = new HashSet<>(set1);
	        intersectionResult.retainAll(set2);

	        
	        Set<Integer> unionResult = new HashSet<>(set1);
	        unionResult.addAll(set3);

	      
	        System.out.println("Set 1: " + set1);
	        System.out.println("Set 2: " + set2);
	        System.out.println("Set 3: " + set3);

	        System.out.println("Set Difference is " + differenceResult);
	        System.out.println("Set Intersection is " + intersectionResult);
	        System.out.println("Set Union is  " + unionResult);
	    }
	}

