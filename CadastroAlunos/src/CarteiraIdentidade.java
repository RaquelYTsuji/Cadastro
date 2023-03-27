
public class CarteiraIdentidade {
	private String rg;
	private String cpf;
	
	public CarteiraIdentidade() {
		this.rg = "";
		this.cpf = "";
	}
	
	public CarteiraIdentidade(String rg, String cpf) {
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean equals (Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (this.getClass() != obj.getClass())
			return false;
		
		CarteiraIdentidade other = (CarteiraIdentidade) obj;
		
		if (this.rg == null) {
			if (other.rg != null)
				return false;
		}
		else if (!this.rg.equals(other.rg))
			return false;
		
		if (this.cpf == null) {
			if (other.cpf != null)
				return false;
		}
		else if (!this.cpf.equals(other.cpf))
			return false;
		
		return true;
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 3;
		int result = 1;
		result = prime * result + ((rg==null)? 0:rg.hashCode());
		result = prime * result + ((cpf==null)? 0:cpf.hashCode());
		return result;
	}
	
	public String toString() {
		return "Número do RG: " + rg + "\nNúmero do CPF: " + cpf;
	}
}
