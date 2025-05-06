package ifsc.poo;
import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public class Navio {
    // Atributos do navio: tamanho, posição e orientação
    private int tamanho;
    private int x; // coluna da grade
    private int y; // linha da grade
    private boolean vertical; //vertical ou horizontal

    //constroi navio
    public Navio(int tamanho, int x, int y, boolean vertical) {
        this.tamanho = tamanho;
        this.x = x;
        this.y = y;
        this.vertical = vertical;
    }

    // Função para desenhar o navio na tela
    public void desenhar(Draw draw) {

        // Offset é onde a grade começa na tela
        int offsetX = 50;
        int offsetY = 50;

        // Para cada parte do navio (quantidade = tamanho)
        for (int i = 0; i < tamanho; i++) {
            // Começa calculando a posição do centro do quadrado
            double centroX = (x * 40) + 20 + offsetX;
            double centroY;

            // Se for vertical, soma na linha (y), senão, soma na coluna (x)
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


