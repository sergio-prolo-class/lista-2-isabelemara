
package ifsc.poo;
import edu.princeton.cs.algs4.Draw;

public class Grade {
    private double x;
    private double y;

    public Grade(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desenhar(Draw draw) {
        int tamanhoCelula = 40;

        // Desenha as linhas horizontais
        for (int i = 0; i <= 10; i++) {
            double yLinha = y + i * tamanhoCelula;
            draw.line(x, yLinha, x + 10 * tamanhoCelula, yLinha);
        }

        // Desenha as colunas verticais
        for (int i = 0; i <= 10; i++) {
            double xColuna = x + i * tamanhoCelula;
            draw.line(xColuna, y, xColuna, y + 10 * tamanhoCelula);
        }

        // Rótulos de linhas (A a J)
        for (int i = 0; i < 10; i++) {
            char letra = (char) ('A' + i);
            draw.text(x - 10, y + i * tamanhoCelula + tamanhoCelula / 2, "" + letra);
        }

        // Rótulos de colunas (0 a 9)
        for (int i = 0; i < 10; i++) {
            draw.text(x + i * tamanhoCelula + tamanhoCelula / 2, y - 10, "" + i);
        }
    }
}