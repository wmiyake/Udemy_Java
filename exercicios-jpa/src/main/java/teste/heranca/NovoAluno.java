package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {
		
		DAO<Aluno> alunoDAO = new DAO<>();
		
		Aluno aluno1 = new Aluno(123L, "Jo?o");
		AlunoBolsista aluno2 = new AlunoBolsista(345L, "Maria", 1000);
		
		alunoDAO.incluirAtomicoT(aluno1);
		alunoDAO.incluirAtomicoT(aluno2);
		
		alunoDAO.fechar();
	}
}
