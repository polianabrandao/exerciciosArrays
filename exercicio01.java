package loopings;

public class exercicio01 {

	public static void main(String[] args) {
		int soma1 = 0, soma2 = 0;
		
		for (int x = 1; x <= 20; x++) {
			if (x %3 == 0) {
				soma1 = soma1 + x;
			}
			if (x %5 == 0) {
				soma2 = soma2 + x;
			}
		}System.out.println("A soma dos multiplos de 3 e igual a " + soma1);
		System.out.println("A soma dos multiplos de 5 e igual a " + soma2);
		int soma3 = soma1 + soma2;
		System.out.println("A soma dos multiplos de 3 e 5 e igual a " + soma3);

	}

}
