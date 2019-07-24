package collectionspractice;

import java.util.HashSet;
import java.util.Set;

public class SetOfIntegers {
	public static void main(String[] args) {
		Set<Integer> myInt = new HashSet<Integer>();

		myInt.add(1);
		myInt.add(5);
		myInt.add(7);
		myInt.add(9);
		myInt.add(4);
		myInt.add(2);
		myInt.add(1);
		System.out.println(myInt);
	

		for (Integer i : myInt) {
			System.out.println(i);

		}

	}

}
