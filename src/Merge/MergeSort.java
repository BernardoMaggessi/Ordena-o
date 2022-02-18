package Merge;

import java.util.Arrays;

//merge sort
//vau divindindo o vetor em partes e ordenando o vetor
public class MergeSort {

	void merge(int nums[], int left, int m, int right) {
		int n1 = m - left + 1;// parte esquerda
		int n2 = right - m;// parte direita

		int Left_part_arra[] = new int[n1];// vetor para os valores a esquerda
		int Right_part_arra[] = new int[n2];// para a direita

		for (int i = 0; i < n1; i++) {
			Left_part_arra[i] = nums[left + 1];// percorrendo o vetor á esquerda
		}
		for (int j = 0; j < n2; j++) {
			Right_part_arra[j] = nums[m + 1 + j];// o mesmo a direita
		}

		int i = 0, j = 0;

		int k = left;// começa da esquerda pra direita, ponteiro K
		while (i < n1 && j < n2) {
			if (Left_part_arra[i] <= Right_part_arra[j]) {
				// K vai andando pra direita
				nums[k] = Left_part_arra[i];
				i++;
			} else {// numero esquerdo já passou pelo meio

				nums[k] = Right_part_arra[j];
				j++;
			}
			while (i < n1) {
				nums[k] = Left_part_arra[i];
				i++;
				k++;
			}

			while (j < n2) {
				nums[k] = Right_part_arra[j];
				j++;
				k++;
			}

		}
	}

	void sort(int nums[], int left, int right) {
		if (left < right) {
			// find the middle point
			int m = (left + right) / 2;
			// sort a primeira metade
			sort(nums, left, m);
			// sort a segunda metade
			sort(nums, m + 1, right);
			// merge the sorted halves
			merge(nums, left, m, right);
		}
	}

	public static void main(String[] args) {
		MergeSort ob = new MergeSort();
		int nums[] = { 7, -5, 3, 2, 1, 0, 45 };
		System.out.println("original array:");
		System.out.println(Arrays.toString(nums));
		ob.sort(nums, 0, nums.length - 1);
		System.out.println("sorted array:");
		System.out.println(Arrays.toString(nums));
	}

}
