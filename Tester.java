import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Tester
{
    public static final void main(String args[])
    {
        int generation = 0;
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        GameofLife game = new GameofLife(rows, columns);
        game.buildRandomBoard();
        for(int i = 0; i < 2; i--)
        {
            for(int j = 0; j < 100; j++)
            {
                System.out.println("");
            }
            
            System.out.println(game);
            game.nextGen();
            generation++;
            System.out.println("Generation: " + generation);
            try {
              Thread.sleep(100);
            } catch (InterruptedException ie) {
                //Handle exception
            }       
        }
    }
}