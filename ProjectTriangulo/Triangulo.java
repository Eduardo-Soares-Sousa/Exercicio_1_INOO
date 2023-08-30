package ProjectTriangulo;

public class Triangulo{

    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public Triangulo(int ladoA, int ladoB, int ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    private boolean ehTriangulo(){
        return ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoA > ladoC;
    }

    public boolean Escaleno(){
        if(ehTriangulo() && ladoA != ladoB && ladoA != ladoC && ladoB !=ladoC){
            return true; 
        }
        return false;
    }

    public boolean Equilatero(){
        if(ehTriangulo()){
            return ladoA == ladoB && ladoA == ladoC;
        }
        return false;
    }

    public boolean Isoceles(){
        if(ehTriangulo() && ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC))){
            return true;
        }
        return false;
    }
}