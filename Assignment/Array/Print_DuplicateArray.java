public class Print_DuplicateArray {
	static void showArray() {
		// declare, initilize
		int arr1[] = { 9, 8, 9, 6, 4, 2, 8, 5, 4, 2 };
		
		// print
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					System.out.println(arr1[j] + " ");
				}
			}
		}

	}

	public static void main(String[] args) {
		showArray();

	}

}