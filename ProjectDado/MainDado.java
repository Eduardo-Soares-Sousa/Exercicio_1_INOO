package ProjectDado;

import java.util.Random;

public class MainDado {
    
    public static void main(String[] args){

        Random random = new Random();
        Dado dado = new Dado(6, random);

        for (int i = 0; i < 3; i++) {
            int sum = 0; 
            int num1 = dado.jogar();
            int num2 = dado.jogar();

            sum = num1 + num2;

            System.out.println("Lançamento " + (i + 1) + ": Dado 1: " + num1 + ", Dado 2: " + num2 + ", Soma: " + sum);
        }
    }
}
