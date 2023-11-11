import java.util.Scanner;

public class LacoDeRepeticao {
    public static void main(String[] args) {

// Laços de repetções FOR que realiza a repetição de uma determinada
// ação de acordo com um número determidado de execuções.
// for(atribuação; condicao; incremeto++){
        // exibe o contador
        //}

        Scanner scanner = new Scanner(System.in);

        double somadorNotas = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Insira uma nota");
            double nota = scanner.nextDouble();

            somadorNotas += nota;
        }

        double media = somadorNotas / 4;
        System.out.println(media);

    }
}