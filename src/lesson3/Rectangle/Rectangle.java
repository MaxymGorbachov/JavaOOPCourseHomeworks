package lesson3.Rectangle;

/**
 * Created by Skipper on 21.05.2015.
 */
public class Rectangle extends Figure {

    public int height,weight;

    public Rectangle (int height,int weight){
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double square(){
        return height * weight ;
    }

    public void drawRectangle(char dash,char pipe,char space){

        char[][] rectangle = new char[height][weight];

        for (int i = 0; i < height;i++){
            for (int j = 0;j < weight;j++){
                if (i == 0 || i == (height-1)){
                    rectangle[i][j] = dash;
                } else if (j == 0 || j == (weight-1)){
                    rectangle[i][j] = pipe;
                }else {
                    rectangle[i][j] = space;
                }
            }
        }

        for (int i = 0; i < height;i++){
            for (int j = 0;j < weight;j++){
                System.out.print(rectangle[i][j]);
            }
            System.out.println();
        }

    }
}
