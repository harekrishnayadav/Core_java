package collections.sets.geeks;

public class RotationArrayTest {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		RotationArray rotatie = new RotationArray();
		rotatie.leftRoatation(arr, 2, 7);
		rotatie.printArray(arr, 7);

	}

}
