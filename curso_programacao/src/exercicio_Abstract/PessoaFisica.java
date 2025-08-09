package exercicio_Abstract;

public class PessoaFisica extends Contribuintes {

	private Double gastosSaude;

	public PessoaFisica() {
	}

	public PessoaFisica(String nome, Double renda, Double gastosSaude) {
		super(nome, renda);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public double imposto() {
		double imposto = 0;

		if (getRenda() < 20000 && gastosSaude != 0) {
			imposto = getRenda() * 0.15;
			return imposto - (gastosSaude * 0.50);
		} else if (getRenda() < 20000 && gastosSaude == 0) {
			imposto = getRenda() * 0.15;
		} else if (getRenda() >= 20000 && gastosSaude != 0) {
			imposto = getRenda() * 0.25;
			return imposto - (gastosSaude * 0.50);
		} else if (getRenda() >= 20000 && gastosSaude == 0) {
			return imposto = getRenda() * 0.25;
		}

		return 0;

	}



	

}
