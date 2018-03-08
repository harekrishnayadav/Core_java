package program;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 7, 8, 8, 9, 14, 16, 16, 17, 17 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					System.out.println("duplicate:" + arr[j] + " ");
					System.out.println("i:" + arr[i] + " ");

				}

			}
		}
	}

}
