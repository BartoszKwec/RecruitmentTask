package pl.kwec;

public class Calculator {


    static double Count(int a, String x, int b){
        double result=0;
        switch(x){
            case "+":{
                result=a+b;
                break;
            }
            case "-":{
                result=a-b;
                break;
            }
            case "*":{
                result=a*b;
                break;
            }
            case "/":{
                result=a/b;
                break;
            }

        }


        return result;
    }
}
