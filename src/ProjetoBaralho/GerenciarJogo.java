package ProjetoBaralho;

public class GerenciarJogo {

	public static void main(String[] args) {
		//cria o objeto baralho
		Baralho baralho = new Baralho();
		
		//monta o objeto baralho, com 52 cartas
		baralho.montar();
		
		//embaralha o objeto baralho
		baralho.embaralhar();
		
		//exibe o objeto baralho
		baralho.exibir();
	}
}
