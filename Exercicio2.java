package Classes;

public class Exercicio2 {

	public static void main(String[] args) {
		boolean boll = false;					// Variável para verificar se pertence ao fibonnaci
		int numero = 56, i = 0;					// Número a ser verificado e (i) de auxiliar
		while (!boll) {							// Verifica cada termo de fibonacci até ser igual ou maior que o número de verificação
			if (numero == fibonacci(i)) {
				boll = true;
			} else if(numero < fibonacci(i)) {
				break;
			}
			i++;
		}
		
		System.out.println((boll)? "Pertence a sequência de fibonacci" : "Não pertence a sequência de fibonacci");
		 
	}
	
	public static int fibonacci(int f) {		// Método para obter o termo de fibonacci
		int num;
		
		if(f <= 0) {
			num = 0;
		} else if(f == 1 || f==2) {
			num =  1;
		} else {
			num = fibonacci(f-1) + fibonacci(f-2);
		}
		
		return num;
	}

}
