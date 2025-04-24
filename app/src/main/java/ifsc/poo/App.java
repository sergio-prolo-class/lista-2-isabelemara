
package ifsc.poo;

import edu.princeton.cs.algs4.Draw;


public class App {
    Draw draw;

    public App(){
        this.draw = new Draw();
        this.draw.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.draw.setCanvasSize(1000, 600);         // Tamanho da janela: 1000x600 pixels
        this.draw.setXscale(0, 1000);               // Escala eixo X: de 0 a 1000
        this.draw.setYscale(0, 600);                // Escala eixo Y: de 0 a 600

    }

    public static void main(String[] args) {
        App app = new App();
        app.draw.show();
    }

}
