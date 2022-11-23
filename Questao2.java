package avaliacaoED;

import java.util.Scanner;

public class Questao2 {
	
	
	static double calcularPrecoUnitario( double sPreco, double sPesos) {
		double soma = sPreco / (sPesos / 1000);
		return soma;
	}
	static double calcularMenorBarato(double preco[]) {
		double menorPreco = preco[0];

		for (int i = 0; i < preco.length; i++) {
			if (preco[i] < menorPreco) 
				menorPreco = preco[i];
			
		}return menorPreco;
	}
	
	static double calcularTotal(double pp[]) {
		double somaTotal = 0;
		for (int i = 0; i < pp.length; i++) {
			somaTotal += pp[i];
		}
		return somaTotal;
	}

	static int menorPosicao(double preco[]) {
		double menor = preco[0];
		int menorPosicao=0;
		for (int i=0; i<  preco.length; i++){
			if (preco[i] < menor){
				menorPosicao = i+1;
			}
		}
		return menorPosicao;
	}
	

	public static void main(String[] args) {
		
		    Scanner e = new Scanner(System.in);

		    System.out.print("Informe o total de doces comprados: ");
		    int doces = e.nextInt();

		    double[] preco = new double[doces];
		    double[] pesos = new double[doces];
		    double[] pu = new double[doces];
		    double somaPeso=0, somaPrecos=0;

		    for (int i=0; i<doces; i++){
		      System.out.println("\nDoce " + (i+1) + ":");
		      System.out.print("Informe o Peso (g): ");
		      somaPeso = e.nextDouble();
		      pesos[i] = somaPeso;
		      System.out.print("Informe o Preço (R$): ");
		      somaPrecos = e.nextDouble();  
		      preco[i]= somaPrecos;
		      
		      double calcularValorUnitario = calcularPrecoUnitario(somaPrecos, somaPeso);
		      pu[i] = calcularValorUnitario;
		      
		      System.out.printf("Preço unitário calculado = R$%.2f/Kg", calcularValorUnitario );
		    }
		    
		    int posicaoMenor = menorPosicao(pu);
		    double menorPreco = calcularMenorBarato(pu);
		    double valorTotal = calcularTotal(preco);
		    double pesoTotal = calcularTotal(pesos);
		   		   
		    System.out.printf("\n\nProduto mais barato: Doce %d, R$%.2f/kg", posicaoMenor, menorPreco);
		    System.out.printf("\nForam comprados %.0fg de doce por R$%.2f", pesoTotal, valorTotal);
		   
		    e.close();
		  }

	}


