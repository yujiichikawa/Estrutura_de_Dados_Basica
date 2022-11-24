package estrutura_basica;

public class App {

	public static void main(String[] args) {
		int[] vetor = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("-----------Antes--------------");
		listarVetor(vetor);
		System.out.println("-----------Depois--------------");
		removerVetor(1, vetor);
		removerVetor(2, vetor);
		removerVetor(3, vetor);
		removerVetor(4, vetor);
		removerVetor(5, vetor);
		listarVetor(vetor);
	}
	
	public static void removerVetor(int valor, int[] vetor) {
		boolean busca = false;
		for(int i=0;i<vetor.length-1;i++){
			if(vetor[i] == valor) {
				if(i != vetor.length) {
					for(int j=i;j<vetor.length-1;j++) {
						vetor[j] = vetor[j+1];
						vetor[j+1] = 0;
					}
					busca = true;
				}else {
					vetor[i] = 0;
					busca = true;
				}
				
			}
		}
		if(busca) {
			System.out.println("Elemento removido");
		}else {
			System.out.println("Elemento não encontrado");
		}
	}
	
	public static void listarVetor(int vetor[]) {
		for(int i=0;i<vetor.length;i++){
			System.out.println(vetor[i]);
		}
	}
}
