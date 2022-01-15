package pl.kwec;

public class ChristmasTree {

    static void draw(char x, int h){

        for(int i=0; i<=h; i++){

            for(int y=0; y<=h-i;y++){
                System.out.print(" ");
            }
            for(int a=0;a<(2*i)-1;a++){
                System.out.print(x);
            }
            System.out.println("");
        }


    }
}
