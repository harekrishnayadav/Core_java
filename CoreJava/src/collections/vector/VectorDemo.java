package collections.vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector();
		for (int i = 0; i < 9; i++) {
			// v.addElement(new Integer(i * 10));
			// v.add(i);
			v.addElement(i);
		}
		System.out.println("Intial elements:" + v);
		v.remove(0);
		System.out.println("after remove:" + v);

	}

}
