# LISTA DE EXERCÍCIOS – AULA 3: Associações

**1. Descreva, com suas palavras, o que são:**

* uma associação entre classes;
> É uma conexão entre classes do qual os objetos de uma são conectados aos objetos da outra. Essa conexão pode ser unilateral ou bilateral, a depender da regra do negócio. Esse vínculo se torna efetiva a nível de código quando a instância de uma classe “conhece” a instância da outra. A nível de UML essa associação é representada por uma seta do qual aponta a direção da mensagem e, caso seja bilateral, basta fazer uma linha ligando as classes. Quando não há definição de associação entre classes significa que estas não devem se conhecer ou trocar mensagem em tempo de execução.
* uma agregação; e
> É quando uma das classes do relacionamento é parte ou está dentro/é componente da outra classe de um relacionamento. Exemplo: classe time e classe jogador. O Jogador é parte do time, logo existe uma agregação partindo de jogador para time com uma seta na ponta da classe time. 
* uma composição
> É uma versão mais radical da agregação onde a classe que é contida, ou seja, a agregada, não existe sem a classe agregadora. Por exemplo, uma classe de achados e perdidos e uma classe de objetos perdidos. A classe de achados e perdidos nao tem sentido em existir se nao houver objetos perdidos. 

**2. Quais são as propriedades que definem uma associação em UML? Descreva cada uma delas.**
> Nome: Significado semantico dado a associação que facilita a leitura e entendimento da relação.
> Direção de leitura: Indica como ler a associação e esclarece quem é o objeto-parte e o objeto-todo.
> Papel/papéis: Representa a finalidade, ou seja, o papel especifico em uma associação podendo haver mais de um. 
> Multiplicidade/cardialidade: especifica o numero de objetos ou classes envolvido com a associação

**3. Qual a importância das estruturas de dados na implementação de relações em código-fonte no mundo real?**
> Compreender bem as regras de négocio e planejar as relações antes mesmo de "cair na programação" é extremamente importante pois permite antecipar problemas,
> possiveis falhas de segurança e construir uma arquitetura mais assertiva evitando retrabalho no futuro. A estrutura de dados permite pensar com antecedencia nos metodos de acesso, comunicação com usuario e, principalmente, permite ao projetista conseguir tomar decisões a nivel de tecnologia ou ajustes de négocio com mais informação.

**4. Cite três exemplos de associação reflexiva. Codifique um dos exemplos citados e ganhe um ponto extra!**
> 1. Funcionario que gerencia outros funcionários;
> 2. Listagem de produtos relacionados (produto semelhante a produto)
> 3. Cadeira (da faculdade) é pré-requisto para outra cadeira.

**5. Implemente um programa simples que contenha:**
* Pelo menos 3 classes, as quais devem possuir pelo menos 1 atributo e 1 método cada; 
* Pelo menos uma relação de agregação. Construa seu programa de modo que pelo menos método de um tipo agregado (parte) seja usado pelo todo para ganhar meio ponto extra;
* Pelo menos uma relação de composição. Use pelo menos um método do usado na composição(parte) seja usado pelo todo para ganhar meio ponto extra.

> **Repositorio do projeto acima em [aula-3-associacoes](https://github.com/VaneskaSousa/POO-UFC/tree/main/aula-3-associacoes/associacoes/src/associacoes).**
