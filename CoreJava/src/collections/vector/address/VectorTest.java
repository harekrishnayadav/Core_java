package collections.vector.address;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		Vector v = new Vector(3);

		System.out.println("Initial capacity And Size of Vector:");
		System.out.println("Capacity:" + v.capacity());
		System.out.println("Size:" + v.size());
		Customer c1 = new Customer("Sujeet", 29, new Address("2-3-102/1", "Punichok", "Patna", "9984079300"));

		Customer c2 = new Customer("Suman", 39, new Address("2-3-102/ 5", "Punichok", "Patna", "9984079300"));
		Customer c3 = new Customer("Anoj", 20, new Address("2-3-102/2", "Mandduru", "Patna", "9097507789"));
		Customer c4 = new Customer("Ravi", 9, new Address("2-3-102/3", "sr nager", "Patna", "998407909"));
		//System.out.println("C1:" + c1);
		v.add(c1);
		System.out.println("V:" + v);
		System.out.println("size:" + v.size());
	}

}
