import java.text.NumberFormat;
import java.util.Scanner;

public class ChequeExtenso {

	public static void main(String[] args) {
		
		
		double valor = 0.0;
		String valorExtenso = "";
		boolean entreTrezeEDezenove = false;
		
		Scanner input = new Scanner(System.in);
		
		do {
			
			System.out.println("Insira um valor menor do que 1000.00:");
			valor = input.nextDouble();
			
		}while(valor <= 0 || valor >= 1000.0);
		
		
		if(valor >= 100.0) {
			
			if(valor >= 900.0) {
				
				valorExtenso += "NINE";
				valor -= 900.0;
				
			}else if(valor >= 800.0) {
				
				valorExtenso += "EIGHT";
				valor -= 800.0;
				
			}else if(valor >= 700.0) {
				
				valorExtenso += "SEVEN";
				valor -= 700.0;
				
			}else if(valor >= 600.0) {
				
				valorExtenso += "SIX";
				valor -= 600.0;
				
			}else if(valor >= 500.0) {
				
				valorExtenso += "FIVE";
				valor -= 500.0;
				
			}else if(valor >= 400.0) {
				
				valorExtenso += "FOUR";
				valor -= 400.0;
				
			}else if(valor >= 300.0) {
				
				valorExtenso += "THREE";
				valor -= 300.0;
				
			}else if(valor >= 200.0) {
				
				valorExtenso += "TWO";
				valor -= 200.0;
				
			}else if(valor >= 100.0) {
				
				valorExtenso += "ONE";
				valor -= 100.0;
				
			}
			
			valorExtenso += " hundred ";
			
		}
		
		if(valor >= 10.0) {
			
			if(valor >= 90.0) {
				
				valorExtenso += "NINETY";
				valor -= 90.0;
				
			}else if(valor >= 80.0) {
				
				valorExtenso += "EIGHTY";
				valor -= 80.0;
				
			}else if(valor >= 70.0) {
				
				valorExtenso += "SEVENTY";
				valor -= 70.0;
				
			}else if(valor >= 60.0) {
				
				valorExtenso += "SIXTY";
				valor -= 60.0;
				
			}else if(valor >= 50.0) {
				
				valorExtenso += "FIFTY";
				valor -= 50.0;
				
			}else if(valor >= 40.0) {
				
				valorExtenso += "FOURTY";
				valor -= 40.0;
				
			}else if(valor >= 30.0) {
				
				valorExtenso += "THIRTY";
				valor -= 30.0;
				
			}else if(valor >= 20.0) {
				
				valorExtenso += "TWENTY";
				valor -= 20.0;
				
			}else if(valor >= 19.0) {
				
				valorExtenso += "NINE";
				valor -= 19.0;
				
			}else if(valor >= 18.0) {
				
				valorExtenso += "EIGHT";
				valor -= 18.0;
				
			}else if(valor >= 17.0) {
				
				valorExtenso += "SEVEN";
				valor -= 17.0;
				
			}else if(valor >= 16.0) {
				
				valorExtenso += "SIX";
				valor -= 16.0;
				
			}else if(valor >= 15.0) {
				
				valorExtenso += "FIF";
				valor -= 15.0;
				
			}else if(valor >= 14.0) {
				
				valorExtenso += "FOUR";
				valor -= 14.0;
				
			}else if(valor >= 13.0) {
				
				valorExtenso += "THIRT";
				valor -= 13.0;
				
			}else if(valor >= 12.0) {
				
				valorExtenso += "TWELVE";
				valor -= 12.0;
				
			}else if(valor >= 11.0) {
				
				valorExtenso += "ELEVEN";
				valor -= 11.0;
				
			}else if(valor >= 10.0) {
				
				valorExtenso += "TEN";
				valor -= 10.0;
				
			}
			
			
			if(valor >= 10.0 && valor < 20.0) {
				
				entreTrezeEDezenove = true;
				
			}
			
		}
		
		if(entreTrezeEDezenove == true) {
			
			
			valorExtenso += "TEEN ";
			
		}else {
			
			valorExtenso += " ";
			
		}
		
		if((int) valor  != 0) {
			
			if((int) valor == 9) {
				
				valorExtenso += "NINE";
				valor -= 9.0;
				
			}else if((int) valor == 8) {
				
				valorExtenso += "EIGHT";
				valor -= 8.0;
				
			}else if((int) valor == 7) {
				
				valorExtenso += "SEVEN";
				valor -= 7.0;
				
			}else if((int) valor == 6) {
				
				valorExtenso += "SIX";
				valor -= 6.0;
				
			}else if((int) valor == 5) {
				
				valorExtenso += "FIVE";
				valor -= 5.0;
				
			}else if((int) valor == 4) {
				
				valorExtenso += "FOUR";
				valor -= 4.0;
				
			}else if((int) valor == 3) {
				
				valorExtenso += "THREE";
				valor -= 3.0;
				
			}else if((int) valor == 2) {
				
				valorExtenso += "TWO";
				valor -= 2.0;
				
			}else if((int) valor == 1) {
				
				valorExtenso += "ONE";
				valor -= 1.0;
				
			}
			
			valorExtenso += " and ";
			
		}
		
		valorExtenso += String.format("%.0f/100", valor*100);
		
		System.out.println(valorExtenso);
		
		
	}

}
