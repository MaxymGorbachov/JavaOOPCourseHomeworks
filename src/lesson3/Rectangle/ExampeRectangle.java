package lesson3.Rectangle;

/**
 * Created by Skipper on 21.05.2015.
 */
public class ExampeRectangle {

    public static void main(String[] args) {
        Rectangle abc = new Rectangle(5,15);

        char dash = '-', pipe = '|', space = ' ';

        abc.drawRectangle(dash,pipe,space);
    }
}
