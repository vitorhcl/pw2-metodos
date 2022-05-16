
public class Recorde {
	public int valor;
	public TipoRecordeEnum tipo;
	
	public Recorde(TipoRecordeEnum tipo) {
		this.tipo = tipo;
	}
	
	public String obterResultado(int resultado) {
		if(resultado < this.valor)
			return this.tipo.name();
		else
			return "*";
	}
}
