/*
SQLyog Community v13.1.1 (64 bit)
MySQL - 5.7.21 : Database - quiz
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`quiz` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `quiz`;

/*Table structure for table `quiz` */

DROP TABLE IF EXISTS `quiz`;

CREATE TABLE `quiz` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pergunta` varchar(300) NOT NULL,
  `a` varchar(300) NOT NULL,
  `b` varchar(300) NOT NULL,
  `c` varchar(300) NOT NULL,
  `d` varchar(300) NOT NULL,
  `opcaocorreta` varchar(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=latin1;

/*Data for the table `quiz` */

insert  into `quiz`(`id`,`pergunta`,`a`,`b`,`c`,`d`,`opcaocorreta`) values 
(1,'Qual é a melhor linguagem de programação para lidar com redes e internet?','c','c++','php','python','c'),
(2,'-Nas diversas linguagens de programação existem, palavras reservadas. Na linguagem Java não é diferente, o compilador reconhece essas palavras como especiais. Por essa razão, você não pode usá-las para nomear suas construções Java. Marque a alternativa que não apresenta palavras reservadas:','native, const, extends','catch, finally, super.','assertive, level, broker.','transient, volatile, catch.','d'),
(3,'Analise as assertivas a seguir sobre as linguagens Python, HTML5, PHP e Java. I - Python é uma linguagem de programação de alto nível, compilada e imperativa. II - HTML5, ou HTML versão 5, é uma linguagem de marcação para documentos web. III - A linguagem PHP é uma linguagem interpretada, capaz de g','Está correta somente a assertiva IV.','Estão corretas somente as assertivas I, III e IV.','Estão corretas somente as assertivas I e II.','Estão corretas somente as assertivas II, III e IV.','a'),
(4,'O JSP é uma tecnologia que permite que o código Java seja embarcado nas páginas web por meio de scriptlets. No entanto, para que esse código possa ser executado,','o servidor utiliza um interpretador Java especial que dispensa o processo de compilação','a página JSP é convertida em Servlet e compilada.','ele é convertido em JavaScript, que é suportado pela maioria dos navegadores web.','todo código associado à página é convertido em um único scriptlet que é devidamente interpretado pelo navegador web antes de exibir o conteúdo da página.','d'),
(5,'Herança e interfaces são conceitos da orientação a objetos que possibilitam a obtenção de polimorfismo. Em Java, uma interface pode','herdar de mais de uma interface','ser instanciada diretamente por meio da instrução new.','possuir apenas assinaturas de métodos públicos e protegidos.','possuir métodos abstratos e estáticos.','b'),
(6,'A respeito de Java, assinale a alternativa INCORRETA.','Toda classe é uma subclasse direta ou indireta da classe Object.',') JCA (Java Connector Architecture) é uma API, que padroniza a ligação a aplicações legadas.','Quando contidos num arquivo fonte Java, os três elementos básicos devem obrigatoriamente se apresentar na seguinte ordem: package, import e class.','Boolean, byte, char, date, float, int, long e short são os 8 tipos primitivos em Java','b'),
(7,'- Qual o modificador de acesso que deve ser utilizado em Java quando se deseja que alguns detalhes da implementação não sejam compartilhados com classes do mesmo pacote, mas ainda se deseja que suas subclasses possam herdá-los?','Package.','Protected.','Private.','Private protected.','d'),
(8,'No Java, é uma interface que não permite elementos duplicados e modela a abstração matemática de conjunto. Contém apenas métodos herdados da interface Collection e adiciona a restrição de que elementos duplicados são proibidos.',') List.','Set.','ArrayList.','Map.','a'),
(9,'Em um programa Java, considere a existência de uma variável do tipo long chamada cod contendo o valor 1234. Para passar o valor contido nessa variável para uma variável do tipo byte chamada codNovo, deve-se fazer casting. Para isso, utiliza-se a instrução: byte codNovo =','Byte.valueOf(cod);','(long) cod;','Byte.pasreByte(cod);','byte) cod;','d'),
(10,'Em Java, um bloco de código é:','Tudo que está entre ( )','Tudo que está entre { }','Tudo que está entre [ ]','Tudo que está entre < >','a'),
(11,'Uma exceção do tipo ClassNotFoundException será lançada quando não for encontrada na aplicação a classe','Statement.','Connection.','Driver.','DriverManager.','b'),
(12,'Na linguagem Java, o método executeQuery da interface Statement, envia uma instrução SQL select para o banco de dados e retorna, se a consulta for válida e uma conexão estiver estabelecida, um ou mais registros em um objeto da interface:','ResultSet.','ResultSetMetaData.','ResultSetQueryData.','PreparedStatement.','d'),
(13,'Sobre a programação na linguagem Java é correto afirmar:','Servlets são classes Java que executam em um servidor de aplicações. São utilizadas em aplicações para desktop que utilizam o pacote swing.','JavaServer Pages é uma tecnologia Java utilizada para embutir códigos de programação Java em páginas XML. Arquivos JSP executam no computador cliente.','As interfaces normalmente utilizadas para executar operações de conexão e manipulação de dados em um banco de dados relacional podem ser encontradas no pacote javax.swing.sql.','Na linguagem Java não existe tipos de dados primitivos. Todos os tipos de dados são objetos, por isso, é possível afirmar que Java é uma linguagem totalmente orientada a objetos','b'),
(14,'A exceção comum StackOverflowException, em uma applet, é causada quando a(o)','applet tenta executar uma ação não permitida pela configuração do browser.','applet tenta armazenar um tipo de dado incorreto em um array.','conversão entre strings e números gera uma falha.','espaço de pilha do sistema se esgota.','a'),
(15,'O comando break tem a função de','interromper a execução de um loop.','condicionar a execução de um comando de atribuição a um operador lógico.','segmentar a execução de um loop em duas ou mais partes aninhadas.','estabelecer um intervalo de depuração durante a execução de um loop.','a'),
(16,'São recursos disponibilizados pela IDE NetBeans, EXCETO','Servidores GlassFish, Tomcat e JBoss embutidos e integrados, além de drivers JDBC nativos para MySQL, Oracle, SQLServer e DB2.','Sistema de depuração em tempo de desenvolvimento que mostra os erros de digitação, variáveis e métodos não declarados ou inexistentes.','Importação automática de pacotes quando um componente do pacote for utilizado e sugestão de instruções por meio do recurso auto-completar.','Geração de blocos de códigos comumente utilizados como construtores, métodos getters e setters e se- paração dos diversos tipos de componentes do código por cores.','c'),
(17,'Para que o método opera execute a operação desejada na chamada ao método executeQuery é necessário que ele receba como parâmetro uma instrução DML SQL',') insert, update ou delete, apenas.','insert, update, delete ou select.','update, apenas.','select, apenas.','b'),
(18,'- Quando se utiliza JPA, um EntityManager mapeia um conjunto de classes a um banco de dados particular. Este conjunto de classes, definido em um arquivo chamado persistence.xml, é denominado','persistence context.','persistence unit.)','entity manager factory.','entity transaction.','c'),
(19,'Com relação ao jCompany, é correto afirmar:','Tem ancestrais em todas as camadas do MVC, realizando a comunicação \"interface-controle-modelo/persistência\" através de administração de pool de conexões e unidades lógicas de transação com o SGBD.',' Para desenvolver a parte decorativa do site, traz um assistente que possui look-and-fell com nomes como salmão, preto_e_branco etc. O único inconveniente é que essas configurações não podem ser externa- das em arquivos .css, sendo embutidas em bibliotecas de configuração com extensão .jcy.LL)','É um gerador de código automatizado de distribuição exclusivamente paga utilizado para criar a interface do Usuário utilizando CSS, Javascript, JSP e tag-libs.','O jCompany Full-Stack Framework - Community & International Version, é uma versão proprietária (de código fechado) da parte framework do jCompany.','c'),
(20,'Sobre o Tomcat é correto afirmar:','É um servidor de aplicação que fornece o ambiente necessário para a execução de aplicações Web desenvolvidas com as tecnologias Java Servlet e JSP.','É um software livre (mas de código fechado) para Windows, desenvolvido no projeto Apache Jakarta, que atualmente é definido como a Implementação de Referência (RI) para as tecnologias Java Servlet e JSP.','O Tomcat Manager não permite ao administrador visualizar as aplicações web instaladas, entretanto, permite verificar o status do servidor, instalar, desinstalar, iniciar, parar e recarregar uma aplicação web.','O Tomcat é o nome popular do servidor Web Apache HTTP Server que possui uma variedade de ferramentas capazes de lidar com qualquer tipo de solicitação na Web. Interpreta códigos desenvolvidos em diversas linguagens, como PHP, Perl, Shell Script, ASP etc.','d'),
(21,'Em uma aplicação Java que acessa banco de dados, as interfaces Connection, Statement e ResultSet devem ser importadas do pacote','java.jdbc.','java.beans.','javax.jdbc.','java.sql.','a'),
(22,'- Com relação a herança na programação orientada a objetos com Java, é INCORRETO ','Uma subclasse herda os métodos da superclasse, entretanto, pode ter seus próprios métodos.','Quando se instancia um objeto da subclasse, podem ser passados valores para os atributos da superclasse.','Quando se instancia um objeto da subclasse, podem ser passados valores para os atributos da superclasse.','Em uma superclasse, para acessar métodos da subclasse deve ser usada a instrução super.','a'),
(23,'- Para chamar o método soma da classe Calculo, e mostrar na tela o retorno desse método, é correto utilizar: ','Calculo c = new Calculo(); System.out.println (c.soma(10, 20, 30)); ou System.out.println (Calculo.soma(10, 20));','Exclusivamente as instruções Calculo c = new Calculo(); System.out.println (c.soma(10, 20));','Exclusivamente a instrução System.out.println (Calculo.soma(10, 20, 50));','Exclusivamente as instruções Calculo c = new Calculo(); double r = c.soma(10, 20); System.out.println(r);','b'),
(24,'- Em uma aplicação Java web desenvolvida em três camadas utilizando o design pattern MVC, é correto afirmar que:','As páginas HTML são representadas no componente Controller.','As servlets normalmente são representadas no componente View.','As classes que possuem atributos referentes aos campos das tabelas do banco de dados são representadas no componente Controller.','As classes DAO (que acessam o banco de dados) são representadas no componente Model.','c'),
(25,'Uma diferença entre classe e interface é que a classe','pode ter um campo de dados, enquanto a interface não.','pode ser implementada em uma interface, enquanto a interface não pode ser implementada em uma classe','é usada apenas em applets, enquanto a interface é usada apenas em aplicativos dedicados.','é catalogada em pacotes, enquanto a interface não.','d'),
(26,'Considerando a linguagem JAVA responda,qual método da classe Match retorna o menor número inteiro maior ou igual ao valor dado?','(NULL)a) valueOf()','b) random()',') floor()',') ceil()','a'),
(27,'Na linguagem Java, o comando continue tem a função de','fazer com que o comando de seleção seja inicializado.','permitir realçar a posição de determinados comandos','modificar a estrutura do loop, realçando procedimentos.','fazer com que a continuidade da execução de um loop fique condicionada a um teste de condição de continuidade.','c'),
(28,'- O código de um programa de computador escrito na linguagem Java é compilado para uma forma intermediária de código, que é interpretada pelas Máquinas Virtuais Java (JVMs). Esse processo apresenta portabilidade como grande vantagem. Essa forma intermediária é denominada:','bytecode',' firmware','assembler','microcode','d'),
(29,'- Sobre a linguagem de programação Java, podemos afirmar que ela é uma linguagem','com tipagem dinâmica e robusta.','fracamente tipada e orientada a objetos.','robusta e orientada a objetos.','com tipagem dinâmica e fracamente tipada.','d');

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(50) NOT NULL,
  `senha` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

/*Data for the table `usuario` */

insert  into `usuario`(`id`,`usuario`,`senha`) values 
(1,'a','1'),
(2,'jdeedes1','bx1AALY'),
(3,'tcullingworth2','jpLzERjcT'),
(4,'cpedreschi3','YdIG6TwA8lUE'),
(5,'bkemer4','v8S0PYP'),
(6,'zroach5','urCTsT9'),
(7,'hzemler6','oH3AqKHSp'),
(8,'mperago7','3uPdlT2EbNhb'),
(9,'vpaunsford8','S9xnotnd'),
(10,'fkment9','rwSPbj6p5XKA');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
