import java.util.*;

public class patter {

    static void pattern1(int N) {

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    static void pattern15(int N) {
        for (int i = 0; i <= 4; i++) {

            for (char ch = 'A'; ch <= 'A' + (5 - i - 1); ch++) {

                System.out.print(ch + " ");

            }

            System.out.println();
        }

    }

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        // for (int i = 0; i <= 5; i++) {

        // for (int j = 0; j <= i; j++) {

        // System.out.print("* ");

        // }
        // System.out.println();

        // }

        // for (int i = 1; i <= 5; i++) {

        // for (int j = 1; j <= i; j++) {

        // System.out.print(j + " ");

        // }

        // System.out.println();
        // }

        // for (int i = 1; i <= 5; i++) {

        // for (int j = 1; j <= i; j++) {

        // System.out.print(i + " ");

        // }

        // System.out.println();
        // }

        // for (int i = 0; i <= 5; i++) {

        // for (int j = 5; j > i; j--) {

        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i <= 5; i++) {

        // for (int j = 5; j > i; j--) {

        // System.out.print(5 - j + 1 + " ");
        // }
        // System.out.println();
        // }

        // for (int i = 6; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i <= 4; i++) {

        // // space

        // for (int j = 0; j <= 4 - i - 1; j++) {

        // System.out.print(" ");
        // }

        // // star

        // for (int j = 0; j < 2 * i + 1; j++) {
        // System.out.print("*");

        // }

        // // space

        // for (int j = 0; j <= 4 - i + 1; j++) {
        // System.out.print(" ");
        // }

        // System.out.println();
        // }

        // for (int i = 0; i <= 4; i++) {

        // // space

        // for (int j = 0; j <= i; j++) {

        // System.out.print(" ");
        // }

        // // star

        // for (int j = 0; j < 2 * 4 - (2 * i + 1); j++) {
        // System.out.print("*");

        // }

        // // space

        // for (int j = 0; j <= i; j++) {
        // System.out.print(" ");
        // }

        // System.out.println();
        // }

        // for (int i = 1; i <= 2 * 8 - 1; i++) {

        // int stars = i;

        // if (i > 8)
        // stars = 2 * 8 - i;

        // for (int j = 1; j <= stars; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // for (int i = 0; i <= 4; i++) {

        // for (int j = 0; j <= i; j++) {

        // if ((i + j) % 2 == 0) {

        // System.out.print("1");

        // } else {
        // System.out.print("0");
        // }
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= 4; i++) {

        // // numbers

        // for (int j = 1; j <= i; j++) {

        // System.out.print(j);

        // }

        // space

        // for (int j = 1; j <= 4 - i; j++) {
        // System.out.print(" ");
        // }

        // // space

        // for (int j = 0; j < 4 - i; j++) {

        // System.out.print(" ");
        // }

        // for (int j = i; j >= 1; j--) {

        // System.out.print(j);

        // }

        // System.out.println();

        // }

        // int n = 1;

        // for (int i = 1; i < 6; i++) {

        // for (int j = 1; j <= i; j++) {

        // System.out.print(n + " ");

        // n = n + 1;
        // }
        // System.out.println();
        // }

        // pattern 14
        // for (int i = 0; i <= 4; i++) {

        // for (char ch = 'A'; ch <= 'A' + i; ch++) {

        // System.out.print(ch + " ");

        // }

        // System.out.println();
        // }

        int N = 5;

        pattern1(N);

    }
}