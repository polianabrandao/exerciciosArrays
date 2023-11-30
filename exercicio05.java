package loopings;
import java.util.Scanner;
public class exercicio05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[10], b = new int[10], c = new int[10], d = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			a[i] = input.nextInt();
		} 
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			b[i] = input.nextInt();
		} 
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			c[i] = input.nextInt();
		} 
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			d[i] = input.nextInt();
		} 
		
		
		
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}System.out.println(" ");
		for (int i = 0; i < 10; i++) {
			System.out.print(b[i] + " ");
		}System.out.println(" ");
		for (int i = 0; i < 10; i++) {
			System.out.print(c[i] + " ");
		}System.out.println(" ");
		for (int i = 0; i < 10; i++) {
			System.out.print(d[i] + " ");
		}System.out.println(" ");
		
		}
			
	}


