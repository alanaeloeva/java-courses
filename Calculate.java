package myPack;

import java.util.Scanner;

/**
 * Created by home on 21.08.2016.
 */
public class Calculate{

    private int result;

    public void add(int...params){

        for(Integer param: params ){

            this.result+= param;
        }
    }

    public int getResult(){
        return this.result;
    }

    public void cleanResult(){

        this.result = 0;

    }
}
