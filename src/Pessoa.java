
public abstract class Pessoa {

	
	//Atributos
	protected String nome;
	protected int idade;
	protected String cpf;
	protected String dataNascimento;
	protected String nomeMae;
	protected String nomePai;
	protected String registroGeral;
	
	public abstract double salario();
	
	
	// construtor
	public Pessoa() {
		
	}
	
	//Metodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento
				+ ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", registroGeral=" + registroGeral + "]";
	}
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
		}
	//fim do main
}