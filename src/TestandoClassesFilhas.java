
public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Godoy");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("dahuiojkn+5");
		diretor.setIdade(9);

		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("ADM");
		secretario.setIdade(30);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		aluno.pessoaMaiorIdade();
		diretor.pessoaMaiorIdade();
		secretario.pessoaMaiorIdade();
		
		
		
		}

}
