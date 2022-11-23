package avaliacaoED;
import java.util.Scanner;

public class Questao3 {

	static int calcularLeds(String digitos) {
		char[] leds = digitos.toCharArray();
		String sequencia = "0123456789";
		int retorno = 0;
		for (int i = 0; i < leds.length; i++) {
			if (leds[i] == sequencia.charAt(0)) {
				retorno += 6;
			}
			if (leds[i] == sequencia.charAt(1)) {
				retorno += 2;
			}
			if (leds[i] == sequencia.charAt(2)) {
				retorno += 5;
			}
			if (leds[i] == sequencia.charAt(3)) {
				retorno += 5;
			}
			if (leds[i] == sequencia.charAt(4)) {
				retorno += 4;
			}
			if (leds[i] == sequencia.charAt(5)) {
				retorno += 5;
			}
			if (leds[i] == sequencia.charAt(6)) {
				retorno += 6;
			}
			if (leds[i] == sequencia.charAt(7)) {
				retorno += 3;
			}
			if (leds[i] == sequencia.charAt(8)) {
				retorno += 7;
			}
			if (leds[i] == sequencia.charAt(9)) {
				retorno += 6;
			}

		}
		return retorno;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas repetições deseja realizar:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Exemplo " + (i + 1) + ":\nInforme os numeros do painel que quer montar: ");
			String numero = sc.next();

			System.out.print("Quantidades de leds necessários: " + calcularLeds(numero) + "\n");

		}
		sc.close();
	}
}
