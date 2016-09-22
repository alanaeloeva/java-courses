package myPack;

import java.util.Scanner;

/**
 * Created by home on 21.08.2016.
 */
public class Calculate{

    private double result;

    public void add(int...params){

        for(Integer param: params ){

            this.result+= param;
        }
    }

    public void div(int a, int b){

        this.result= a - b;
        }


    public void mult(int a, int b){
            this.result = a*b;

    }
    public void sub(int a, int b){

        if(b!=0){
            this.result = a/b;
        }else System.out.println("Деление на 0...");
        }


    public double getResult(){
        return this.result;
    }

    public void cleanResult(){

        this.result = 0;

    }
}
