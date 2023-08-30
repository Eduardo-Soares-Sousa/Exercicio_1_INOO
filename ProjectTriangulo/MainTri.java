package ProjectTriangulo;

import java.util.Scanner;

public class MainTri{

    public static void main(String[] args) {

        Triangulo verificar;
        Scanner lado = new Scanner(System.in);
        
        for(int i = 0; i <= 5; i++){
            int x, y, z;
            System.out.println("Digite os lados do triângulo: ");
            x = lado.nextInt();
            y = lado.nextInt();
            z = lado.nextInt();

            verificar = new Triangulo(x, y, z);
            
            if(verificar.Escaleno()){
                System.out.println("É um triângulo Escaleno");
            }else{
                if(verificar.Equilatero()){
                    System.out.println("É um triângulo Equilátrero");
                }else{
                    if(verificar.Isoceles()){
                        System.out.println("É um triângulo Isóceles");
                    }else{
                        System.out.println("Não é triângulo");
                    }
                }
            }
        }
    }
}