# Aprenda Kotlin Com Exemplos: Desafio de Projeto (Lab)

Desafio de Projeto criado para avaliação do conteúdo técnico explorado no repositório [aprenda-kotlin-com-exemplos](https://github.com/digitalinnovationone/aprenda-kotlin-com-exemplos). **Nesse contexto, iremos abstrair o seguinte domínio de aplicação:**

**A [DIO](https://web.dio.me) possui `Formacoes` incríveis que têm como objetivo oferecer um conjunto de `ConteudosEducacionais` voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho. `Formacoes` possuem algumas características importantes, como `nome`, `nivel` e seus respectivos `conteudosEducacionais`. Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio, definido pela capacidade de `matricular` um ou mais `Alunos`.**


```kotlin
TODO("Crie uma solução em Koltin abstraindo esse domínio. O arquivo [desafio.kt] te ajudará 😉")
```

# Nesta solução, fiz as seguintes melhorias:

1- Adicionei o construtor à classe Usuario para inicializar o nome do usuário.
2- Implementei a função matricular na classe Formacao para adicionar usuários à lista de inscritos.
3- Verifico se o usuário já está inscrito antes de matriculá-lo novamente.
4 -Adicionei saídas de console para indicar o status das matrículas.

# Cenários de teste incluem:

1- Matricular um usuário em uma formação.
2- Tentar matricular o mesmo usuário novamente (duplicata).
3- Exibir a lista de inscritos na formação.
