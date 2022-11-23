package avaliacaoED;

import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] vC = new int[N];
		int[] vM = new int[N];
		int[] vmaiorM = new int[N];

		int maior = vC[0], contador = 0;

		for (int i = 0; i < N; i++) {

			vC[i] = sc.nextInt();
			vM[i] = sc.nextInt();

		}
		for (int i = 0; i < N; i++) {
			if (vM[i] > maior) {
				maior = vM[i];

			}
		}
		System.out.println("Aluno(s) com maior(es) nota(s): ");
		for (int i = 0; i < N; i++) {
			if (vM[i] == maior) {
				vmaiorM[i] = i;
				
				contador++;
			}
			if (vmaiorM[i] != 0) {
				System.out.println(vC[i]);

			}

		}
		System.out.println("Quantidade de premiados: " + contador);
		sc.close();

	}

}
