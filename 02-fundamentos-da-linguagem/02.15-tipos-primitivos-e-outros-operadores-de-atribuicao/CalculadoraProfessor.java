public class CalculadoraProfessor {
	public static void main(String[] args){
		
		// constante do Pi - http://pt.wikipedia.org/wiki/Pi
		float pi = 3.14f;
		// raio - informado pelo professor
		float raio = 7.3f;
		// area eh igual ao raio ao quadrado multiplicado por Pi
		float area = (raio * raio) * pi;
		int areaSemCasasDecimais = (int) area ;
		
		System.out.println("A area do circulo informado eh: " + area);
		System.out.println("A area do circulo sem casas decimais eh: " + areaSemCasasDecimais);
	}
}