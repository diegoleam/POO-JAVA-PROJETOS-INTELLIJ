package animal;

import java.util.Scanner;

public class CadastraCachorro {

    public static void main (String []args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("DIGITE O NOME DO CACHORRO");
        String nome = scanner.nextLine().trim();

        System.out.println("DIGITE A RAÇA DO CACHORRO");
        String raca = scanner.nextLine();

        System.out.println("DIGITE A COR DO CACHORRO");
        String cor = scanner.nextLine();

        System.out.println("DIGITE O PESO DO CACHORRO");
        double peso = scanner.nextDouble();

        System.out.println("DIGITE A IDADE DO CACHORRO");
        int idade = scanner.nextInt();

        // cria objeto cachorro1
        Cachorro cachorro1 = new Cachorro(cor, nome, raca, idade, peso);


        cachorro1.info();

        cachorro1.alerta();


    }

}
