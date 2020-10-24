package vendedores;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import template.Vendedor;

public class Principal {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
														
			Vendedor[] vendedoresarray = new Vendedor[10];//Use apenas numeros pares.
			ManipulaVendedor manipulador = new ManipulaVendedor();
			int opcao = -1;
			Vendedor vendedorNovo = null;
			int posicao;
			
		
			System.out.println(
					"\n É preciso fornecer dados correspondentes a : " 
					+ vendedoresarray.length + " vendedores. "
					);
			
			for (int i = 0; i < (vendedoresarray.length / 2); i++) {
				vendedoresarray[i] = new VendedorLoja();
				System.out.println("\n---- Vendedor Loja " + (i + 1) + "° ---- \n");
				System.out.println("\n Forneca um nome: ");
				vendedoresarray[i].setNome(input.nextLine());

				System.out.println("\n Forneca um valor para comissao: ");
				vendedoresarray[i].setComissao(input.nextDouble());
				input.nextLine();

				System.out.println("\n Forneca um valor para vendas: ");
				vendedoresarray[i].setVendas(input.nextDouble());
				input.nextLine();

				System.out.println("\n Forneca um valor para salario: ");
				((VendedorLoja) vendedoresarray[i]).setSalario(input.nextDouble());
				input.nextLine();

				System.out.println("\n Forneca um valor para horas extras: ");
				((VendedorLoja) vendedoresarray[i]).setHoraExtra(input.nextDouble());
				input.nextLine();

			}

			for (int i = (int) (vendedoresarray.length / 2); i < (vendedoresarray.length); i++) {
				vendedoresarray[i] = new VendedorExterno();
				System.out.println("\n---- Vendedor Externo " + (i + 1) + "° ---- \n");
				System.out.println("\n Forneca um nome: ");
				vendedoresarray[i].setNome(input.nextLine());

				System.out.println("\n Forneca um valor para comissao: ");
				vendedoresarray[i].setComissao(input.nextDouble());
				input.nextLine();

				System.out.println("\n Forneca um valor para vendas: ");
				vendedoresarray[i].setVendas(input.nextDouble());
				input.nextLine();

				System.out.println("\n Forneca um valor para ajuda de custo: ");
				((VendedorExterno) vendedoresarray[i]).setAjudaCusto(input.nextDouble());
				input.nextLine();

			}
			
			Arrays.sort(vendedoresarray);
			System.out.println("\n --- Lista de Vendedores ---");
			manipulador.listarVendedores(vendedoresarray);
			System.out.println("\n");
			
			do {

				System.out.println("\n Digite uma opção: \n" + " 1 para criar vendedor loja \n "
						+ " 2 para criar vendedor externo. \n");
				opcao = input.nextInt();
				input.nextLine();
				if (opcao != 1 || opcao != 2) {
					if (opcao == 1) {
						vendedorNovo = new VendedorLoja();
						System.out.println("\n---- Vendedor Loja: ---- ");
						System.out.println("\n Forneca um nome: ");
						vendedorNovo.setNome(input.nextLine());

						System.out.println("\n Forneca um valor para comissao: ");
						vendedorNovo.setComissao(input.nextDouble());
						input.nextLine();

						System.out.println("\n Forneca um valor para vendas: ");
						vendedorNovo.setVendas(input.nextDouble());
						input.nextLine();

						System.out.println("\n Forneca um valor para salario: ");
						((VendedorLoja) vendedorNovo).setSalario(input.nextDouble());
						input.nextLine();

						System.out.println("\n Forneca um valor para horas extras: ");
						((VendedorLoja) vendedorNovo).setHoraExtra(input.nextDouble());
						input.nextLine();

					} else if (opcao == 2) {
						vendedorNovo = new VendedorExterno();
						System.out.println("\n---- Vendedor Externo: ---- ");
						System.out.println("\n Forneca um nome: ");
						vendedorNovo.setNome(input.nextLine());

						System.out.println("\n Forneca um valor para comissao: ");
						vendedorNovo.setComissao(input.nextDouble());
						input.nextLine();

						System.out.println("\n Forneca um valor para vendas: ");
						vendedorNovo.setVendas(input.nextDouble());
						input.nextLine();

						System.out.println("\n Forneca um valor para ajuda de  custo: ");
						((VendedorExterno) vendedorNovo).setAjudaCusto(input.nextDouble());
						input.nextLine();
					}

					
					System.out.println("\n Localizar funcionário na lista de vendedores : ");
					posicao = manipulador.LocalizaVendedor(vendedorNovo, vendedoresarray);
					if (posicao != -1) {
						System.out.println("\n --- Encontrado ---");
						System.out.println("\n Posição: " + posicao + "\n ");
					} else {
						System.out.println("\n Não encontrado.");
					}
				}
			} while (opcao != 1 || opcao != 2);

		} catch (InputMismatchException e) {
			System.out.println("\n Ocorreu uma falha na entrada de dados. Por favor execute o programa novamente.\n");
		} catch (Exception e) {
			System.out.println("\n Ocorreu uma falha no programa. Por favor execute o programa novamente.\n"
					+ "\n Falha ocorrida: \n  " + e.getMessage());
		}
	}
}
