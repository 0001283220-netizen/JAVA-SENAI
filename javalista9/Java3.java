package javalista9;

import java.util.Scanner;

public class Java3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um numero N: ");
            int N = sc.nextInt();

            for (int i = 0; i <= N; i++) {
                System.out.println(i);
            }

            sc.close();
        }
    }

