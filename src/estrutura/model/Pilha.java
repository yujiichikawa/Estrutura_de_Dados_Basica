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
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i] == null) {
				vetor[i] = valor;
				break;
			}
		}
	}
	
	public void listarPilha() {
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i] != null) {
				System.out.println("- "+vetor[i]);
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
