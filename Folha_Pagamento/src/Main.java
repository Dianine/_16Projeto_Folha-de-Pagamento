import java.util.Locale;
import java.util.Scanner;

		public class Main {

		  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  Locale.setDefault(Locale.US);
		  
		 
		  double A = 0.075;
		  double B = 0.09;
		  double C = 0.12; 
		  double D = 0.14;
		  double R, SB, Total;
		  int TS = 5;
		  double TH = 5.5;
		  
		  System.out.println (" xxxxxxxx FOLHA DE PAGAMENTO xxxxxxxx");
		  System.out.println (" xxxxxxxx Versão: 1.2 xxxxxxxx");
		  System.out.println ();
		  System.out.println ("Matriculas dos Funcionários Cadastrados: ");
		  System.out.println ("001");
		  System.out.println ("002");
		  System.out.println ("003");
		  System.out.println ("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		  System.out.println ();
		  System.out.print("Digite a Matrícula do Funcionário: ");
		  int ID = sc.nextInt();
		  System.out.print("Funcionário: ");
		  
		  if (ID == 001) {
		    System.out.print ("Maria L N C");  
		    }
		  else if (ID == 002) {
		    System.out.print ("Pedro C B S");
		  }
		  else {
		    System.out.print("José M B B");
		  }
		  System.out.println ();
		  System.out.println();
		  System.out.println("xxxxxxxx INFORME OS DADOS ABAIXO xxxxxxxx");
		  System.out.println ();
		  System.out.print("Quantidade de Horas Trabalhadas (DIÁRIAS): ");
		  double THD = sc.nextInt();
		  THD = THD * TS * TH;
		  System.out.print("Valor da Hora Trabalhada R$: ");
		  double ValorH = sc.nextDouble();
		  System.out.println ();
		  System.out.println ("xxxxxxxxCALCULOSxxxxxxxx");
		  System.out.println ();
		  SB = THD * ValorH;
		  
		  System.out.println("Salário Bruto R$: " + SB);
		  
		  if (SB <= 1100.00) {
		    R = SB * A;
		  }
		  else if (SB <= 2203.48){
		    R = SB * B;
		  }
		  
		  else if (SB <= 3305.22){
		    R = SB * C;
		  }
		  
		  else {
		    R = SB * D;
		  }
		  
		  Total = SB - R;
		  
		  
		  System.out.printf("(-) Desconto INSS R$: %.2f%n", R);
		  System.out.printf("= Salário R$: %.2f%n", Total);
		  
		  
		  
		  sc.close();
		   
		  }
	}


