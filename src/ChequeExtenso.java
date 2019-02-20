import java.text.NumberFormat;
import java.util.Scanner;

public class ChequeExtenso {

	public static void main(String[] args) {
		
		
		double valor = 0;
		String valorExtenso = "";
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		Scanner input = new Scanner(System.in);
		
		do {
			
			System.out.println("Insira um valor menor do que 1000.00:");
			valor = input.nextDouble();
			
		}while(valor <= 0 || valor > 1000.0);

		
		
	}

}
