import java.util.Scanner;

public class DescobreAnoBissexto{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ano: ");
		//obtem entrada tipo int
		int ano = entrada.nextInt();
		
		if(ano % 400 == 0){
			System.out.println("O ano " + ano + " eh um ano bissexto.");
		} else if((ano % 4 == 0) && (ano % 100 != 0)){
			System.out.println("O ano " + ano + " eh um ano bissexto.");
		} else{
			System.out.println("O ano " + ano + " NAO eh um ano bissexto");
		}
	
	}
}