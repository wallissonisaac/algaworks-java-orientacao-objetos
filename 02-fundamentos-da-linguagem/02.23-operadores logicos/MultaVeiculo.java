import java.util.Scanner;

public class MultaVeiculo{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tipo de veiculo (passeio ou caminhao): ");
		String tipoVeiculo = entrada.nextLine();
		
		System.out.println("Velocidade maxima permitida na via: ");
		int velocidadeMaxima = entrada.nextInt();
		
		System.out.println("Velocidade do veiculo: ");
		int velocidadeVeiculo = entrada.nextInt();

		if(("passeio".equals(tipoVeiculo) && velocidadeVeiculo > velocidadeMaxima * 1.1) || ("caminhao".equals(tipoVeiculo) && velocidadeVeiculo > velocidadeMaxima * 1.05)){
			System.out.println("Voce foi multado!");			
		} else{
			System.out.println("Boa viagem!");
		}		
	}
}