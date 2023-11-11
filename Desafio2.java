public class Desafio2 {
    public static void main(String[] args) {

        double corredor1 = 60.00;
        double corredor2 = 10.00;
        double corredor3 = 90.00;


        if (corredor1 > corredor2 & corredor1 > corredor3) {
            System.out.println("O corredor um é o vencedor");
        } else if (corredor2 > corredor1 & corredor2 > corredor3) {
            System.out.println("Corredor 2 é o vencedor");
        } else {
            System.out.println("O corredor 3 é o vencedor");
        }
    }


}


