package Quick;

public class QuickSort {

	public static void main(String[] args) {

		int vetor[] = new int[8];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
		}
		System.out.println("Desordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

		quicksort(vetor, 0, vetor.length - 1);

		System.out.println("\nOrdenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}

	}

	// quick sort ordena o vetor por partes
	static void quicksort(int[] vetor, int esquerda, int direita) {
		if (esquerda < direita) {
			int p = particao(vetor, esquerda, direita);
			quicksort(vetor, esquerda, p);
			quicksort(vetor, p + 1, direita);
		}
	}

	// parti��o � uma parte do c�digo para ser ordenado
	static int particao(int[] vetor, int esquerda, int direita) {
		// pivot vai ser sempre o elemento do meio
		int meio = (int) (esquerda + direita) / 2;
		int pivot = vetor[meio];
		int i = esquerda - 1;
		int j = direita + 1;
		while (true) {
			do {
				i++;
			} while (vetor[i] < pivot);
			do {
				j--;
			} while (vetor[j] > pivot);
			if (i >= j) {
				return j;
			}
			int aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = aux;
		}
	}
}
