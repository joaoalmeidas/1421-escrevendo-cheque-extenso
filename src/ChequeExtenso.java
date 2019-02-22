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
			
		}while(valor <= 0 || valor >= 1000.0);
		
		
		if(valor > 99.0) {
			
			if(valor > 899.0) {
				
				valorExtenso += "NINE";
				
			}else if(valor > 799.0) {
				
				valorExtenso += "EIGHT";
				
			}else if(valor > 699.0) {
				
				valorExtenso += "SEVEN";
				
			}else if(valor > 599.0) {
				
				valorExtenso += "SIX";
				
			}else if(valor > 499.0) {
				
				valorExtenso += "FIVE";
				
			}else if(valor > 399.0) {
				
				valorExtenso += "FOUR";
				
			}else if(valor > 299.0) {
				
				valorExtenso += "THREE";
				
			}else if(valor > 199.0) {
				
				valorExtenso += "TWO";
				
			}else if(valor > 99.0) {
				
				valorExtenso += "ONE";
				
			}
			
			valorExtenso = " hundred";
			
		}
		
		
	}

}
