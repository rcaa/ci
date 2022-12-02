package algoritmos;



public class SelectionSort {

	public static void main(String args[]) {
		int quantidade = 10000;
		int[] vetor = new int[quantidade];

		System.out.println("Vetor desordenado: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
			System.out.print(i + " ");
		}

		sort(vetor);

		System.out.println("\nVetor ordenado: ");
		for (int i : vetor) {
			System.out.print(i + " ");
		}
	}

	static void sort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int iMin = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[iMin])
					iMin = j;
			if (i != iMin) {
				int temp = arr[i];
				arr[i] = arr[iMin];
				arr[iMin] = temp;
			}
		}
	}
}
