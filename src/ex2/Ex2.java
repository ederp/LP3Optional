package ex2;

import java.util.Optional;

public class Ex2 {

	public static void main(String[] args) {
		Integer i = null, k = 1, saida;
		
		saida = criaVariavel(k).orElseThrow(() -> new NullPointerException("Valor vazio."));
		System.out.println(saida);
		saida = criaVariavel(i).orElseThrow(() -> new NullPointerException("Valor vazio."));
		System.out.println(saida);
	}
	
	public static Optional<Integer> criaVariavel(Integer variavel){
		try {
			return Optional.of(variavel);
		} catch (Exception e) {
			return Optional.empty();
		}
	}
}
