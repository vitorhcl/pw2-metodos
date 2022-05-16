public class TestaAtleta {
	public static void main(String[] args) {
		Atleta neymar = new Atleta();
		neymar.altura = 1.74;
		neymar.peso = 68;
		System.out.println("IMC: " + neymar.obterImc());
		System.out.println("Situação: " + neymar.classificar());
		System.out.println("Risco: " + neymar.obterRisco());
	}
}
