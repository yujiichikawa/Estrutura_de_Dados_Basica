package estrutura;

import estrutura.model.Pilha;

public class App {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha(5);
		
		System.out.println("###########Pilha############");
		
		System.out.printf("Está vazia: %b\n",pilha.estaVazio());
		System.out.printf("Está cheio: %b\n", pilha.estaCheio());
		System.out.printf("Tamanho: %d\n", pilha.getTamanho());
		
		System.out.println("-----------Lista-----------");
		
		pilha.listarPilha();
		
		
	}
	
}
