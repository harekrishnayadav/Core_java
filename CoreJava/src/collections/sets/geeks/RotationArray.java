package collections.sets.geeks;

public class RotationArray {

	void leftRoatation(int arr[], int d, int n) {
		int i;
		for (i = 0; i < d; i++)
			//System.out.println("before method:" + arr[i]);
		leftRotationOne(arr, n);
		System.out.println("arr:" + arr[i]+" "+n);
		

	}

	void leftRotationOne(int[] arr, int n) {
		int i;
		int temp = arr[0];
		for (i = 0; i < n - 1; i++)
			arr[i] = arr[i + 1];
		arr[i] = temp;

	}

	void printArray(int arr[], int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + "  ");

		}

	}

}
