package ProjetoBaralho;
public class Carta {
	
	//atributos naipe e valor
	private Naipe naipe; 
	private Valor valor;
	
	//construtor de objeto carta, com valor e naipe da carta.
	public Carta(Valor valor, Naipe naipe) {
		this.naipe = naipe;
		this.valor = valor;
	}
	
	//método toString, devolvendo o valor da carta e o naipe
	public String toString () {
		return valor + " de " + naipe;
	}

	public Naipe getNaipe() {
		return this.naipe;
	}
	
	public Valor getValor() {
		return this.valor;
	}
	
	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	
	public void setValor(Valor valor) {
		this.valor = valor;
	}
	
	
}
