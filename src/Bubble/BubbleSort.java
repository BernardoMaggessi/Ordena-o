package Bubble;

public class BubbleSort {
	public static void main(String[] args) {
		int[] vetor = new int[1000];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.println(vetor[i]);
		}
		long inicio = System.currentTimeMillis();
		long fim;
		int aux;
		for (int i = 0; i < vetor.length; i++) {// O(N)
			for (int j = i + 1; j < vetor.length; j++) {// O(N 1)
				if (vetor[i] > vetor[j]) {
					// se o [i] for maior que [j] eles trocaram de lugar para ordenar do menor para
					// o maior
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
			}
		}
		fim = System.currentTimeMillis();
		System.out.println("tempo:" + (fim - inicio));

		System.out.println("vetor ordenado:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}
