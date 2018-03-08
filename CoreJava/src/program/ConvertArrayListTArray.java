package program;

import java.util.ArrayList;
import java.util.Stack;

public class ConvertArrayListTArray {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("A");
		arr.add("B");
		arr.add("D");
		arr.add("E");
		arr.add("F");
		System.out.println("Before Convert:" + arr);
		String[] str = arr.toArray(new String[arr.size()]);
		for (String string : str) {
			System.out.println("stirng:" + string);

		}

	}

}
