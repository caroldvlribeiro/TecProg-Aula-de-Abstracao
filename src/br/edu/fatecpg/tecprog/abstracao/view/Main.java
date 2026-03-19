package br.edu.fatecpg.tecprog.abstracao.view;

import br.edu.fatecpg.tecprog.abstracao.model.*;
import java.util.*;
import java.time.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int op;

		do {

			System.out.println("Escolha qual Classe deseja ver: " + "\n1.Produto" + "\n2.Curso" + "\n3.Rede Social"
					+ "\n4.Conta Bancaria" + "\n5.Arquivo" + "\n6.Aula" + "\n7.Avaliação" + "\n8.Pedido" + "\n9.Projeto"
					+ "\n10.Jogo" + "\n11.Usuário" + "\n12.Aplicativo" + "\n13.Cliente" + "\n14.Sistema Operacional"
					+ "\n15.Tarefa" + "\n16.Relatorio" + "\n0.Sair");

			op = scanner.nextInt();

			switch (op) {

			case 1:
				Produto newProduto = new Produto();

				newProduto.nmProduto = "Notebook";
				newProduto.idProduto = 100;
				newProduto.qtEstoque = 50;
				newProduto.valorProduto = 2499.90;
				newProduto.categoriaProduto = "Eletrônicos";

				newProduto.consultarProduto();
				System.out.println("-".repeat(35));

				newProduto.venderProduto();
				System.out.println("-".repeat(35));

				newProduto.excluirProduto();
				break;

			case 2:
				Curso newCurso = new Curso();

				newCurso.nmCurso = "Desenvolvimento de Software e Multiplataforma";
				newCurso.idCurso = 200;
				newCurso.hrCurso = LocalTime.of(13, 10);
				newCurso.materiaCurso = "Tecnicas de Programação I";
				newCurso.nmProfessor = "Alessandro";

				newCurso.acessarCurso();
				System.out.println("-".repeat(35));

				newCurso.lecionarCurso();
				System.out.println("-".repeat(35));

				newCurso.atualizarCurso();
				break;

			case 3:
				RedeSocial newRede = new RedeSocial();

				newRede.nmRede = "Instagram";
				newRede.idRedeSocial = 1;
				newRede.qtUsuarios = 2000000;
				newRede.algoritmo = "Recomendação por engajamento";
				newRede.tipoConteudo = "Fotos e Vídeos";

				newRede.criarPerfil();
				System.out.println("-".repeat(35));

				newRede.enviarMensagem();
				System.out.println("-".repeat(35));

				newRede.atualizarAlgoritmo();
				break;

			case 4:
				ContaBancaria newConta = new ContaBancaria();

				newConta.numeroConta = 12345;
				newConta.numeroAgencia = 1001;
				newConta.saldo = 5000.50;
				newConta.tipoConta = "Corrente";
				newConta.nomeCliente = "Carlos";

				newConta.consultarSaldo();
				System.out.println("-".repeat(35));

				newConta.depositar();
				System.out.println("-".repeat(35));

				newConta.transferir();
				break;

			case 5:
				Arquivo newArquivo = new Arquivo();

				newArquivo.nomeArquivo = "Relatorio";
				newArquivo.tipoArquivo = ".pdf";
				newArquivo.tamanho = 2.5;
				newArquivo.descricao = "Relatório de vendas";
				newArquivo.proprietario = "Carlos";

				newArquivo.visualizar();
				System.out.println("-".repeat(35));

				newArquivo.editar();
				System.out.println("-".repeat(35));

				newArquivo.compartilhar();
				break;

			case 6:
				Aula newAula = new Aula();

				newAula.nomeAula = "Introdução ao Java";
				newAula.tipo = "Presencial";
				newAula.material = "Slides e exercícios";
				newAula.data = LocalDate.of(2025, 6, 20);
				newAula.professor = "Alessandro";

				newAula.lecionarAula();
				System.out.println("-".repeat(35));

				newAula.atualizarConteudo();
				System.out.println("-".repeat(35));

				newAula.registrarPresenca();
				break;

			case 7:
				Avaliacao newAvaliacao = new Avaliacao();

				newAvaliacao.nome = "Prova 1";
				newAvaliacao.data = LocalDate.of(2025, 7, 10);
				newAvaliacao.local = "Sala 10";
				newAvaliacao.notaMaxima = 10;
				newAvaliacao.disciplina = "Programação";

				newAvaliacao.aplicar();
				System.out.println("-".repeat(35));

				newAvaliacao.corrigir();
				System.out.println("-".repeat(35));

				newAvaliacao.divulgarResultado();
				break;
			case 8:
				Pedido novoPedido = new Pedido();

				novoPedido.idPedido = 100;
				novoPedido.produtoPedido = "Notebook";
				novoPedido.nmCliente = "Carlos";
				novoPedido.statusPedido = "ABERTO";
				novoPedido.descricaoPedido = "Notebook HQ com i5, 8GB RAM, SSD 256GB";

				novoPedido.criarPedido();
				System.out.println("-".repeat(35));

				novoPedido.buscarPedido();
				System.out.println("-".repeat(35));

				novoPedido.cancelarPedido();
				break;

			case 9:
				Projeto newProjeto = new Projeto();

				newProjeto.criarProjeto();
				newProjeto.editarDados();
				newProjeto.alterarEstado();
				break;

			case 10:
				Jogo newJogo = new Jogo();

				newJogo.nomeJogo = "The Sims";

				newJogo.iniciarJogo();
				newJogo.executarMecanicas();
				newJogo.finalizarJogo();
				break;

			case 11:
				Usuario newUsuario = new Usuario();

				newUsuario.nomeUsuario = "Jurandir da Silva";
				newUsuario.contatoUsuario = "jurandir@email.com";
				newUsuario.tipoUsuario = "Cliente";
				newUsuario.identificadorPublicoUsuario = "Jurandir";

				newUsuario.criarConta();
				newUsuario.autenticarConta();
				newUsuario.editarConta();
				break;

			case 12:
				Aplicativo app = new Aplicativo();

				app.nome = "Amazon";
				app.versao = 1.02;

				app.iniciar();
				System.out.println("-".repeat(35));

				app.iniciar();
				System.out.println("-".repeat(35));

				app.iniciar();
				break;

			case 13:
				Cliente cliente = new Cliente();

				cliente.cpf = "984.627.762-07";
				cliente.telefone = "(13) 99180-6870";

				System.out.println("Cliente: " + cliente.cpf);
				break;

			case 14:
				SistemaOperacional sis = new SistemaOperacional();

				sis.proprietario = "Microsoft";
				sis.ano = "2016";

				sis.instalar();
				System.out.println("-".repeat(35));

				sis.instalar();
				System.out.println("-".repeat(35));

				sis.instalar();
				break;

			case 15:
				Tarefa tarefa = new Tarefa();

				tarefa.prazo = "2 dias";
				tarefa.status = "Concluído";

				tarefa.gerando();
				System.out.println("-".repeat(35));

				tarefa.gerando();
				System.out.println("-".repeat(35));

				tarefa.gerando();
				break;

			case 16:
				Relatorio rel = new Relatorio();

				rel.titulo = "Sistema";
				rel.autor = "Marcio";

				rel.elaborando();
				System.out.println("-".repeat(35));

				rel.elaborando();
				System.out.println("-".repeat(35));

				rel.elaborando();
				break;
			case 0:
				System.out.println("Encerrando programa...");
				break;

			default:
				System.out.println("Opção inválida!");
			}

		} while (op != 0);

	}
}