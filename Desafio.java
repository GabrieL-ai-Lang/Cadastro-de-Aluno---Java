import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        // sistema para a validação do campo de senha
        // nome, sobrenome, email, senha e confirme a senha. Se as senhas forem iguais exibir: " Cadastro realizado
        // com sucesso?: "Erro no cadastro@

        System.out.println("Olá, vamos fazer seu cadastro na nossa plataforma! ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobreNome = scanner.nextLine();

        System.out.println("Digite seu Email: ");
        String email = scanner.nextLine();

        System.out.println("Crie uma senha: ");
        String senha1 = scanner.nextLine();

        System.out.println("Confirme a senha: ");
        String senha2 = scanner.nextLine();

        System.out.println(senha1.equals(senha2) ? "Cadastro realizado com sucesso" : "Erro no cadastro, as senhas se divergem");

        System.out.println("Confime seus dados digitados: ");
        System.out.println("Seu nome" + nome + " " + "Sobrenome" + sobreNome + " " + "Email: " + email);
        String confirmacao = scanner.nextLine();

        System.out.println(confirmacao.equals("sim") ? "Òtimo seus dados foram confirmados em nosso sistema" : "Ok digite novamente seus dados");







    }
}
