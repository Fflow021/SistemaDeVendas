# SistemaDeVendas
Projeto de faculdade de um sistema de vendas com interface SWING e backend em Java 17.
    
Através da Interface é possível fazer operações CRUD para 
um "Pedido".<br></br>
CREATE → Na aba de **Fazer um Pedido** um cliente pode criar um pedido na tela de 
produtos seus itens serão em carrinho e então numa tela de pedido 
o cliente pode finalizar seu pedido.

READ → Na aba de **Consultar ou alterar Pedidos**, um cliente pode ver todos os pedidos presentes
e buscar um pedido através de um ID, do pedido.

UPDATE → Na aba de **Consultar ou alterar Pedidos**, um cliente pode escolher um ID e trocar o 
meio de pagamento de um Pedido.

DELETE → Na aba de **Consultar ou alterar Pedidos**, um cliente pode escolher cancelar um pedido, 
passando o ID do Pedido.

# Tecnologias
- Java 17.
- Maven como gerenciador de dependências.
- Lombok para criação de código boilerplate.
- Swing para criação de Interface.
- Hibernate 5 para persistência de dados.
- MySQL 8 como banco de dados.

# Requisitos
- MySQL 8.
- Intellij Idea PRO ou Community Edition.
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
### Tela inicial
![MainScreen](https://github.com/Fflow021/SistemaDeVendas/blob/3520ce92c6d04f82d590a8d86c7a2cd81cc55220/assets/assetsFotosDaTela/MainScreen.png)
### Tela de compras
![AppScreen](https://github.com/Fflow021/SistemaDeVendas/blob/b76fd6064e57353fd152047b440e746d07808949/assets/assetsFotosDaTela/AppScreen.png)
### Tela para finalizar o pedido
![TelaDeCarrinho](https://github.com/Fflow021/SistemaDeVendas/blob/b76fd6064e57353fd152047b440e746d07808949/assets/assetsFotosDaTela/TelaDoCarrinho.png)
# Tela de Consulta, Deleção e Alteração de Pedidos
![TelaDeConsulta](https://github.com/Fflow021/SistemaDeVendas/blob/3520ce92c6d04f82d590a8d86c7a2cd81cc55220/assets/assetsFotosDaTela/RUDScreen.png)
# Troubleshooting

Caso o programa não esteja funcionando por conta do lombok, certifique-se de 
recarregar as dependências do Maven e no canto inferior direito habilitar as 
configurações do lombok na caixa de pop-up dele.

# Observações
Esse código não tem UM ÚNICO tratamento de exceções, então qualquer coisa 
fora do esperado o código VAI explodir.

# Integrantes
Augusto Poubell Ribeiro Pinheiro de Souza - 202103132881<br>
Bruno Blanco Coelho - 202203551515<br>
Carlos Henrique - 202212012125<br>
Phillipe Wolff de Souza dos Santos - 202404620123<br>
Vinicius Amador Velasco - 202203404083<br>