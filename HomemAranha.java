public class HomemAranha {

  public static void main(String[] args) {

    // Declaração das variáveis
    int nivelCrime = 9;
    boolean temProvaHoje = true;
    boolean tioHappyLigou = false;
    int horaDoDia = 10;

    // Exibindo informações
    System.out.println("Nivel de crime: " + nivelCrime);
    System.out.println("Tem prova hoje: " + temProvaHoje);
    System.out.println("Tio Happy ligou: " + tioHappyLigou);
    System.out.println("Hora do dia: " + horaDoDia);

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
  }
}