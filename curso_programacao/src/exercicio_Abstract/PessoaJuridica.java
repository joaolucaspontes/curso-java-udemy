package exercicio_Abstract;

public class PessoaJuridica extends Contribuintes{

	private Integer numFunc;
	
	
	public PessoaJuridica() {
		
	}


	public PessoaJuridica(String nome, Double renda, Integer numFunc) {
		super(nome, renda);
		this.numFunc = numFunc;
	}



	public Integer getNumFunc() {
		return numFunc;
	}


	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	}
	
	@Override
	public double imposto() {
		
		if (numFunc > 10) {
			return getRenda() * 0.14;
		} else
			return getRenda() * 0.16;
	}


	

	
}
