
public class Aluno extends Pessoa{
	private String prontuario;
	private Double media;

	public Aluno() {
		super();
		this.prontuario = "";
		this.media = 0.0;
	}
	
	public Aluno(String nome, Integer ano, Integer mes, Integer dia, String rg, String cpf, String prontuario, Double media) {
		super(nome, ano, mes, dia, rg, cpf);
		this.prontuario = prontuario;
		this.media = media;
	}

	public String getProntuario() {
		return prontuario;
	}
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	
	public Double getMedia() {
		return media;
	}
	public void setMedia(Double media) {
		this.media = media;
	}

	public boolean equals (Object obj) {
		if (this == obj)
			return true;
		
		if (!super.equals(obj))
			return false;
		
		if (this.getClass() != obj.getClass())
			return false;
		
		Aluno other = (Aluno) obj;
		
		if (this.prontuario == null) {
			if (other.prontuario != null)
				return false;
		}
		else if (!this.prontuario.equals(other.prontuario))
			return false;
		
		if (this.media == null) {
			if (other.media != null)
				return false;
		}
		else if (!this.media.equals(other.media))
			return false;
		
		return true;
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 3;
		int result = super.hashCode();
		result = prime * result + ((prontuario==null)? 0:prontuario.hashCode());
		result = prime * result + ((media==null)? 0:media.hashCode());
		return result;
	}
	
	public String toString() {
		return super.toString() + "\nProntuário: " + prontuario + "\nMédia: " + media;
	}
}

