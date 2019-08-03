package collectionspractice;

import java.util.Vector;

public class MyVector {
	public static void main(String[] args) {
		Vector v = new Vector(3, 2);
		v.add(12);
		v.add("nepal");
		v.add(23.667);

		System.out.println(v.size());
		System.out.println(v.capacity());

		v.add("java");

		System.out.println(v.size());
		System.out.println(v.capacity());

		v.addElement(8);
		v.addElement("sharat");

		System.out.println(v);

		System.out.println(v.contains(8));
		System.out.println(v.elementAt(1));
		System.out.println(v.firstElement());
		System.out.println(v.get(5));
		System.out.println(v.hashCode());
		System.out.println(v.indexOf("java"));
		System.out.println(v.indexOf(8, 1));
		System.out.println(v.lastElement());
		System.out.println(v.isEmpty());
		System.out.println(v.lastIndexOf(8));
		System.out.println(v.remove(3));
		System.out.println(v);
		System.out.println(v.remove("nepal"));
		System.out.println(v.set(0, "start"));
		System.out.println(v);
		System.out.println(v.toString());
		System.out.println(v.clone());
		System.out.println(v);
		System.out.println(v.elements());
		System.out.println(v.getClass());
		// v.clear();
		System.out.println(v);
		v.setSize(3);

	}

}
