
package ifsc.poo;

import edu.princeton.cs.algs4.Draw;


public class App {
    static Draw draw;

    public App(){
        this.draw = new Draw();
        this.draw.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        draw.setCanvasSize(1000, 600);         // Tamanho da janela: 1000x600 pixels
        draw.setXscale(0, 1000);               // Escala eixo X: de 0 a 1000
        draw.setYscale(0, 600);                // Escala eixo Y: de 0 a 600


    }

    // Método que desenha as duas grades (do jogador e do inimigo)
    public void desenhargrade(){

        Grade grade1 = new Grade(50, 50);
        grade1.desenhar(draw); //grade esquerda

        Grade grade2 = new Grade(550, 50);
        grade2.desenhar(draw); //grade direita

    }
    public static void main(String[] args) {
        App app = new App(); //cria e inicia
        app.draw.show(); //mostra janela
        app.desenhargrade(); //desenha duas grades

        // Criação manual dos navios com posição, tamanho e orientação
        Navio navio = new Navio(5, 3, 2, true);     // navio de 5 blocos, na vertical
        Navio navio1 = new Navio(4, 0, 0, false);   // navio de 4 blocos, na horizontal
        Navio navio2 = new Navio(2, 1, 8, false);   // navio pequeno horizontal
        Navio navio3 = new Navio(3, 5, 1, true);    // navio vertical de 3
        Navio navio4 = new Navio(3, 7, 5, true);    // outro vertical

        //desenha os navios na grade
        navio.desenhar(draw);
        navio1.desenhar(draw);
        navio2.desenhar(draw);
        navio3.desenhar(draw);
        navio4.desenhar(draw);
    }

}
