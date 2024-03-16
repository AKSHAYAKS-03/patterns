public class Solution {
    public static void symmetry(int n) {
       
        int sp = 0;
        for (int i = 0; i < n; i++) {
            // Print stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // Print spaces
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            sp += 2; // Increase space count for the next row
            System.out.println();
        }

        // Lower half of the pattern
        int sp2 = sp-1;
        for (int i = 1; i <= n; i++) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces
            for (int j = 1; j < sp2; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            sp2 -= 2; // Decrease space count for the next row
            System.out.println();
        }
    }
}


n=4

********
***  ***
**    **
*      *
*      *
**    **
***  ***
********
