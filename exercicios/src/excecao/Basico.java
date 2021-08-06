package excecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			
			imprimirNomeDoAluno(a1);
		}catch(Exception excexao){
			System.out.println("Ocorreu um erro ao imprimir o nome");
		}
		
		try {
			System.out.println(7 /0);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu o erro: " + e.getMessage());
		}
		
		System.out.println("Fim :) ");
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
