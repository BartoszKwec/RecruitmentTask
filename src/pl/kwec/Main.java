package pl.kwec;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // 1. Kalkulator
        // 2. Przepisywanie tablicy - > potem <- i znów -> i tak w kółko
        // 3. Oblcizenie F(1,b)= a!- (a+b)^3;
        // 4. duże na małe małe na duże String reszta zostawiamy

        Calculator calculator=new Calculator();
        ChristmasTree christmasTree=new ChristmasTree();
        Scanner in= new Scanner(System.in);

        System.out.println("Zadania rekrutacyjne");
        System.out.println("-MENU-");
        System.out.println("1: Kalkulator");
        System.out.println("2: Choinka");
        System.out.println("3.");
        System.out.println(" Wybierz opcje :)");


        boolean correct=false;
        boolean correctCalculator=false;
        char choice;
        do{
            choice= in.next().charAt(0);
            if(Character.isDigit(choice)){
                correct=true;
            }else{
                System.out.println("Nie podałeś liczby, spróbuj ponownie");
            }

        }while(!correct);

        switch (choice){
            case '1':
                String sign;
                System.out.println("Wybrałes kalkulator");
                System.out.println("Prosze podać 1 liczbę");
                int a= in.nextInt();
                System.out.println("Prosze podać operator: +,-,*,/");

                do{
                    sign = String.valueOf(in.next().charAt(0));

                    if(sign.equals("+")||sign.equals("-")||sign.equals("*")||sign.equals("/")){
                        correctCalculator=true;
                    }else{
                        System.out.println("Nie podałeś prawidłowego znaku z posród *,+,-,/");
                    }

                }while(!correctCalculator);


                System.out.println("Prosze podac druga liczbę");
                int b = in.nextInt();
                System.out.println("Wynik: ");
                System.out.println(Calculator.Count(a,sign,b));
                break;
            case '2':
                System.out.println("Wybrałeś rysowanie choinki");
                System.out.println("Podaj znak z czego ma być zbudowana");
                char x = in.next().charAt(0);
                System.out.println("Podaj wysokosc choinki");
                int h=in.nextInt();
                ChristmasTree.draw(x,h);
                break;

        }

    }
}
