import java.util.*;

public class MergeSort {

	static void mergeSort(int array[], int first_index, int middle_index, int last_index) {
		int temp_array_size1 = middle_index - first_index + 1;
		int temp_array_size2 = last_index - middle_index;
		int temp_array1[] = new int[temp_array_size1];
		int temp_array2[] = new int[temp_array_size2];
		int k = first_index;
		for (int i = 0; i < temp_array_size1; i++) {
			temp_array1[i] = array[first_index + i];
		}
		for (int i = 0; i < temp_array_size2; i++) {
			temp_array2[i] = array[middle_index + i + 1];
		}
		int i = 0, j = 0;
		while (i < temp_array_size1 && j < temp_array_size2) {
			if (temp_array1[i] <= temp_array2[j]) {
				array[k] = temp_array1[i];
				i++;
			} else {
				array[k] = temp_array2[j];
				j++;
			}
			k++;
		}
		while (i < temp_array_size1) {
			array[k] = temp_array1[i++];
		}
		while (j < temp_array_size2) {
			array[k] = temp_array2[j++];
		}

	}

	 void sort(int array[], int first_index, int last_index) {
		if (first_index < last_index) {
			int middle_index = first_index + (last_index - first_index)  / 2;
			sort(array, first_index, middle_index);
			sort(array, middle_index + 1, last_index);
			mergeSort(array, first_index, middle_index, last_index);
		}

	}

	void printArray(int array[], int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		MergeSort object = new MergeSort();
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		object.sort(array, 0, size - 1);
		object.printArray(array, size);
	}

}
