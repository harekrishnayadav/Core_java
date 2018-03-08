package program;

import java.util.ArrayList;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("A");
		arr.add("B");
		arr.add("A");
		arr.add("C");
		arr.add("D");
		arr.add("B");
		System.out.println("before remove:" + arr);
		String[] str = arr.toArray(new String[arr.size()]);
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j] && i != j) {
					System.out.println(str[j] + " ");

				}

			}

		}

	}

}
