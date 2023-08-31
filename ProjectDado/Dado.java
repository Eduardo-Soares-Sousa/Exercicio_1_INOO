package ProjectDado;

import java.util.Random;

public class Dado{

    private int numeroFaces;
    private Random aleatorios;

    public Dado(int numeroFaces, Random aleatorios){
        this.numeroFaces = numeroFaces; 
        this.aleatorios = new Random();
    }

    public int jogar() {
        return aleatorios.nextInt(numeroFaces) + 1;
    }
}