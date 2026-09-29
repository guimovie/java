import java.util.Random;

public class Craps {
    private static final int SEVEN = 7;
    private static final int ELEVEN = 11;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int TWELVE = 12;
    private static int sum;

    private enum Status {CONTINUE, WON, LOST}

    public static int rollDice() {
        Random random = new Random();
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);
        sum = die1 + die2;

        System.out.printf("Lançou %d + %d = %d\n", die1, die2, sum);
        return sum;
    }

    public static void main(String[] args) {
        Status gameStatus = Status.CONTINUE;
        int myPoint = 0;

        System.out.println("================ Jogo de Craps ==================");
        System.out.println("Regras:");
        System.out.println("1º lançamento: 7 ou 11 = VITÓRIA");
        System.out.println("1º lançamento: 2, 3 ou 12 = DERROTA");
        System.out.println("Outro valor = PONTO");
        System.out.println("Depois, tire o PONTO para ganhar ou 7 para perder");
        System.out.println("=================================================");

        int sum = rollDice();
        
        switch (sum) {
            case SEVEN:
            case ELEVEN:
                gameStatus = Status.WON;
                break;
            case TWO:
            case THREE:
            case TWELVE:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sum;
                System.out.printf("Ponto definido: %d\n", myPoint);
                System.out.println("Continue jogando...");
                break;
        }

        while (gameStatus == Status.CONTINUE) {
            sum = rollDice();
            
            if (sum == myPoint) {
                gameStatus = Status.WON;
            } else if (sum == SEVEN) {
                gameStatus = Status.LOST;
            }
        }

        System.out.println("=========================================");
        if (gameStatus == Status.WON) {
            System.out.println(" PARABÉNS! VOCÊ GANHOU! ");
        } else {
            System.out.println(" QUE PENA! VOCÊ PERDEU! ");
        }
        System.out.println("=========================================");

    }
}
