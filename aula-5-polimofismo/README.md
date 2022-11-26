# LISTA DE EXERCÍCIOS – AULA 5: Polimofismo

**1. Descreva, com suas palavras, o que é polimorfismo e como os mecanismos de herança e sobrecarga atuam no polimorfismo.**
> O polimofirmo é a denominação dada aos casos onde métodos tem formas diferentes mesmo que tenha a mesma assinatura. E a *sobreescrita* se dá quando o metodo tem a mesma assinatura mas com o funcionamento diferente. Já a **sobrecarga** se dá quando uma subclasse (ou seja - uma classe "filho" que herda atributos e metodos da classe "pai) implementa o mesmo metodo da superclasse e a sobrecarga realiza o trabalho de diferenciar cada metodo de cada classe. 


**2. Explique o que é ligação tardia. Qual o papel da ligação tardia na implementação do polimormismo? Escreva um pequeno programa que exemplifica o uso de ligação tardia e ganhe meiopontoextra.** 
> É quando a decisão de qual método será usado (da superclasse ou das suas subclasses) é tomada no tempo de execução do método, utilizando o sistema de endereçamento da memória para decidir isso, a ligação tardia serve fazendo o polimorfismo se tornar eficiente. Por exemplo:

<pre>
public class Main {
	public static void main(String[] args) {
		Animal fuinha = new Fuinha();
		Animal cachorro = new Cachorro();
		fuinha.brincar();
		cachorro.brincar();
	}
}

public class Animal {
	public void brincar() {
		System.out.println("...");
	}
}

public class Fuinha extends Animal{
	public void brincar() {
		System.out.println("*rola no chão e corre em circulos*");
	}
}

public class Cachorro extends Animal{
	public void brincar() {
		System.out.println("*corre atras da bolinha*");
	}
}
</pre>

**3. O que são coerção, upcasting e downcasting? Fale da sua relação com os conceitos de superclasse e subclasse. Escreva um pequeno programa exemplificando coerção, downcasting e upcastingparaganhar meio ponto extra.** 
>  Coerção ou casting é fazer um objeto se converter por outro tipo que não seja o dele.

>  Upcasting é fazer um objeto se passar por um supertipo de outro objeto

>  Downcasting é fazer um objeto se passar por um subtipo de outro objeto.

<pew> 
public class Main { 
	public static void main (String[]args){ 
		Forma circulo = new Circulo (); 
		circulo.Desenhar (); 
		UpCasting (); 
		DownCasting (); 
	} 
	private static void UpCasting (){ 
		Circulo circulo = new Circulo (); 
		Forma f = circulo; 
		System.out.println (f == circulo); 
		f.Desenhar (); 
	} 
	private static void DownCasting (){ 
		Circulo circulo = new Circulo (); Forma f = circulo; //upcasting -> implicita 
		Circulo c = (Circulo) f; //downcast -> explicita 
		c.PintarCirculo (); c.Desenhar (); 
		System.out.println (c == f); 
		System.out.println (c == circulo); 
	} 
} 
class Forma{ 
	public void Desenhar (){ 
		System.out.println ("Forma"); 
	} 
} 
class Circulo extends Forma{ 
	@Override 
	public void Desenhar (){ 
		System.out.println ("Desenhar Circulo"); 
	} 
	public void PintarCirculo (){ 
		System.out.println ("Pintando o Circulo"); 
	} 
}
</pre>

**4. Crie uma classe Sort, que contém um método concreto sort( int array[] ), que ordena um array de inteiros (use o bubble sort, por exemplo). Depois crie duas classes, MergeSort e QuickSort, que estendem de Sort e implementam seus próprios algoritmos de ordenação: merge sort equicksort,respectivamente. Crie um programa que teste qual desses métodos de ordenação é o mais rápido,considerando que um array grande (digamos, uns 100 mil elementos) já ordenado é fornecidocomoentrada e ganhe um ponto extra.**
>

**5. Pesquise sobre motores de jogos orientados a objetos (Unity, Unreal Engine 4, CryEngine3, etc). Escolha um motor de sua preferência e explique como o mecanismo de polimorfismo éusadoparatratar eventos no laço do jogo. Caso prefira algo fora do escopo de games, escolha umframeworkde interface gráfica com o usuário (Java AWT, Java Swing, wxWidgets, Qt, etc) escritoemumalinguagem orientada a objetos e explique como esse framework usa o polimorfismo paratratareventos do usuário. Alternativamente, você pode explicar como o polimorfismo é usado no seu framework favorito.**
>
