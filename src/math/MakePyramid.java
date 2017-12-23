package math;

public class MakePyramid {
    public static void main(String[] args) {

        int x = 10;
        int y = 0;
        int z = 0;

        for (x = 10; x > 0; x--) {
            y = 0;
            for (y = 0; y < x; y++) {
                System.out.print(" ");

            }
            for (z = y; z < 10; z++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

}

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here




