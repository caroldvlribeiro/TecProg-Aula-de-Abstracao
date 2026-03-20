package entidades;

public class Main {

	public static void main(String[] args) {

		System.out.println("===== PEDIDO =====");
		Pedido pedido1 = new Pedido(1, "Notebook", "Ana Silva", "Pedido urgente", "Pendente");
		Pedido pedido2 = new Pedido(2, "Mouse Gamer", "Carlos Souza", "Entrega normal", "Enviado");

		System.out.println("Status do pedido 1: " + pedido1.getStatus());
		pedido1.criarPedido();
		pedido2.cancelarPedido();

		System.out.println("\n===== SITE =====");
		Site site1 = new Site("www.meusite.com.br", "Meu Site", "meusite.com.br", "Apache", "Portugues");
		Site site2 = new Site("www.techblog.io", "Tech Blog", "techblog.io", "Nginx", "Ingles");

		System.out.println("URL do site 1: " + site1.getUrl());
		site1.publicar();
		site2.atualizar("Novos artigos sobre Java");

		System.out.println("\n===== BANCO DE DADOS =====");
		BancoDeDados bd1 = new BancoDeDados("Oracle_DB", "TB_CLIENTES", "192.168.1.1", 500.5, "Dados de clientes");
		BancoDeDados bd2 = new BancoDeDados("MySQL_DB", "TB_PRODUTOS", "192.168.1.2", 320.0, "Catalogo de produtos");

		System.out.println("Nome do banco 1: " + bd1.getNome());
		bd1.criarRegistro("id=10, nome=Joao");
		bd2.consultarRegistro("categoria=Eletronicos");

		System.out.println("\n===== SENHA =====");
		Senha senha1 = new Senha("Java@2025", "31/12/2025", "Forte", "rubia.turci", 0);
		Senha senha2 = new Senha("abc123", "01/06/2025", "Fraca", "carol.ribeiro", 0);

		System.out.println("Nivel de seguranca da senha 1: " + senha1.getNivelSeguranca());
		senha1.validarSenha("Java@2025");
		senha2.redefinir("NovaSenha@2025");

	}

} 