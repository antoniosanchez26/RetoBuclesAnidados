package es.asdj;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j >= i) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }*/
    }
}
