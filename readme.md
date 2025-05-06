[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/KKrNRA9P)

Aluno(a): Isabele M. Batisti
Lista 2


🛥️ Projeto Batalha Naval em Java:
Esse projeto é uma simulação simples de Batalha Naval feita em Java, usando a biblioteca algs4 do Princeton para desenhar tudo na tela. A ideia é criar duas grades (uma do jogador e outra do oponente) e posicionar navios nelas.

🗂️ Arquivos e o que cada um faz
O projeto tem três classes principais:

App.java: é a classe principal, onde o programa começa a rodar.

Grade.java: desenha a grade (ou tabuleiro) onde os navios vão ficar.

Navio.java: representa o navio e é onde a gente desenha ele na grade.

🔧 Classe App.java:
Essa é a classe principal, onde tudo começa.

Construtor App()
Aqui criamos o objeto Draw que é da biblioteca algs4.

A tela é configurada para 1000x600 pixels.

A escala X vai de 0 até 1000 e a Y vai de 0 até 600, então a gente pode desenhar com coordenadas "normais".

Método desenhargrade()
Aqui criamos duas grades:

Uma começa na posição (50, 50) (lado esquerdo).

A outra começa em (550, 50) (lado direito).

Ele chama o método desenhar() da classe Grade para desenhar a grade.

Método main()
Primeiro criamos a janela e chamamos o desenhargrade().

Depois, criamos 5 navios manualmente, com posições e tamanhos diferentes.

Cada navio é desenhado usando o método desenhar() da classe Navio.

🎯 Classe Grade.java:
Essa classe serve para desenhar a grade 10x10.

Atributos:
x e y: posição de onde a grade começa (canto superior esquerdo).

tamanhoCelula: cada quadrado tem 40x40 pixels.

Método desenhar()
Desenha todos os quadradinhos da grade usando dois for (um para linha e outro para coluna).

Cada quadrado é desenhado com um retângulo vazio (só o contorno).

Depois ele escreve as letras (A até J) nas linhas e os números (0 a 9) nas colunas.

Os rótulos são desenhados na mesma cor dos navios (vermelho escuro) pra ficar estiloso.

🚢 Classe Navio.java:
Essa classe representa um navio do jogo.

Atributos:
tamanho: quantas células o navio ocupa.

x e y: posição inicial do navio.

vertical: se é true, o navio é desenhado pra baixo; se for false, vai para a direita.

Método desenhar()
Para cada parte do navio:

Calcula onde o centro do quadrado vai ficar (usando a posição inicial e o tamanho da célula).

Desenha um quadrado vermelho escuro (filledRectangle).

Depois, desenha o contorno preto (rectangle) para a grade continuar aparecendo por cima.

💬 Observações Finais:
Como os navios são preenchidos com cor, eles escondem a grade. Por isso, eu desenhei um contorno preto depois de preencher, pra dar aquele efeito de "navio dentro da grade".

A posição dos navios é feita manualmente, mas daria pra fazer aleatório também.

A biblioteca Draw é bem simples, mas funciona bem pra esse tipo de projeto visual.


