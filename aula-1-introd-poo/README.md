# LISTA DE EXERCÍCIOS – AULA 1: INTRODUÇÃO À ORIENTAÇÃO A OBJETOS

**1. Descreva, com suas palavras, o que são objetos e classes**
> Objetos são abstrações para representar a entidade que vai ser analisada. 
> Classes são as formas de definir um tipo de dado, "criando" um objeto, onde nessa classe é definido caracteristicas (atributos) e comportamentos (metodos). Essas classes podem ser abstradas (que não pode ser instanciada) e concretas (que podem ser instanciadas).

**2. Qual o propósito dos atributos na orientação a objetos?** 
> Definir e "modelar" os dados (a Classe) - ou seja - os objetos. Através desses atributos é possivel "setar" caracteristicas no objeto, bem como obter informações deste mesmo objeto. 
> Existem atributos de instancia (determinam o estado de cada objeto), de classe (o estado deste tipo de atributo é compartilhado por todos os objetos de uma classe), constantes (estão fora de qualquer métodos e não podem ser mudados).

**3. Para que servem os métodos na orientação a objetos?** 
> Os metodos são como funções, sub-rotinas executadas por um objeto ao ser chamado por um nome - assinatura. Esses metodos servem para definir comportamentos, ações, dos métodos e são descritos nas referidas classes. 

**4. Com suas palavras, explique o que é assinatura de um método.** 
> É uma forma única de identificar o metodo referido. É composto por nome do metodo + atributis

**5. Dê um exemplo de parâmetro implícito para métodos em orientação a objetos** 
> Um parâmetro implícito permite especificar o objecto que vai ser alvo da invocação do método. Exemplo:
<pre> public interface Teste { 
	void realizaTeste(); 
} </pre>
> No código acima no ´void realizaTeste();´ está implicito as linhas ´public abstract void realizaTeste();´

**6. O que são métodos construtores e destrutores? Cite exemplos práticos que motivamo usodessesmétodos** 
> Construtores: Métodos invocados no momento em que os objetos são criados. 
> Destrutores: Métodos invocados quando um objeto está para morrer (em geral, caso um objeto tenha recursos alocados, destrutores devem liberar tais recursos). 

**7. Desafio. Ainda sobre o jogo PAC-MAN no Fórum Aula 1 - Exercícios 1, projete as classes para os objetos identificados, destacando os seus nomes, os atributos e os métodos.** 
> 

**8. Desafio. Suponha que você esteja desenvolvendo uma biblioteca inovadora usando umalinguagemOrientada a Objetos, produto que será lançado no mercado pela sua startup unicórnio. Expliqueaimportância de usar um mecanismo que oculte detalhes de programação e informações sobrecomoos objetos na sua biblioteca funcionam. Qual a relação desse pequeno “segredo comercial”comcom os conceitos de encapsulamento e abstração?** 
>
