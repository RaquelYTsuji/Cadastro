import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private LocalDate nascimento;
	private CarteiraIdentidade identidade;

	public Pessoa() {
		this.nome = "";
		this.nascimento = LocalDate.now();
		this.identidade = new CarteiraIdentidade();
	}
	
	public Pessoa(String nome, Integer ano, Integer mes, Integer dia, String rg, String cpf) {
		this.nome = "";
		this.nascimento = LocalDate.of(ano, mes, dia);
		this.identidade = new CarteiraIdentidade(rg, cpf);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public CarteiraIdentidade getIdentidade() {
		return identidade;
	}
	public void setIdentidade(CarteiraIdentidade identidade) {
		this.identidade = identidade;
	}
	
	public boolean equals (Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (this.getClass() != obj.getClass())
			return false;
		
		Pessoa other = (Pessoa) obj;
		
		if (this.nome == null) {
			if (other.nome != null)
				return false;
		}
		else if (!this.nome.equals(other.nome))
			return false;
		
		if (this.nascimento == null) {
			if (other.nascimento != null)
				return false;
		}
		else if (!this.nascimento.equals(other.nascimento))
			return false;
		
		if (this.identidade == null) {
			if (other.identidade != null)
				return false;
		}
		else if (!this.identidade.equals(other.identidade))
			return false;
		
		return true;
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 3;
		int result = 1;
		result = prime * result + ((nome==null)? 0:nome.hashCode());
		result = prime * result + ((nascimento==null)? 0:nascimento.hashCode());
		result = prime * result + ((identidade==null)? 0:identidade.hashCode());
		return result;
	}
	
	public String toString() {
		return "\nNome: " + nome + "\nNascimento: " + nascimento + "\nIdentidade: " + identidade;
	}
}
