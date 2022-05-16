
public class Atleta {
	double altura;
	double peso;
	
	public double obterImc() {
		return this.peso / (this.altura * this.altura);
	}
	
	public String classificar() {
		double imc = this.obterImc();
		if(imc < 18.5)
			return "Abaixo do peso";
		else if(imc < 25)
			return "Peso normal";
		else if(imc < 30)
			return "Pré-obesidade";
		else if(imc < 35)
			return "Obesidade Grau I";
		else if(imc < 40)
			return "Obesidade Grau II";
		return "Obesidade Grau III";
	}
	
	public String obterRisco() {
		double imc = this.obterImc();
		if(imc < 18.5)
			return "Muito alto";
		else if(imc < 25)
			return "Baixo";
		else if(imc < 30)
			return "Médio";
		else if(imc < 35)
			return "Alto";
		else if(imc < 40)
			return "Muito alto";
		return "Muitíssimo alto";
	}

}
