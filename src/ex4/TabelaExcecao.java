package ex4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TabelaExcecao {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick", "Ana Clara", "Pedro", "Alfredo");
		
		Optional<String> resultado =  lista.stream()
		.filter(e -> e.startsWith("W"))
		.findAny();
		
		resultado.orElseThrow(() -> new NullPointerException("Nomes com esta letra não constam na lista"));
	}
}
