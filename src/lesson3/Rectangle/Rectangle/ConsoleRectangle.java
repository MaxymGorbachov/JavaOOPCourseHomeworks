package lesson3.Rectangle.Rectangle;

/**
 * Created by Skipper on 22.05.2015.
 */
import java.util.Scanner;

public class ConsoleRectangle {
    public static void main(String[] args) {
        int height,weight;
        char pipe = '|';
        char dash = '-';
        char space = ' ';

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height ; ");
        height = sc.nextInt();
        System.out.println("Enter Weight ; ");
        weight = sc.nextInt();
        System.out.println("Rectangle: "+height+"X"+weight);


        for ( int i = 0;i <= height - 1; i++){
            if (i == 0 || i == height -1)
                for (int j = 0; j <= weight -1; j++){
                    System.out.print(dash);
                }
            else if (i > 0 || i < height-1 ){
                for (int k = 0; k <= weight-1; k++){
                    if (k == 0 || k == weight-1){
                        System.out.print(pipe);
                    } else {
                        System.out.print(space);
                    }
                }
            }
            System.out.println();
        }
    }
}
