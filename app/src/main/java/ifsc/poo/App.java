
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
    //desenha a grade
    public void iniciar(){

        Grade grade1 = new Grade(50, 50);
        grade1.desenhar(draw);

        Grade grade2 = new Grade(550, 50);
        grade2.desenhar(draw);

    }
    public static void main(String[] args) {
        App app = new App();
        app.draw.show();


        //fiz os navios manualmente
        Navio navio = new Navio(5, 3, 2, true);// x=3, y=2, tamanho=5, vertical
        Navio navio1 = new Navio(4, 0, 0, false);
        Navio navio2 = new Navio(2, 1, 8, false);
        Navio navio3 = new Navio(3, 5, 1, true);
        Navio navio4 = new Navio(3, 7, 5, true);
        navio.desenhar(draw);
        navio1.desenhar(draw);
        navio2.desenhar(draw);
        navio3.desenhar(draw);
        navio4.desenhar(draw);

        app.iniciar();
    }

}
