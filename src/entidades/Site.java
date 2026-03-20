package entidades;

public class Site {

	private String url;
	private String nome;
	private String endereco;
	private String servidor;
	private String idioma;

	public Site(String url, String nome, String endereco, String servidor, String idioma) {
		this.url = url;
		this.nome = nome;
		this.endereco = endereco;
		this.servidor = servidor;
		this.idioma = idioma;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getServidor() {
		return servidor;
	}

	public void setServidor(String servidor) {
		this.servidor = servidor;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public void publicar() {
		System.out.println("Site '" + nome + "' publicado com sucesso em: " + url);
	}

	public void atualizar(String novoConteudo) {
		System.out.println("Site '" + nome + "' atualizado. Novo conteudo: " + novoConteudo);
	}

	public void excluirPagina(String urlPagina) {
		System.out.println("Pagina removida do site '" + nome + "': " + urlPagina);
	}
}
