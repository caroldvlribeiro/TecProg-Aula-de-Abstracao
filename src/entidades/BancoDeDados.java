package entidades;

public class BancoDeDados {

	private String nome;
	private String tabela;
	private String servidor;
	private double tamanho;
	private String informacoesArmazenadas;

	public BancoDeDados(String nome, String tabela, String servidor, double tamanho, String informacoesArmazenadas) {
		this.nome = nome;
		this.tabela = tabela;
		this.servidor = servidor;
		this.tamanho = tamanho;
		this.informacoesArmazenadas = informacoesArmazenadas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTabela() {
		return tabela;
	}

	public void setTabela(String tabela) {
		this.tabela = tabela;
	}

	public String getServidor() {
		return servidor;
	}

	public void setServidor(String servidor) {
		this.servidor = servidor;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getInformacoesArmazenadas() {
		return informacoesArmazenadas;
	}

	public void setInformacoesArmazenadas(String info) {
		this.informacoesArmazenadas = info;
	}

	public void criarRegistro(String dados) {
		System.out.println("Novo registro inserido no banco '" + nome + "': " + dados);
	}

	public void consultarRegistro(String filtro) {
		System.out.println("Consultando no banco '" + nome + "' com filtro: " + filtro);
		System.out.println("Dados encontrados: " + informacoesArmazenadas);
	}

	public void atualizarRegistro(int id, String dados) {
		System.out.println("Registro ID " + id + " atualizado no banco '" + nome + "': " + dados);
	}
}
