package ProjectUSMoney;

public class MainUS {

    public static void main(String[] args) {

        USMoney x = new USMoney(5, 80);
        USMoney y = new USMoney(1, 90);

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        USMoney result = x.plus(y);
        System.out.println("Result of x.plus(y): " + result);
    }
 
}