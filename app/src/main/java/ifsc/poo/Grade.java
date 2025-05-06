
package ifsc.poo;
import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Grade {
    private double x; //posição inicial de x
    private double y; //posição inicial de x
    private double tamanhoCelula = 40; //tamanho do quadrado 40x40


    //constroi a grade
    public Grade(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //desenha a grade completa
    public void desenhar(Draw draw) {
        draw.setPenColor(Color.BLACK); //cor preta

        // Desenha os quadrados da grade 10x10
        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                //vai para o quadrado certo, depois centraliza ele (+20, que seria a divisão)
                double cx = x + coluna * tamanhoCelula + tamanhoCelula / 2;
                double cy = y + linha * tamanhoCelula + tamanhoCelula / 2;

                // Desenha o quadrado (só o contorno)
                draw.rectangle(cx, cy, tamanhoCelula / 2, tamanhoCelula / 2);
            }
        }

        // Rótulos de linhas (A a J)
        for (int i = 0; i < 10; i++) {

            char letra = (char) ('A' + i);
            draw.setPenColor(new Color(153, 0, 0)); // mesma cor dos rótulos (vermelho escuro)
            draw.text(x - 10, y + i * tamanhoCelula + tamanhoCelula / 2, "" + letra);
        }

        // Rótulos de colunas (0 a 9)
        for (int i = 0; i < 10; i++) {
            draw.setPenColor(new Color(153, 0, 0)); // mesma cor dos rótulos (vermelho escuro)
            draw.text(x + i * tamanhoCelula + tamanhoCelula / 2, y - 10, "" + i);
        }
    }
}