import javax.swing.JOptionPane;

public class ArrayVetor {
	
public static void main(String[] args) {
	
	double[] notas = {10,6,8,4};
	double[] notasDisciplina2 = {10,9,8,7};

	
		Aluno aluno = new Aluno();
		aluno.setNome("Marcio luiz");
		
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso java");
		disciplina.setNotas(notas);
		aluno.getDisciplinas().add(disciplina);
		
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("LPOO");
		disciplina2.setNotas(notasDisciplina2) ;
		
		aluno.getDisciplinas().add(disciplina2);
		
		
				//--------------------------//
		
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for ( int i =0; i<arrayAlunos.length; i++ ) {
			System.out.println( "Nome do aluno: " +
					arrayAlunos[i].getNome() );
			
			for ( Disciplina d: arrayAlunos[i].getDisciplinas() ) {
				System.out.println( "Nome da disciplina : " + 
						d.getDisciplina() );
				for ( int o = 0; o < d.getNotas().length; o ++ ) {
					System.out.println( "A nota: " + 
							d.getNotas()[o] );
					
				}
				
			}
			
		}
	
		
	}		
		}
		