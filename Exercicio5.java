package Classes;

public class Exercicio5 {

	public static void main(String[] args) {
		String palavra = "sibirila";
		System.out.println(inverte(palavra));
	}
	
	public static String inverte(String palavra) {
		String aux = "";
		for(int i = palavra.length()-1; i > -1; i--) {
			aux += palavra.charAt(i);
		}
		return aux;
	}

}
