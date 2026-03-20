package entidades;

public class Pedido {

	private int idPedido;
	private String produto;
	private String cliente;
	private String descricao;
	private String status;

	public Pedido(int idPedido, String produto, String cliente, String descricao, String status) {
		this.idPedido = idPedido;
		this.produto = produto;
		this.cliente = cliente;
		this.descricao = descricao;
		this.status = status;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void criarPedido() {
		System.out.println("Pedido #" + idPedido + " criado com sucesso para o cliente: " + cliente);
	}

	public void buscarPedido(int id) {
		if (this.idPedido == id) {
			System.out.println("Pedido encontrado! Produto: " + produto + " | Status: " + status);
		} else {
			System.out.println("Pedido com ID " + id + " nao encontrado.");
		}
	}

	public void cancelarPedido() {
		this.status = "Cancelado";
		System.out.println("Pedido #" + idPedido + " cancelado. Estoque revertido.");
	}
}
