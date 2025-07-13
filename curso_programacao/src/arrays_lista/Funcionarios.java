package arrays_lista;

public class Funcionarios {

	private Integer ID;
	private String nome;
	private Double salario;
	
	
	public Funcionarios(Integer iD, String nome, Double salario) {
		ID = iD;
		this.nome = nome;
		this.salario = salario;
	}
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	
	public void increaseSalary (double percentual) {
		salario += salario * percentual / 100;
	}
	
	
	@Override
	public String toString() {
		return "Funcionarios [ID=" + ID + ", nome=" + nome + ", Salario=" + this.salario + "]";
	}
	
	
	
	
}
