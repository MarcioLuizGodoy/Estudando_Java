
import java.util.*;

		//classe disciplina tem quatro notas 
		//p todos os objetos notas e materias

public class Disciplina {
	
		//Atributos: nome e nota
	
	private String disciplina;
	
	private  double []notas = new double[4];
	
		//construtor
	
	public Disciplina(){};
	
		//get set disciplina

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
		//get set notas
	
	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	//metodomedianotas
	public double getMediaNotas() {
		  double somaNotas = 0;

		for(int pos =0; pos < 4; pos ++) {
		  somaNotas = somaNotas + notas[pos];		  
	}
		  return somaNotas/4;

		}
	
	//diferenciar objetos por atributos #hashcode

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(notas);
		result = prime * result + Objects.hash(disciplina);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina) && Arrays.equals(notas, other.notas);
		
		//mostrar o objeto como todo
	}
	@Override
	public String toString() {
		return "Disciplina [disciplina=" + disciplina + ", notas=" + Arrays.toString(notas) + "]";
	}


	
	

}
	
	
	
	