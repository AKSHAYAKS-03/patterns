#include <stdio.h>

int main() {
    int n = 5; // Number of rows
    for (int i = 0; i < n; i++) {
        // Print spaces
        for (int j = 0; j < n - i - 1; j++) {
            printf("  ");
        }

        // Print increasing numbers
        for (int j = 0; j < 2 * i + 1; j++) {
            printf("* ");
        }

        // Print spaces
        for (int j = 0; j < n - i - 1; j++) {
            printf("  ");
        }

        printf("\n");
    }

    return 0;
}



        *         
      * * *       
    * * * * *     
  * * * * * * *   
* * * * * * * * * 
