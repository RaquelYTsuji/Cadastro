
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro{
	private ArrayList<Aluno> lista;
	private Scanner sc;
	
	public Cadastro() {
		this.lista = new ArrayList<Aluno>();
		this.sc = new Scanner(System.in);
		
		Integer opcao = 0;
		
		do {
			System.out.println("\nCadastro de Alunos");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Fim");
			System.out.print("\nDigite: ");
			opcao = sc.nextInt();
			
			switch(opcao){
			case 1:
				cadastrar();
				break;
			case 2:
				listar();
				break;
			case 3:
				fim();
			}
			
		}while(opcao<=3 && opcao>0);
	}
	
	public void cadastrar(){
		System.out.println("\nCadastrar");
		System.out.print("\nNome: ");
		String nome = sc.next();
		System.out.print("Dia de nascimento: ");
		Integer dia = sc.nextInt();
		System.out.print("Mes de nascimento: ");
		Integer mes = sc.nextInt();
		System.out.print("Ano de nascimento: ");
		Integer ano = sc.nextInt();
		System.out.print("RG: ");
		String rg = sc.next();
		System.out.print("CPF: ");
		String cpf = sc.next();
		System.out.print("Prontuário: ");
		String prontuario = sc.next();
		System.out.print("Média: ");
		Double media = sc.nextDouble();
		
		lista.add(new Aluno(nome, ano, mes, dia, rg, cpf, prontuario, media));
	}
	
	public void listar(){
		System.out.println("Listar");
		for(Aluno x: lista)
			System.out.println(x);
	}
	
	public void fim(){
		System.out.println("Fim");
	}
}
