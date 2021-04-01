package ProjetoBaralho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {

	//criando uma lista de carta
	private static List<Carta> baralho = new ArrayList<Carta>();

	//monta a lista de cartas, usando os enum de valor e naipe
	public void montar() {
		for (Valor valor : Valor.values()) {
			for (Naipe naipe : Naipe.values()) {
				//adiciona uma carta ao baralho
				baralho.add(new Carta(valor, naipe));
			}
		}
	}

	//embaralha a lista usando o método shuffle da classe Collections
	public void embaralhar() {
		Collections.shuffle(baralho);
	}

	//exibe o baralho embaralhado
	public void exibir() {
		for (int i = 0; i<baralho.size(); i++) {
			System.out.println(baralho.get(i).toString());
		}
	}
	
}
