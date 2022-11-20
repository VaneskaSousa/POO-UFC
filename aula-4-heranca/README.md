# LISTA DE EXERCÍCIOS – AULA 4: Herança

**1. Descreva, com suas palavras, o que é herança. Como é feita a notação em UML? Qual a vantagem de usar o mecanismo de herança ao invés de reuso de funções na programação estruturada?**
> Herança é um modo de estender classes que já existem no projeto de software, que adiciona novos atributos e metodos. A Anotação é feita com uma subclasse apontando uma seta para a superclasse, a herdando (estendendo). <br>
> Vantagem: Aprimora classes existentes, incluindo ou modificando métodos e atributo. Desta forma é possivel reutilizar código, reduzindo complexidade, facilitando a leitura e estruturando melhor a regra do negocio de maneira a ficar mais facil crescer em complexidade (adicionar subclasses, por exemplos).

**2. Explique os seguintes termos:**
* Superclasse e subclasse; e
> A Superclasse é a classe original, a que possui conceitos mais gerais. E a subclasse é a classe derivada, com objetivos mais especificos (especializada)
* Especialização e generalização.
> A Generalização são classes com atributos e métodos mais genéricos. Enquanto a especialização são classes mais especializadas derivadas das classes genéricas

**3 Explique o que são os mecanismos de sobrecarga (overload) e sobreposição (override) de métodos. Fale sobre a importância da sobrecarga para o programador de aplicações.**
> A sobrecarga são métodos com mesmo nome, mas as assinaturas são diferentes (os parâmetros que a função recebe. Não necessita de herança. Enquanto a sobreposição são métodos com mesmo nome e assinatura, porém sobrescritos, é utilizada geralmente com métodos virtuais e o método sobrescrito utiliza o `override`. Ela é importante pois permite o desenvolvedor criar variações de código com mais facilidade, poupando também a invenção de nomes para cada operação que compõem um mesmo escopo.

**4. Responda às seguintes perguntas sobre herança múltipla:**
* Quais são as desvantagens na sua utilização?
> A desvantagem ocorre quando o programa não sabe identificar se aquele método pertence à mesma classe, outra classe derivada ou superclasse. Fazendo com que o desenvolvedor tenha que tomar um cuidado extra, o que abre margem para mais erros acontecerem. 
* Pesquise sobre o “diamante da morte” (por exemplo, em C++). Exemplifique como esse problema pode ocorrer e como evitá-lo; e
> Esse problema ocorre pelo compilador não saber como se comportar quando encontrassem em uma classe herdada dois métodos herdados de classes diferentes com o mesmo nome. Como abaixo:
<pre>
public class jogador{
  public void drible (){
    System.out.println("Driblado");
  }
}

public class aspirante extends Jogador{}

public class SoftwareSample{
  public static void main(String[] args){
    Aspirante pessoa = new Aspirante(); 
    pessoa.drible();
  }
}
</pre>

* Mostre como funciona a herança múltipla em duas linguagens de programação e ganhe 1 ponto extra.
  * Java
<pre>  
public class Gerente extends Funcionario{
  //atributos e métodos
}
</pre>

  * C#
<pre>
public class Gerente: Funcionario{
  //atributos e métodos
}
</pre>

**5. Implemente um programa simples que ilustra o recebimento de documentos como entrada e os processa de acordo com o formato do arquivo. Por simplicidade, simule esse aspecto usando a saída de texto. Suponha que seu programa suporta os formatos PDF, DOC e ODS. Escreva seu programa de tal maneira que contenha:**
* Pelo menos 4 classes, as quais devem possuir pelo menos 1 método cada;
* Pelo menos 3 relações de herança com sobreposição de métodos, delegando cada tipo de documento a uma classe específica;
* Implemente o suporte a argumentos de linha de comando e ganhe 1 ponto extra.
