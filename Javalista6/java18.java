package Javalista6;

public class java18 {public class Main {
    public static void main(String[] args) {

        double cidadeA = 1000;
        double cidadeB = 1500;
        int anos = 0;

        while (cidadeA <= cidadeB) {
            cidadeA = cidadeA + (cidadeA * 0.02);
            cidadeB = cidadeB + (cidadeB * 0.01);

            anos++;
        }

        System.out.println("A cidade A passará a cidade B em " + anos + " anos.");
        System.out.println("População da cidade A: " + cidadeA);
        System.out.println("População da cidade B: " + cidadeB);
    }
}
}
