# LISTA DE EXERCÍCIOS – Aula 6: Classes Abstratas e Interfaces

**1. Descreva, com suas palavras, o que são classes abstratas e interfaces. Explique sobre o papel e a utilidade desses elementos na POO.** 
> Classe abstrata pode ter construtor e precisa ter apenas 01 metodo abstrato (sem corpo). Ela é bastante usada para criar super classes, que posteriormente serão herdadas e terão seus metodos sobrescritos. Já as Interfaces são como uma cartilha de metodos e atributos, onde todos os metodos não possuem corpo. As interfaces são bastante usadas como uma forma de implementar herança multipla em C# e Java. 

**2. Quais são as semelhanças e diferenças entre classe abstrata e inteface? Produza uma tabela explicativa. Mostre como funcionam as notações em UML para classes abstratas e interfaces.**
> Em UML a Anotação se dá por <<Abstract>> ou <<Interface>>

|         Caracteristica         | Interface | Classe Abstrada                                
|:------------------------------:|:---------:|:---------------:
| Herança múltipla               |  Uma classe pode implementar diversas interfaces         |       Uma classe pode herdar somente uma classe   
| Implementação Padrão | Uma interface não pode conter qualquer tipo de código, muito menos código padrão.| Uma classe abstrata pode fornecer código completo, código padrão ou ter apenas a declaração de seu esqueleto para ser posteriormente sobrescrita. |                                                     
| Constantes | Suporte somente constantes do tipo estática. | Pode conter constantes estáticas e de instância. |    
| Componentes de terceiros | Uma implementação de uma interface pode ser incluída a qualquer classe de terceiros. | Uma classe de terceiros precisa ser reescrita para estender somente a partir da classe abstrata. |     
| Homogeneidade |     Se todas as diversas implementações compartilham a assinatura do método então a interface funciona melhor.   |  Se as várias implementações são todas do tipo e compartilham um comportamento e status comum, então a classe abstrata funciona melhor.               |  
| Funcionalidades Adicionais | Se você incluir um novo método em uma interface você precisa ajustar todas as implementações da interface. | Se você incluir um novo método em uma classe abstrata você tem a opção de fornecer uma implementação padrão para ele. |  
| Clareza | Todas as declarações de constantes em uma interface são presumidamente publicas ou estáticas. | Você pode por código compartilhado em uma classe abstrata. Você pode usar código para computar o valor inicial de suas constantes e variáveis de instância ou estáticas. |  
| Manutenção  | Se o código do seu cliente conversa somente em termos de uma interface, você pode facilmente alterar a implementação concreta usando um método factory. | Idêntico |  
| Velocidade | Lento, requer trabalho extra para encontrar o método correspondente na classe atual. | Mais rápido |  


**3. Suponha que estejamos desenvolvendo nosso próprio editor gráfico vetorial (Ex: Corel Draw, Inkscape, etc) com suporte ao desenho de múltiplas formas. Nesse editor, cada tipo deformapossui: 
	(a) um nome que identifica aquela forma; 
	(b) uma operação para desenhá-la natelae
	(c) outra operação para saber se um ponto (x,y) pertence àquela forma. 
Além disso, o editor suportainicialmente Círculos e Retângulos.**

<pre>
class Main { 
	public static void main(String[] args) { 
		Circulo c = new Circulo(2, 4); 
		c.desenha(c.getRaio(), c.getDiametro()); 
	}
} 
abstract class Forma { 
	public String nome; 
	
	public String getNome() {
		return nome; 
	}
	
	public void setNome(String nome) { 
		this.nome = nome; 
	} 
	
	void desenha(float x, float y) { }; 
	
	Boolean verificaForma(float x, float y) { 
		return true; 
	}; 
}

class Circulo extends Forma { 
	public float getRaio() { 
		return raio; 
	} 
	public void setRaio(float raio) { 
		this.raio = raio; 
	} 
	public float getDiametro() { 
		return diametro; 
	} 
	public void setDiametro(float diametro) { 
		this.diametro = diametro; 
	} 
	private float raio; 
	private float diametro; 
	public Circulo(float raio, float diametro) { 
		this.raio = raio; 
		this.diametro = diametro; 
		this.nome = "Circulo"; 
	}
	
	@Override 
	void desenha(float x, float y) { 
		if (verificaForma(x, y)) { 
			Circulo circulo = new Circulo(x,y); 
			System.out.println("desenha forma: "
						+ "\n forma = "+ circulo.getNome()
						+ " \n raio = "+ circulo.getRaio()+ " \n diametro ="+ circulo.getDiametro()
						+ ""); 
		} else { 
			System.out.println("não é um circulo"); 
		} 
	} 
	
	@Override 
	Boolean verificaForma(float x, float y) { 
		Float diametro = x * 2; 
		if (y == diametro) { 
			return true; 
		} else { 
			return false; 
		} 
	} 
}
	
</pre>

* Crie um diagrama UML explicando como pretende representar essas formas no seu programa.
* Implemente um pequeno programa a partir de seu diagrama UML e ganhe 1 ponto extra.

**4.Suponha que você esteja desenvolvendo um jogo para console usando uma linguagemOO. Nessejogo, há classes diferentes com suporte a itens, armas, skills, inventário, etc, todas concretaseespecializando as classes de um motor de jogo. Imagine que o jogo está quase pronto. De repente,o seu gerente de projetos lembra que o jogo precisa implementar salvamento e carregamento do estado do game.**
* Como você resolveria esse problema usando POO? Explique sua solução textualmente;
> 
* Use UML para expressar sua ideia; e
>
* Implemente um programa simples que exemplifique como sua solução funciona e ganhe 1 ponto extra.
