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
