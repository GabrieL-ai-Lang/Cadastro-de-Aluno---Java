import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 0 a média

        double cont = 0;

        while (cont < 100) {
            System.out.println("Digite uma nota");
            double nota = scanner.nextDouble();
            cont += nota;
        }

        double media = cont / 4;
        System.out.println(media);


    }
}