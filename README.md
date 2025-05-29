Questão:

você comprou um novo lapTopGamer e gosta de jogar nele o dia todo.Devido ao alto uso de gráficos ele precisa ser carregado frequentemente. Agora você quer saber quanta bateria restara após uma sequencia de eventos de uso e carregamento.
Problema:

Escreva uma função que recebe n registro representando o consumo de bateria e os eventos de carregamento.
  * Um valor positivo indica minutos carregando o lapTop
  * Um valor negativo indica minutos jogando(o lapTop consome 1% de bateria por minuto)
  * A bateria não pode ultrapassar 100%.
  * A carga inicial é 50%.
   
 Afunção deve retornar a porcentagem final da bateria após todos os eventos.
    Exemplo:
Entrada:
  n=4
eventos = [10,-20,61,16];

  Processo:
  
1. carga inicial 50%.
2. Evento[0]  ->10minutos -> 50%-10%=60%
3. Evento[1] ->20minutos jogando -> 60% -20% = 40%
4. Evento[2]  ->61minutos carregando -> 40% + 61% = 100%(limite maximo)
5. Evento[3]  ->15minutos jogando ->100% -15% = 85%

Saída esperada:
85

Descrição da função:
Complete a função getBattery, que deve retornar um numero inteiro representando a porcentagem final da bateria.

Parâmetros:
 Eventos: uma lista de n números inteiros, onde cada elemento representa um evento de carregamento(+) ou consumo de bateria (-).
exemplo: eventos[eventos[0],... eventos{a-1}] uma matriz de números inteiros.
