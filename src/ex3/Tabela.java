package ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Tabela {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");
				
		Optional<String> resultado =  lista.stream()
		.filter(e -> e.startsWith("W"))
		.findAny();

		String saida = resultado.isPresent() ? "Nomes com esta letra constam na lista" : "Nomes com esta letra não constam na lista";
		System.out.println(saida);
	}

}
