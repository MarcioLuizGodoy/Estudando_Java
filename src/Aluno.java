import java.util.*; 
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public  class Aluno extends Pessoa {
	//atributos//

private String dataMatricula;
private String nomeEscola;
private String serieMatriculado;

  	//superconstrutor//
public Aluno() {}

	//Criando os metodos get e set padroes//
public String getDataMatricula() {
return dataMatricula;
}

public void setDataMatricula(String dataMatricula) {
this.dataMatricula = dataMatricula;
}

public String getNomeEscola() {
return nomeEscola;
}

public void setNomeEscola(String nomeEscola) {
this.nomeEscola = nomeEscola;
}

public String getSerieMatriculado() {
return serieMatriculado;
}

public void setSerieMatriculado(String serieMatriculado) {
this.serieMatriculado = serieMatriculado;
}

	//instanciando lista de objeto da classe disciplina //
private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
			


	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas(){
		return disciplinas;
	}
	
	//metodo de media 	
public  double mediaAnual() {
	
	double somaNotas = 0.0;
	
	for( Disciplina disciplina : disciplinas) {
		somaNotas = disciplina.getMediaNotas()	;
	}	
	 return somaNotas/disciplinas.size();
}


	
public String alunoAprovado() {
	double media = this.mediaAnual();
	if( media > 5 && media < 7) {
		return StatusAluno.RECUPERACAO;
	} else if  ( media >=7) {
			return StatusAluno.APROVADO;
		}else {
	return StatusAluno.REPROVADO;
		}
	}

@Override
public int hashCode() {
	return Objects.hash(dataMatricula, disciplinas, nomeEscola, serieMatriculado);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Aluno other = (Aluno) obj;
	return Objects.equals(dataMatricula, other.dataMatricula) && Objects.equals(disciplinas, other.disciplinas)
			&& Objects.equals(nomeEscola, other.nomeEscola) && Objects.equals(serieMatriculado, other.serieMatriculado);
}

@Override
public String toString() {
	return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
			+ serieMatriculado + ", disciplinas=" + disciplinas + "]";
}


@Override   /*identifica metodo sobreescrito*/
public boolean pessoaMaiorIdade() {
	
	return idade >= 21;
}

public String msgMaiorIdade() {
	return this.pessoaMaiorIdade()? 
			"Oba aluno é maior de idade": "Ixxi vc é menor de idade";
			
}

@Override
public double salario() {
	
	return 1500.90;
}

}
