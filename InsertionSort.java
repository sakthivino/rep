import java.util.*;

public class InsertionSort {
	void sort(int array[], int size) {
		for(int i = 1; i < size; i++) {
			int  key = array[i];
			int j = i - 1;
			while(j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

	void printArray(int array[], int size) {
			for(int i = 0; i < size; i++) {
				System.out.print(array[i] + " ");
			}
	}

	public static void main(String[] args) {
		InsertionSort object = new InsertionSort();
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		object.sort(array, size);
		object.printArray(array, size);
	}

}
