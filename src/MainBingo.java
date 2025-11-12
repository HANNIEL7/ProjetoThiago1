import java.util.Scanner;

public class MainBingo{
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Bingo bingo = new Bingo();

    int opcao;

    do{
        System.out.println("\n ===Jogo de Bingo ===");
        System.out.println("1 -Sortear um novo numero ");
        System.out.println("2 -exibir numeros já sorteados ");
        System.out.println("0 -Sair ");
        System.out.println ("Escolha uma opcao: ");

        opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                int numero = bingo.sortearNumero();
                if (numero == -1){
                    System.out.println("Numero já sorteado");
                }
                break;
            case 2:
                System.out.println("Numeros sorteados até agora"+ bingo.getNumerosSorteados());

                break;
            case 0:
                System.out.println("Encerrando o jogo até a próxima");
            break;
        default:
            System.out.print("Opção inválida tente novamente");
        }




    }while(opcao != 0);

    scanner.close();}
}