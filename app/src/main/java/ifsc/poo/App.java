
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

        Grade grade = new Grade(50,50);
        grade.desenhar(draw);


    }
    public static void main(String[] args) {
        App app = new App();
        app.draw.show();
        app.iniciar();

        Navio navio = new Navio(5, 3, 2, true); // x=3, y=2, tamanho=5, vertical
        navio.desenhar(draw);
    }

}
