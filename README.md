# SistemaDeVendas
Projeto de faculdade de um sistema de vendas com interface em Java Azul zulu 17.
    
Através da Interface é possível fazer operações CRUD para 
um <span style="color:#157cee">"Pedido"</span>.<br></br>
<span style="color:#fe315d">C</span>REATE → Representando como um cliente através de um aplicativo tivesse escolhido 
seus itens para comprar e então, posto eles no carrinho e então finalizasse o pedido.

[//]: # (<br><span style="color:#fe315d">R</span>)

[//]: # (<br><span style="color:#fe315d">U</span>)

[//]: # (<br><span style="color:#fe315d">D</span>)

# Tecnologias
- Java 17.
- Maven como gerenciador de dependências.
- Lombok para criação de código boilerplate.
- Swing para criação de Interface.
- Hibernate 5 para persistência de dados.
- MySQL 8 como banco de dados.

# Requisitos
- MySQL 8.
- Intellij Idea.
- JDK Java 17 EE ou superior.

# Setup
Baixe o arquivo zipado diretamente desse repositório e não se esqueça de 
remover o nome da branch da pasta.

## Setup do banco de dados

Crie no MySQL um Schema e não se preocupe em popular ele com tabelas, o Hibernate cuida disso automaticamente.

Em <span style="color:#f97a12">persistence.xml</span> que está localizada em:
<span style="color:#91F38B">Sistema de Vendas</span> → 
<span style="color:#9FC638">src</span> → 
<span style="color:#57AE4E">main</span> → 
<span style="color:#34C450">resources</span> → 
<span style="color:#0B4529">META-INF</span>
 altere as configurações do primeiro <span style="color:#fe315d">&lt;property&gt;</span> abaixo do &lt;properties&gt;.
```
<property name="javax.persistence.jdbc.url"
                      value="jdbc:mysql://localhost/{seuBancoDeDadosAqui}?useSSL=false&amp;serverTimezone=UTC" />
```
Altere <span style="color:#f97a12">{seuBancoDeDados}</span> 
pelo Schema que você criou no MySQL.

No mesmo arquivo certifique de mudar os value=" " de ambas <span style="color:#fe315d">&lt;property&gt;</span> abaixo, 
a primeira &lt;property&gt; <span style="color:#91F38B">name="javax.persistence.jdbc.user" value="{seuUserAqui}"</span> substitua oque 
o value recebe pelo user que você configurou no seu MySQL.

Na segunda <span style="color:#fe315d">&lt;property&gt;</span> <span style="color:#91F38B"><property name="javax.persistence.jdbc.password" value="{suaSenhaAqui}" /></span>
configure a senha que você cadastrou pro seu user.

```
<property name="javax.persistence.jdbc.user" value="{seuUserAqui}" />
            <property name="javax.persistence.jdbc.password" value="{suaSenhaAqui}" />
```

## Primeira execução

> [!WARNING]
> A primeira execução está fadada a um erro.

E está tudo bem!<br>
A primeira execução cria todas as tabelas no banco de dados se você executou o setup perfeitamente
até aqui.

## Segunda execução

Antes de executar o programa novamente precisamos inserir manualmente os 
Produtos no banco de dados. Como o projeto é um Sistema de Vendas e não 
um Sistema de Estoque, essa parte o projeto não cobre.

Então da maneira que você preferir, através do Workbench ou bash do MySQL execute a seguinte
QUERY
``` sql
INSERT INTO Produto (idProduto, nome, preco, sabor) VALUES (1, 'Biscoito Decorado', 18.0, 'Baunilha');
INSERT INTO Produto (idProduto, nome, preco, sabor) VALUES (2, 'Pipoca Gourmet (Pacote)', 8.0, 'Pão de Alho');
INSERT INTO Produto (idProduto, nome, preco, sabor) VALUES (3, 'Lascas de Brownie (Pacote)', 30.0, 'Lascas de Browniew');
```

Após isso estamos prontos para a segunda e última execução de Setup, portanto pode 
executar o programa e utilizá-lo.

# Diagrama de Classes
![DomainModel](https://raw.githubusercontent.com/Fflow021/SistemaDeVendas/main/assets/Diagrama_Classes-1.png)

# Análise de Mini-mundo
A fim de gerenciar as vendas da loja virtual Biscoitos e Pipocas Wolff's os seguintes requisitos devem ser atendidos pela modelagem de dados em Java orientada a objetos:<br>
° Vendas são efetuadas pela Dona Wolf em um determinado momento (indicado por uma data de entrega com hora).<br>
° Clientes são cadastrados com seu Nome, Endereço e Telefone podendo possuir mais de um Telefone.<br>
° Doces são cadastrados por Tipo, Características e Preço.<br>

# Interface
#TODO

# Troubleshooting

Caso o programa não esteja funcionando por conta do lombok, certifique-se de 
recarregar as dependências do Maven e no canto inferior direito habilitar as 
configurações do lombok na caixa de pop-up dele.

# Integrantes
Augusto Poubell Ribeiro Pinheiro de Souza - 202103132881<br>
Bruno Blanco Coelho - 202203551515<br>
Carlos Henrique - 202212012125<br>
Phillipe Wolff de Souza dos Santos - 202404620123<br>
Vinicius Amador Velasco - 202203404083<br>