package ifsc.poo;
import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Navio {
    private int tamanho;
    private int x; // coluna da grade
    private int y; // linha da grade
    private boolean vertical;

    public Navio(int tamanho, int x, int y, boolean vertical) {
        this.tamanho = tamanho;
        this.x = x;
        this.y = y;
        this.vertical = vertical;
    }

    public void desenhar(Draw draw) {
        int offsetX = 50;
        int offsetY = 50;

        for (int i = 0; i < tamanho; i++) {
            double centroX = (x * 40) + 20 + offsetX;
            double centroY;

            if (vertical) {
                centroY = ((y + i) * 40) + 20 + offsetY;
            } else {
                centroX = ((x + i) * 40) + 20 + offsetX;
                centroY = (y * 40) + 20 + offsetY;
            }

            // Preencher com cor do navio
            draw.setPenColor(new Color(153, 0, 0));
            draw.filledRectangle(centroX, centroY, 20, 20);

            // Agora mudar para cor preta e desenhar contorno
            draw.setPenColor(Color.BLACK);
            draw.rectangle(centroX, centroY, 20, 20);
        }
    }


}


