# 📚 Atividade — Abstração Teórica (POO)

Atividade prática de **Programação Orientada a Objetos** em Java, baseada na aula de **Abstração Teórica**.

---

## 📋 Descrição da Atividade

Criação de classes baseadas na atividade anterior de abstração, instanciando **2 objetos de cada entidade** na classe principal e imprimindo **1 atributo e 1 método** de cada uma.

O objetivo da atividade é aplicar conceitos de **abstração em POO**, representando entidades do mundo real através de **classes, atributos e métodos**, simulando comportamentos através de mensagens no console.

---

## 📁 Estrutura do Projeto

```
src/
└── br/
    └── edu/
        └── fatecpg/
            └── tecprog/
                └── abstracao/           
                    ├── model/
                    │   ├── ContaBancaria.java
                    │   ├── Produto.java
                    │   ├── Curso.java
                    │   ├── RedeSocial.java
                    │   ├── Pedido.java
                    │   ├── Cliente.java
                    │   ├── Usuario.java
                    │   ├── Aplicativo.java
                    │   ├── Site.java
                    │   ├── BancoDeDados.java
                    │   ├── Senha.java
                    │   ├── Mensagem.java
                    │   ├── SistemaOperacional.java
                    │   ├── Arquivo.java
                    │   ├── Projeto.java
                    │   ├── Tarefa.java
                    │   ├── Relatorio.java
                    │   ├── Jogo.java
                    │   ├── Aula.java
                    │   └── Avaliacao.java
                    │
                    └── view/
                        └── Main.java
```

---

# 🧩 Classes Criadas

## 🛒 Produto

| Atributo | Tipo |
|---|---|
| `nmProduto` | `String` |
| `idProduto` | `int` |
| `valorProduto` | `double` |
| `qtEstoque` | `int` |
| `categoriaProduto` | `String` |

**Métodos:**  
`venderProduto()`  
`excluirProduto()`  
`consultarProduto()`

**Feito por:** 
`Carolina Ribeiro`

---

## 🎓 Curso

| Atributo | Tipo |
|---|---|
| `nmCurso` | `String` |
| `idCurso` | `int` |
| `nmProfessor` | `String` |
| `hrCurso` | `LocalTime` |
| `materiaCurso` | `String` |

**Métodos:**  
`acessarCurso()`  
`lecionarCurso()`  
`atualizarCurso()`

**Feito por:** 
`Carolina Ribeiro`

---

## 📱 RedeSocial

| Atributo | Tipo |
|---|---|
| `nmRede` | `String` |
| `idRedeSocial` | `int` |
| `qtUsuarios` | `int` |
| `algoritmo` | `String` |
| `tipoConteudo` | `String` |

**Métodos:**  
`atualizarAlgoritmo()`  
`enviarMensagem()`  
`criarPerfil()`

**Feito por:** 
`Carolina Ribeiro`

---
## 📦 Pedido

| Atributo | Tipo |
|---|---|
| idPedido | int |
| produto | String |
| cliente | String |
| descricao | String |
| status | String |

**Métodos:**  
criarPedido()  
buscarPedido()  
cancelarPedido()

**Feito por:** 
`Carolina Ribeiro`

---

## 🏦 ContaBancaria

| Atributo | Tipo |
|---|---|
| `numeroConta` | `int` |
| `numeroAgencia` | `int` |
| `saldo` | `double` |
| `tipoConta` | `String` |
| `nomeCliente` | `String` |

**Métodos:**  
`consultarSaldo()`  
`transferir()`  
`depositar()`

**Feito por:** 
`Carlos Roberto`

---

## 📁 Arquivo

| Atributo | Tipo |
|---|---|
| `nomeArquivo` | `String` |
| `tipoArquivo` | `String` |
| `tamanho` | `double` |
| `descricao` | `String` |
| `proprietario` | `String` |

**Métodos:**  
`visualizar()`  
`editar()`  
`compartilhar()`

**Feito por:** 
`Carlos Roberto`

---

## 📖 Aula

| Atributo | Tipo |
|---|---|
| `nomeAula` | `String` |
| `tipo` | `String` |
| `material` | `String` |
| `data` | `LocalDate` |
| `professor` | `String` |

**Métodos:**  
`lecionarAula()`  
`atualizarConteudo()`  
`registrarPresenca()`

**Feito por:** 
`Carlos Roberto`

---

## 📝 Avaliação

| Atributo | Tipo |
|---|---|
| `nome` | `String` |
| `data` | `LocalDate` |
| `local` | `String` |
| `notaMaxima` | `double` |
| `disciplina` | `String` |

**Métodos:**  
`aplicar()`  
`corrigir()`  
`divulgarResultado()`

**Feito por:** 
`Carlos Roberto`

---

## 👨‍💻 Usuario

| Atributo | Tipo |
|---|---|
| `nome` | `String` |
| `identificadorPublico` | `String` |
| `contato` | `String` |
| `tipo` | `String` |
| `dataCadastro` | `LocalDate` |

