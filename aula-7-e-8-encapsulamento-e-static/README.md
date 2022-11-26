# LISTA DE EXERCÍCIOS – Aulas 7 e 8: Encapsulamento e Static

**1. Usando suas palavras:**
* descreva o que é encapsulamento, com o foco emsuas vantagens;
> Encapsulamento é um mecanismo pelo qual podemos “esconder” atributos e métodos de uma classe para que não fiquem acessíveis a outras classes, permitindo separar partes funcionais do abjeto de sua interface acessível. A maior vantagem é segurança na codificação mantendo o código integro a fim de que uma classe não use erroneamente um atributo ou método de outra.
* explique porque essa é uma qualidade desejada em sistemas do mundo real; e 
> Essa qualidade nos permite ter abstração de como os objetos interagem, como o exemplo visto em sala do carro onde todos nós sabemos as funcionalidades de um carro porém não necessariamente sabemos como as peças internas interagem para que as ações sejam realizadas.
* cite dois exemplos que não estão no material visto em aula.
> Num programa de sinalização (por exemplo, de escola) poderia ter um metodo tocar(sino) ao inves de modificar o atributo diretamente. 
> Num software de biblioteca para mudar o status de um livro o ideal seria chamar um setStatus() do que ir diretamente no atributo e modificar. 

**2. Explique os seguintes conceitos:**
* Permissões de acesso public, protected e private. Cite um exemplo no qual você usaria private;
	>Public: é o modificador de acesso que diz que qualquer um pode acessar aquele atributo ou método
	> Private : é o modificador de acesso que diz que o atributo ou método só poderá ser utilizado internamente pela classe.
	> Protected: indica que apenas as subclasses podem acessar aquele método ou atributo. Exclusivamente em JAVA classes de um mesmo pacote também podem ter acesso.
	* Métodos getters e setters; e
	> métodos getters e setters são utilizados para que as classes não acessem diretamente as propriedades do objeto. Estes são geralmente métodos públicos que permitem a mudança 
	* Usando a linguagem de programação da sua escolha, escreva um programa que exemplifique os conceitos e ganhe 1 ponto extra.
	> Voce pode acessar a aplicação [clicando aqui](https://github.com/VaneskaSousa/POO-UFC/tree/main/aula-7-e-8-encapsulamento-e-static/poo)

**3. Responda:
* O que são atributos e métodos de classe (static)? 
> Atributo estático é um estado que vive na classe. Por conta disso, sempre que você cria um novo objeto dessa classe, eles possuem o mesmo valor para o atributo. Geralmente é usado para constantes. Método estático também é um método que vive na classe.
* Qual a necessidade deles? Cite dois exemplos. 
> Compartilhar atributos e metodos com todas as classes filhos. Por exemplo num sistema de banco onde todas as contas bancarias devem ter saldo, tipo de conta e metodos de extrato e saque. 
* Crie um pequeno programa ilustrando seus exemplos com pelo menos 1 método de classe e 1 atributo de classe, ganhando meio ponto extra para cada exemplo.**

**4. Implemente uma classe Usuario que:**
* Possua um identificador inteiro único (um “CPF”, atributo de instância), i.e., jamais duasinstâncias de Usuario devem possuir o mesmo identificador;
* O identificador deve ser gerado no momento da chamada ao construtor da classe Usuario;
* A geração do identificador deve ser sequencial, ou seja, primeira instância deve ter identificador1, já a segunda instância deve ter identificador 2; e
* Após a instanciação, objetos só podem fazer a leitura do identificador. Portanto, nãopodehaversubstituição do valor do atributo identificador após instanciação.
