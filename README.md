
Sistema de Gerenciamento de Estoque - Documentação

Eduardo Muniz Marodin
Killdery José Gois Santos
Matheus Henrique Ferreira Machado
Matheus Ribas de Lima
Warley Victor Mauricio Rodrigues Neto

Disciplina: Desenvolvimento de Software
Professor: Andre Luis Seller Seletti
Curso: Análise e Desenvolvimento de Sistemas
Data: 13/06/2025
1. Introdução
   O presente documento tem como objetivo apresentar a documentação técnica do projeto de um Sistema de Gerenciamento de Estoque desenvolvido na linguagem Java. O sistema foi criado com a finalidade de registrar, consultar, remover e listar produtos, utilizando conceitos de Programação Orientada a Objetos, persistência de dados e boas práticas de organização de código.
2. Objetivo do Sistema
   O sistema tem como objetivo auxiliar pequenas empresas ou usuários individuais a manterem o controle de seus estoques de forma simples e organizada, oferecendo funcionalidades de cadastro de produtos, consulta, remoção e listagem dos mesmos.
3. Funcionalidades
- Cadastro de novos produtos
- Remoção de produtos por ID
- Listagem de todos os produtos cadastrados
- Consulta de produto por ID
- Armazenamento persistente utilizando arquivos `.dat`
- Registro de logs de operações
4. Tecnologias Utilizadas
- Linguagem: Java
- IDE: IntelliJ IDEA | Visual Studio Code
- Paradigma: Programação Orientada a Objetos (POO)
- Persistência de dados: Serialização em arquivos binários
5. Estrutura do Projeto
   Pacote src/
- Main.java: Classe principal que inicia o sistema.

Pacote Controller/
- DialogoController.java: Responsável pela interação com o usuário (entrada e saída).
- Estoque.java: Contém os métodos principais de manipulação dos produtos.

Pacote Lib/
- Serializador.java: Lê e grava objetos em arquivos.
- input.java: Entrada de dados.
- Logging.java: Geração de logs de eventos.

Pacote Model/
- Produto.java: Classe base de produto.

Subpacote Model/interfaces/
- Usado.java: Interface que representa produtos usados.

Subpacote Model/objeto/
- Contém todas as classes concretas de produtos, como: Barraca, Bola, Boneca, Borracha, CadeiraDePraia, Caderno, Caneta, Carrinho, Coleira, Papel, Piscina, Pneu, RacaoSache, Shampoo, Tinta.

Subpacote Model/sessoes/
- Define categorias de produtos: Brinquedo, Ferragens, Lazer, Papelaria, Pet

Pacote View/
- Contém classes relacionadas à visualização/interação com o usuário (interface textual).

Pasta data/
- produtos.dat: Armazena os produtos cadastrados.
- sistema.log: Armazena logs das operações realizadas.
6. Classes Principais
- Produto: Classe base contendo nome, código, preço e quantidade.
- Classes de produtos: Cada produto como Bola, Boneca, Caneta, etc., herda de Produto e pode conter atributos adicionais.
- Categorias (sessoes): Cada categoria como Brinquedo, Papelaria ou Pet representa uma divisão lógica para organização dos produtos.
- Estoque: Gerencia a coleção de produtos, implementando as operações de CRUD.
- Serializador: Faz a persistência dos dados utilizando Java Serialization.
- DialogoController: Interface textual com o usuário, utilizando Scanner e System.out.
7. Considerações Finais
   O projeto permitiu a aplicação prática de conceitos essenciais da linguagem Java, como herança, interfaces, encapsulamento, manipulação de arquivos e separação de responsabilidades em pacotes. Além disso, possibilitou a experiência com trabalho em grupo, simulação de cenários reais e desenvolvimento colaborativo.

A documentação aqui apresentada tem por finalidade apoiar a compreensão e manutenção do sistema por outros desenvolvedores ou futuros integrantes do projeto.


