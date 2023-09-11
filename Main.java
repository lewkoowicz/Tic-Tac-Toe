import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] field = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.printf("| %c %c %c |%n", field[i][0], field[i][1], field[i][2]);
        }
        System.out.println("---------");

        int activePlayer = 0;
        boolean xxx = false;
        boolean ooo = false;
        int xs = 0;
        int os = 0;

        while (true) {
            System.out.print("Your turn: ");
            String x = sc.next();
            String y = sc.next();

            int value1 = Integer.parseInt(x) - 1;
            int value2 = Integer.parseInt(y) - 1;


            if (value1 < 0 || value1 > 2 || value2 < 0 || value2 > 2) {
                System.out.println("Wrong coordinates.");
                continue;
            }
            if (field[value1][value2] != ' ') {
                System.out.println("This cell is occupied. Choose another one.");
                continue;
            }
            if (activePlayer % 2 == 0) {
                field[value1][value2] = 'X';
                System.out.println("---------");
                for (int i = 0; i < 3; i++) {
                    System.out.printf("| %c %c %c |%n", field[i][0], field[i][1], field[i][2]);
                }
                System.out.println("---------");
                xs++;
            }
            if (activePlayer % 2 != 0) {
                field[value1][value2] = 'O';
                System.out.println("---------");
                for (int i = 0; i < 3; i++) {
                    System.out.printf("| %c %c %c |%n", field[i][0], field[i][1], field[i][2]);
                }
                System.out.println("---------");
                os++;
            }
            activePlayer++;

            for (int i = 0; i < 3; i++) {
                int row = 0;
                int clm = 0;
                int aDiag = 0;
                int bDiag = 0;

                for (int j = 0; j < 3; j++) {
                    row += field[i][j];
                    clm += field[j][i];
                    aDiag += field[j][j];
                    bDiag += field[j][2 - j];
                }

                xxx = xxx || row == 264 || clm == 264 || aDiag == 264 || bDiag == 264;
                ooo = ooo || row == 237 || clm == 237 || aDiag == 237 || bDiag == 237;
            }

            if (xxx) {
                System.out.println("X wins");
                break;
            }
            if (ooo) {
                System.out.println("O wins");
                break;
            }
            if (xs + os == 9) {
                System.out.println("Draw");
                break;
            }
        }
    }
}
