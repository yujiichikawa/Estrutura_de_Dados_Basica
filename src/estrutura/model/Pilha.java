package estrutura.model;

public class Pilha {
	private int tamanho;
	private int qtdElementos;
	private String[] vetor;
	
	public Pilha(int tamanho) {
		this.tamanho = tamanho;
		vetor = new String[tamanho];
		qtdElementos = 0;
	}
	
	public boolean estaVazio() {
		return (vetor[0] == null);
	}
	
	public boolean estaCheio() {
		return (vetor.length == qtdElementos);
	}
	
	public void inserirElemento(String valor) {
		if(estaCheio()) {
			System.out.println("Pilha cheia");
		}else {
			for(int i=0;i<tamanho;i++) {
				if(vetor[i] == null) {
					vetor[i] = valor;
					qtdElementos++;
					break;
				}
			}	
		}
		
	}
	
	public void removerElemento() {
		if(estaVazio()) {
			System.out.println("Lista Vazia");
		}else{
			for (int i = tamanho-1; i > 0 ; i--) {
				if(vetor[i] != null) {
					vetor[i] = null;
					qtdElementos--;
					break;
				}
			}
		}
	}
	
	public void listarPilha() {
		if(estaVazio()) {
			System.out.println("Lista Vazia");
		}else {
			for(int i=0;i<tamanho;i++) {
				if(vetor[i] != null) {
					System.out.println("- "+vetor[i]);
				}
			}	
		}
	}
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getQtdElementos() {
		return qtdElementos;
	}

	public void setQtdElementos(int qtdElementos) {
		this.qtdElementos = qtdElementos;
	}

	public String[] getVetor() {
		return vetor;
	}

	public void setVetor(String[] vetor) {
		this.vetor = vetor;
	}
	
}
