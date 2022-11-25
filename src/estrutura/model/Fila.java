package estrutura.model;

public class Fila {
	private int tamanho;
	private int qtdElementos;
	private String[] vetor;
	
	public Fila(int tamanho) {
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
			System.out.println("Fila cheia");
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
			vetor[0] = null;
			for (int i = 1; i < vetor.length ; i++) {
				vetor[i-1] = vetor[i];
				vetor[i] = null;
			}
			qtdElementos--;
		}
	}
	
	public void listarFila() {
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