**Métodos:**  
`criarConta()`  
`autenticar()`  
`editarInformacoes()`

**Feito por:** 
`Danilo dos Santos`

---

## 📊 Projeto

| Atributo | Tipo |
|---|---|
| `nome` | `String` |
| `descricao` | `String` |
| `objetivo` | `String` |
| `dataInicio` | `LocalDate` |
| `estado` | `String` |

**Métodos:**  
`criarProjeto()`  
`editarProjeto()`  
`alterarEstado()`

**Feito por:** 
`Danilo dos Santos`

---

## 🎮 Jogo

| Atributo | Tipo |
|---|---|
| `nome` | `String` |
| `descricao` | `String` |
| `genero` | `String` |
| `objetivo` | `String` |
| `regras` | `String` |

**Métodos:**  
`iniciarJogo()`  
`executarMecanicas()`  
`finalizarJogo()`

**Feito por:** 
`Danilo dos Santos`

---

## 👤 Cliente

| Atributo | Tipo |
|---|---|
| `nome` | `String` |
| `cpf` | `String` |
| `telefone` | `String` |
| `codigo` | `int` |
| `email` | `String` |

**Métodos:**  
`cadastrar()`  
`realizarPagamento()`  
`darFeedback()`

**Feito por:** 
`Daniela Feitoza`

---

## 📲 Aplicativo

| Atributo | Tipo |
|---|---|
| `nome` | `String` |
| `codigo` | `int` |
| `link` | `String` |
| `hospedagem` | `String` |
| `layout` | `String` |

**Métodos:**  
`receberInput()`  
`processarDados()`  
`exibirInformacoes()`

**Feito por:** 
`Daniela Feitoza`

---

## 💻 SistemaOperacional

| Atributo | Tipo |
|---|---|
| `nome` | `String` |
| `versao` | `String` |
| `codigoFonte` | `String` |
| `instalador` | `String` |
| `programas` | `String` |

**Métodos:**  
`gerenciarProcessos()`  
`executarComando()`  
`atualizarSistema()`

**Feito por:** 
`Daniela Feitoza`

---

## 📌 Tarefa

| Atributo | Tipo |
|---|---|
| `descricao` | `String` |
| `prazo` | `LocalDate` |
| `responsavel` | `String` |
| `dataCriacao` | `LocalDate` |
| `status` | `String` |

**Métodos:**  
`criarTarefa()`  
`editarTarefa()`  
`concluirTarefa()`

**Feito por:** 
`Daniela Feitoza`

---

## 📑 Relatorio

| Atributo | Tipo |
|---|---|
| `titulo` | `String` |
| `autor` | `String` |
| `data` | `LocalDate` |
| `proposta` | `String` |
| `conclusao` | `String` |

**Métodos:**  
`gerarRelatorio()`  
`editarRelatorio()`  
`exportar()`

**Feito por:** 
`Daniela Feitoza`

---

## 🌐 Site

| Atributo | Tipo |
|---|---|
| `url` | `String` |
| `nome` | `String` |
| `endereco` | `String` |
| `servidor` | `String` |
| `idioma` | `String` |

**Métodos:**  
`publicar()`  
`atualizar()`  
`excluirPagina()`

**Feito por:** 
`Rubia Turci`

---

## 🗄️ BancoDeDados

| Atributo | Tipo |
|---|---|
| `nome` | `String` |
| `tabela` | `String` |
| `servidor` | `String` |
| `tamanho` | `double` |
| `informacoesArmazenadas` | `String` |

**Métodos:**  
`criarRegistro()`  
`consultarRegistro()`  
`atualizarRegistro()`

**Feito por:** 
`Rubia Turci`

---

## 🔐 Senha

| Atributo | Tipo |
|---|---|
| `valor` | `String` |
| `dataExpiracao` | `LocalDate` |
| `nivelSeguranca` | `String` |
| `usuario` | `String` |
| `tentativasFalhas` | `int` |

**Métodos:**  
`validar()`  
`criptografar()`  
`redefinir()`

**Feito por:** 
`Rubia Turci`

---

## 💬 Mensagem

| Atributo | Tipo |
|---|---|
| `idMensagem` | `int` |
| `conteudo` | `String` |
| `dataEnvio` | `LocalDateTime` |
| `remetente` | `String` |
| `destinatario` | `String` |

**Métodos:**  
`enviarMensagem()`  
`editarMensagem()`  
`excluirMensagem()`

**Feito por:** 
`Rubia Turci`

---

# 👥 Colaboradores

| Nome |
|---|
| Carolina Ribeiro |
| Carlos Roberto |
| Danilo dos Santos |
| Daniela Feitoza |
| Rubia Turci |

---

# 📖 Conceitos Aplicados

- Abstração
- Programação Orientada a Objetos (POO)
- Classes e Objetos
- Atributos e Métodos
- Instanciação de Objetos
- Estruturas de controle (`switch` e `loop`)
- Manipulação de datas e horários (`LocalDate` e `LocalTime`)
- Impressão de informações no console
