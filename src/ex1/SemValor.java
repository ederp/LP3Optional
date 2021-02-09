package ex1;

import java.util.Optional;

public class SemValor {

	public static void main(String[] args) {
		Integer i = null;
		Integer k = 7;
		
		//a) se o optional vazio obter a string usando orElse
		Integer saida = criaVariavel(i).orElse(2);
		System.out.println(saida);
		//a) se o optional a vazio obter a string usando orElseGet
		saida = criaVariavel(i).orElseGet(() -> 2);
		System.out.println(saida);
		//b) se o optional vazio obter a string usando orElse
		saida = criaVariavel(k).orElse(2);
		System.out.println(saida);
		//b) se o optional a vazio obter a string usando orElseGet
		saida = criaVariavel(k).orElseGet(() -> 2);
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
