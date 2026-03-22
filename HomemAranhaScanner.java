import java.util.Scanner;

public class HomemAranhaScanner {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Entrada de dados
    System.out.print("Digite o nível de crime na cidade (0 a 10): ");
    int nivelCrime = scanner.nextInt();

    System.out.print("Peter tem prova hoje? (true/false): ");
    boolean temProvaHoje = scanner.nextBoolean();

    System.out.print("Tio Happy ligou pedindo ajuda? (true/false): ");
    boolean tioHappyLigou = scanner.nextBoolean();

    System.out.print("Digite a hora do dia (0 a 23): ");
    int horaDoDia = scanner.nextInt();

    System.out.println("\n--- Analisando a situação de Nova York ---");

    // Estrutura condicional
    if (nivelCrime > 7) {
      System.out.println("Decisão: Vestir o traje! Nova York precisa do Homem-Aranha!");

    } else if (tioHappyLigou) {
      System.out.println("Decisão: Os Vingadores chamaram! Hora de ajudar.");

    } else if (temProvaHoje) {
      System.out.println("Decisão: Hoje é dia de escola, Peter!");

    } else {
      System.out.println("Decisão: Patrulhar a cidade como o amigão da vizinhança!");
    }

    scanner.close();
  }
}