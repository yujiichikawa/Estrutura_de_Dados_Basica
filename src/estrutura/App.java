package estrutura;

import estrutura.model.Pilha;

public class App {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha(5);
		
		System.out.println("___________Antes_________");
		System.out.println("###########Pilha############");
		
		System.out.printf("Quantidade de Elementos: %d\n", pilha.getQtdElementos());		
		System.out.printf("Está vazia: %b\n",pilha.estaVazio());
		System.out.printf("Está cheio: %b\n", pilha.estaCheio());
		System.out.printf("Tamanho: %d\n", pilha.getTamanho());

		System.out.println("-----------Lista-----------");
		
		pilha.listarPilha();

		System.out.println("###########Inseção##########");

		pilha.inserirElemento("Marcos");
		pilha.inserirElemento("Talita");
		pilha.inserirElemento("Jennifer");
		pilha.inserirElemento("Thiago");
		pilha.inserirElemento("Carlos");
		
		pilha.listarPilha();

		System.out.println("###########Remoção##########");
		
		pilha.removerElemento();
		pilha.removerElemento();
		
		pilha.listarPilha();
		
		System.out.println("___________Depois___________");
		System.out.println("###########Pilha############");
		
		System.out.printf("Quantidade de Elementos: %d\n", pilha.getQtdElementos());
		System.out.printf("Está vazia: %b\n",pilha.estaVazio());
		System.out.printf("Está cheio: %b\n", pilha.estaCheio());
		System.out.printf("Tamanho: %d\n", pilha.getTamanho());
				
		System.out.println("-----------Lista-----------");
		
		pilha.listarPilha();
		
		
	}
	
}
