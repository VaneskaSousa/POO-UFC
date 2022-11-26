# LISTA DE EXERCÍCIOS – Aulas 7 e 8: Encapsulamento e Static

**1. Usando suas palavras, (a) descreva o que é encapsulamento, com o foco emsuas vantagens; (b)explique porque essa é uma qualidade desejada em sistemas do mundo real; e (c) citedoisexemplos que não estão no material visto em aula. **
> 
**2. Explique os seguintes conceitos:**
	* Permissões de acesso public, protected e private. Cite um exemplo no qual você usaria private;
	>
	* Métodos getters e setters; e
	>
	* Usando a linguagem de programação da sua escolha, escreva um programa que exemplifique os conceitos e ganhe 1 ponto extra.

**3. O que são atributos e métodos de classe (static)? Qual a necessidade deles? Cite dois exemplos.Crie um pequeno programa ilustrando seus exemplos com pelo menos 1 método de classee1atributo de classe, ganhando meio ponto extra para cada exemplo.**
>

**4. Implemente uma classe Usuario que:**
* Possua um identificador inteiro único (um “CPF”, atributo de instância), i.e., jamais duasinstâncias de Usuario devem possuir o mesmo identificador;
* O identificador deve ser gerado no momento da chamada ao construtor da classe Usuario;
* A geração do identificador deve ser sequencial, ou seja, primeira instância deve ter identificador1, já a segunda instância deve ter identificador 2; e
* Após a instanciação, objetos só podem fazer a leitura do identificador. Portanto, nãopodehaversubstituição do valor do atributo identificador após instanciação.