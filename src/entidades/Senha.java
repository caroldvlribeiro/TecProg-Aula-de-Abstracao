package entidades;

public class Senha {

	private String valor;
	private String dataExpiracao;
	private String nivelSeguranca;
	private String usuario;
	private int tentativasFalhas;

	public Senha(String valor, String dataExpiracao, String nivelSeguranca, String usuario, int tentativasFalhas) {
		this.valor = valor;
		this.dataExpiracao = dataExpiracao;
		this.nivelSeguranca = nivelSeguranca;
		this.usuario = usuario;
		this.tentativasFalhas = tentativasFalhas;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getDataExpiracao() {
		return dataExpiracao;
	}

	public void setDataExpiracao(String dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}

	public String getNivelSeguranca() {
		return nivelSeguranca;
	}

	public void setNivelSeguranca(String nivelSeguranca) {
		this.nivelSeguranca = nivelSeguranca;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getTentativasFalhas() {
		return tentativasFalhas;
	}

	public void setTentativasFalhas(int tentativasFalhas) {
		this.tentativasFalhas = tentativasFalhas;
	}

	public void validarSenha(String senhaInformada) {
		if (this.valor.equals(senhaInformada)) {
			System.out.println("Senha correta! Acesso liberado para: " + usuario);
		} else {
			tentativasFalhas++;
			System.out.println("Senha incorreta. Tentativas falhas: " + tentativasFalhas);
		}
	}

	public void criptografar() {
		this.valor = "***CRIPTOGRAFADA***";
		System.out.println("Criptografia aplicada na senha do usuario: " + usuario);
	}

	public void redefinir(String novaSenha) {
		this.valor = novaSenha;
		this.tentativasFalhas = 0;
		System.out.println("Senha redefinida com sucesso para o usuario: " + usuario);
	}
}
