
public class TestaResultado {

	public static void main(String[] args) {
		int resultado;
		Recorde recordeMundial = new Recorde(TipoRecordeEnum.MUNDIAL);
		Recorde recordeOlimpico = new Recorde(TipoRecordeEnum.OLIMPICO);
		recordeMundial.valor = 95;
		recordeOlimpico.valor = 98;
		
		System.out.println(recordeMundial.obterResultado(97));
		System.out.println(recordeOlimpico.obterResultado(97));
		
		
		recordeMundial.valor = 10;
		recordeOlimpico.valor = 10;
		
		System.out.println(recordeMundial.obterResultado(10));
		System.out.println(recordeOlimpico.obterResultado(10));
		
		
		recordeMundial.valor = 80;
		recordeOlimpico.valor = 81;
		
		System.out.println(recordeMundial.obterResultado(78));
		System.out.println(recordeOlimpico.obterResultado(78));
	}

}
