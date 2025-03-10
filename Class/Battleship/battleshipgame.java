package Battleship;
import java.util.Random;
import java.util.Scanner;

public class battleshipgame {
    public static final int size = 10;
    public static int ship = 6;
    public static int shot = 12;

    public static void show(int[][] matrix, boolean isCheat)
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if (isCheat) System.out.print(matrix[i][j] + "\t");
                else if (matrix[i][j]  == -1 || matrix[i][j] == -2) System.out.print("* ");
                else System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int isCounted (int[][] matrix, int x, int y)
    {
        int cout = 0;
        int xlow = x > 0 ? x - 1 : 0;
        int xup = x < size - 1 ? x + 1 : size - 1;
        int ylow = y > 0 ? y - 1 : 0;
        int yup = y < size - 1 ? y + 1 : size - 1;
        for (int i = xlow; i <= xup; i++) {
            for (int j = ylow; j <= yup; j++) {
                if(matrix[i][j] == -1) {
                    cout++;
                }
            }
        }
        return cout;
    }

    public static void fire(int[][] matrix, int x, int y)
    {
        if (matrix[x][y] == -1)
        {
            matrix[x][y] = 10;
            ship--;
        }
        else {
            System.out.print("There are " + isCounted(matrix, x, y) + " ships around the shooting area.\n");
        } shot--;
    }

    public static int getStatus()
    {
        if (ship == 0) return 1;
        if (shot == 0) return -1;
        else return 0;
    }

    public static void play(int[][] matrix)
    {
        Scanner sc = new Scanner(System.in);
        initShip(matrix);
        while (getStatus() == 0)
        {
            show(matrix, true);
            System.out.print("x = ");
            int x = sc.nextInt() -1;
            System.out.print("y = ");
            int y = sc.nextInt() -1;
            fire(matrix, x, y);
            if (getStatus() == 1)
                System.out.print("Congratulation! You have  eliminated all the foes!");
            if (getStatus() == -1)
                System.out.print("You have run out of ammonition. You lost!");
        }
    }

    public static void initShip(int[][] matrix)
    {
        Random rand = new Random();
        int sRow, sCol;
        for (int i = 0; i < ship; i++)
        {
            sRow = rand.nextInt(size-1);
            sCol = rand.nextInt(size-1);
            if (matrix[sRow][sCol] == -2) matrix[sRow][sCol] = -1;
        }
    }

    public static void main(String[] Arg)
    {
        int[][] game = { {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
                         {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
                         {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
                         {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
                         {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
                         {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
                         {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
                         {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
                         {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
                         {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2},
        };

        play(game);
    }
}